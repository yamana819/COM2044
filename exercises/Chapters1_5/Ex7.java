package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int passes=0,failures=0,counter=1;
        while (counter<=10){
            System.out.print("Enter the result (1=pass,2=fail):");
            int result = input.nextInt();
            if (result==1){
                passes++;
            }
            else if (result==2){
                failures++;
            }
            counter++;
        }
        System.out.println(passes+" Students passed "+failures+" Student failed.");
        if (passes>8){
            System.out.println("Bonus to instructor.");
        }
    }
}
