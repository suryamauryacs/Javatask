package com.Stream.program.Stream;


import java.util.*;
import java.util.function.*;

import static java.util.stream.Collectors.*;

public class StudentMain {
    static List<Person> people = List.of(
            new Person("Surya",24, "Pune"),
            new Person("Ananya", 27, "Pune"),
            new Person("Ravi", 31, "Bengaluru"),
            new Person("Meera", 27, "Hyderabad"),
            new Person("Arjun", 24, "Pune"),
            new Person("Kriti", 31, "Noida")

    );

    public static void main(String[] args) {
        my_Filter();
        ex_collectToMap();
        ex3_groupbyingByCity();

    }

    //Filter + Map: Names of people in Pune older than 25
    public static void my_Filter(){
        List<String> names = people.stream()
        .filter(p -> p.city.equals("Pune") && p.age > 25)
                .map(p -> p.name)
                .toList();
        System.out.println("EXample:1 "+names);
    }

    // toMap with merge: Map name → age (keep max age if duplicate name)
    public static void ex_collectToMap(){
        Map<String, Integer> nameToAge = people.stream().collect(toMap(p->p.name, p->p.age,Integer::max));
        System.out.println("ex2:" + nameToAge);

    }

    //3)  groupingBy: City → list of names
    public static void ex3_groupbyingByCity(){
        Map<String , List<String>> cityToName = people.stream().collect(
                groupingBy(p -> p.city, mapping(p -> p.name, toList())));
        System.out.println(cityToName);

    }



///   /4) partitioningBy: Partition by age ≥ 27

    static void ex4_partitionByAge() {
        Map<Boolean, List<Person>> parts = people.stream()
                .collect(partitioningBy(p -> p.age >= 27));
        System.out.println("ex4: >=27 => " + parts.get(true));
        System.out.println("     <27  => " + parts.get(false));
    }

//    5) Top-N with Comparator (stable): Top 2 oldest, tie-breaker by name

    static void ex5_topNByComparator() {
        List<Person> top2 = people.stream()
                .sorted(Comparator.comparingInt((Person p) -> p.age).reversed()
                        .thenComparing(p -> p.name))
                .limit(2)
                .toList();
        System.out.println("ex5: " + top2);
    }


//    6) reduce: Sum of ages (two ways)


    static void ex6_reduceSumAges() {
        int sum1 = people.stream().map(p -> p.age).reduce(0, Integer::sum);
        int sum2 = people.stream().mapToInt(p -> p.age).sum(); // preferred
        System.out.println("ex6: " + sum1 + " / " + sum2);
    }

//    7) flatMap: Unique words from sentences, lowercase sorted

    static void ex7_flatMapWords() {
        List<String> sentences = List.of("Hello Pune", "Pune is great", "Java Streams in Pune");
        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .toList();
        System.out.println("ex7: " + words);
    }

//    8) distinct + counting: How many unique ages?

    static void ex8_distinctCounting() {
        long uniqueAges = people.stream().map(p -> p.age).distinct().count();
        System.out.println("ex8: unique ages = " + uniqueAges);
    }

//    9) findFirst, findAny, Optional: Find someone from Hyderabad

    static void ex9_optionalFind() {
        Optional<Person> anyHyd = people.stream()
                .filter(p -> p.city.equals("Hyderabad"))
                .findAny();
        System.out.println("ex9: " + anyHyd.map(p -> p.name).orElse("NONE"));
    }

//    10) joining: CSV of names sorted by age asc then name

    static void ex10_joiningStrings() {
        String csv = people.stream()
                .sorted(Comparator.comparingInt((Person p) -> p.age).thenComparing(p -> p.name))
                .map(p -> p.name)
                .collect(joining(","));
        System.out.println("ex10: " + csv);
    }

//    11) Custom downstream collector: City → average age

    static void ex11_customCollectorAverage() {
        Map<String, Double> avgByCity = people.stream()
                .collect(groupingBy(p -> p.city, averagingInt(p -> p.age)));
        System.out.println("ex11: " + avgByCity);
    }

//    12) parallelStream: Sum ages per city (demo – watch side effects!)
    static void ex12_parallelStream() {
        Map<String, Integer> sumAges = people.parallelStream()
                .collect(groupingByConcurrent(p -> p.city, summingInt(p -> p.age)));
        System.out.println("ex12: " + sumAges);
    }

//    13) Multi-step pipeline: Sort by city then group names by age

    static void ex13_stableSortThenGroup() {
        Map<Integer, List<String>> ageToNames = people.stream()
                .sorted(Comparator.comparing((Person p) -> p.city).thenComparingInt(p -> p.age))
                .collect(groupingBy(p -> p.age, mapping(p -> p.name, toList())));
        System.out.println("ex13: " + ageToNames);
    }

//    14) Function-based utilities (Predicate, Function, BiFunction, Supplier, Consumer)
static void ex14_functionalInterfaces() {
    Predicate<Person> isPune = p -> "Pune".equals(p.city);
    Function<Person, String> toLabel = p -> p.name + "-" + p.age;
    BiFunction<Person, Integer, Person> bumpAge = (p, by) -> new Person(p.name, p.age + by, p.city);
    Supplier<Person> defaultPerson = () -> new Person("Newbie", 0, "Unknown");
    Consumer<Person> printer = p -> System.out.print(p + " | ");

    // Use them in Stream:
    List<String> puneLabels = people.stream().filter(isPune).map(toLabel).toList();
    System.out.println("ex14: " + puneLabels);

    // Create bumped list (immutable transform)
    List<Person> bumped = people.stream().map(p -> bumpAge.apply(p, 1)).toList();
    System.out.print("     bumped: "); bumped.forEach(printer); System.out.println();

    // Fallback via Supplier
    Person fallback = people.stream().filter(p -> p.age > 40).findFirst().orElseGet(defaultPerson);
    System.out.println("     fallback: " + fallback);
}

//15) Stream vs Imperative: Are all Pune residents ≥ 24?
static void ex15_streamVsImperative() {
    // Stream approach
    boolean allGte24 = people.stream()
            .filter(p -> p.city.equals("Pune"))
            .allMatch(p -> p.age >= 24);

    // Imperative approach (for comparison)
    boolean allGte24Imp = true;
    for (Person p : people) {
        if (p.city.equals("Pune") && p.age < 24) { allGte24Imp = false; break; }
    }
    System.out.println("ex15: " + allGte24 + " / " + allGte24Imp);
    }





}
