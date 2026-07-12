package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the account owner's name:");
        String owner = input.nextLine();
        System.out.print("Enter an initial balance:");
        double balance = input.nextDouble();
        Account newAccount = new Account(owner,balance);
        int choice = 0;
        while (choice != 4){
            System.out.println("1-Deposit Money.");
            System.out.println("2-Withdrawal Money.");
            System.out.println("3-Display Account Information.");
            System.out.println("4-Exit.");
            System.out.print("Enter your choice:");
            choice = input.nextInt();
            if (choice == 1){
                System.out.print("Enter a deposit amount:");
                double depositAmount = input.nextDouble();
                newAccount.deposit(depositAmount);
            }
            else if (choice == 2){
                System.out.print("Enter a withdrawal amount:");
                double withdrawalAmount = input.nextDouble();
                newAccount.withdraw(withdrawalAmount);
            }
            else if (choice == 3){
                System.out.println("Account Owner Name:"+newAccount.getName());
                System.out.println("Account Balance:"+newAccount.getBalance());
            }
        }
    }
}
