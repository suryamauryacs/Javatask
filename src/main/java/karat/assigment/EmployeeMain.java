package karat.assigment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Surya", 90000, 10),
                new Employee(2, "Ravi", 75000, 20),
                new Employee(3, "Sneha", 82000, 30),
                new Employee(4, "Amit", 95000, 40),
                new Employee(5, "Rahul", 70000, 20)
        );


        System.out.println(topThreeSalaries(employees));

        System.out.println(thirdHighestSalary(employees));

    }


    public static String thirdHighestSalary(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2)
                .map(Employee::getEName)
                .findFirst()
                .orElse("No employee found");
    }




    public static List<String> topThreeSalaries(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getEName)
                .toList();
    }



}
