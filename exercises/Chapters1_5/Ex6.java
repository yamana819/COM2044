package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total=0,grade,gradeCounter=0;
        System.out.print("Enter grade(-1 to terminate program):");
        grade = input.nextInt();
        while (grade != -1){
            total+=grade;
            gradeCounter++;
            System.out.print("Enter grade(-1 to terminate program):");
            grade = input.nextInt();
        }
        if (gradeCounter!=0){
            double average = (double) total/gradeCounter;
            System.out.printf("The total grade is:%d\nAverage is:%.2f",total,average);
        }else {
            System.out.println("No grades were entered.");
        }
    }
}
