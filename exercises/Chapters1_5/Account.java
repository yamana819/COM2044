package exercises.Chapters1_5;
import java.util.Scanner;

class Account {
    private String name;
    private double balance;
    public Account(String owner_name,double init_balance){
        this.name=owner_name;
        if (init_balance<0){
            this.balance=0.0;
        }else {
            this.balance=init_balance;
        }
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Invalid deposit amount!");
        }else {
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if (amount>0){
            if (amount<=balance){
                balance-=amount;
            }else{
                System.out.println("Insufficient balance.");
            }
        }else {
            System.out.println("Only positive amount of withdrawal is allowed.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
}