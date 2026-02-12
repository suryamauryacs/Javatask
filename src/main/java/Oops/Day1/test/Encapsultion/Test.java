package Oops.Day1.test.Encapsultion;

public class Test {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.names = "Ram";
//        //student.age = 15;
//        student.rollNumber = 21;

       // student.setAge(15);
//        System.out.println();


//        BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(-100);
//        bankAccount.withdraw(100);
//        bankAccount.deposit(1000);
//        bankAccount.withdraw(200);
//        System.out.println(bankAccount.getBalance());

        Student student = new Student("surya",21,28);
        System.out.println(student.getNames());
        System.out.println(student.getAge());


    }
}
