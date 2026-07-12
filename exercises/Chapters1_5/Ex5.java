package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        while (counter<10){
            System.out.print("Enter grade:");
            int grade = input.nextInt();
            total+=grade;
            counter++;
        }
        double average = (double) total/counter;
        System.out.println("Total of all grades is "+total);
        System.out.printf("Average is %.2f",average);
    }
}
