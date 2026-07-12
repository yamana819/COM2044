import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive odd number:");
            n=scanner.nextInt();
            if (n<=0 || n%2==0){
                System.out.println("Invalid input! Number must be positive and odd.");
            }
        } while (n<=0 || n%2==0);
        System.out.println();
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
            } else {
                for (int j = 1;j <= (2 * i - 1);
                j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if (i%2!=0){
                for (int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for (int j=i-1;j>=1;j--){
                    System.out.print(j);
                }
            }else {
                for (int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
