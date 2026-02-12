package Oops.Day1.test.Encapsultion;

public class BankAccount {
    private long accountNumber;

    private double balance;

    public double getBalance(){
        return balance;
    }



    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: "+ amount);
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }

    }

    public void withdraw(double amount ){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw "+ amount);
        }
        else{
            System.out.println("Invalid amount or Insufficient balance");
        }
    }

    public long getAccountNumber(){
        return accountNumber;
    }
}
