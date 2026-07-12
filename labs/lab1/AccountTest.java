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

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name=scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance=scanner.nextDouble();
        Account my_account=new Account(name,balance);
        int choice=0;
        while (choice != 4){
            System.out.println("1-Deposit Money");
            System.out.println("2-Withdraw Money");
            System.out.println("3-Show Balance");
            System.out.println("4-Exit");
            System.out.print("Select option:");
            choice=scanner.nextInt();
            if (choice==1){
                System.out.print("Enter deposit amount:");
                double deposit_amount=scanner.nextDouble();
                my_account.deposit(deposit_amount);
            }else if (choice==2){
                System.out.print("Enter withdrawal amount:");
                double withdrawal_amount=scanner.nextDouble();
                my_account.withdraw(withdrawal_amount);
            }else if (choice==3){
                System.out.println("Account Owner: " + my_account.getName());
                System.out.println("Current Balance: " + my_account.getBalance());
            }
            else if (choice==4){
                System.out.println("Program is terminated.");
            }else{
                System.out.println("Invalid choice,try again.");
            }
        }
        scanner.close();
    }
}