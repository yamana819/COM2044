package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int total=0;
        int gradeCounter=0;
        int aCounter=0,bCounter=0,cCounter=0,dCounter=0,fCounter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grades in the range 1-100 (Press EOF to terminate program.):");
        while (input.hasNext()){
            int grade=input.nextInt();
            ++gradeCounter;
            total+=grade;
            switch (grade/10){
                case 9:
                case 10:
                    aCounter++;
                    break;
                case 8:
                    bCounter++;
                    break;
                case 7:
                    cCounter++;
                    break;
                case 6:
                    dCounter++;
                    break;
                default:
                    fCounter++;
                    break;
            }
        }
        if (gradeCounter>0){
            double average=(double) total/gradeCounter;
            System.out.printf("Average is:%.2f\n",average);
        }
        System.out.printf("Number of students:%d\nTotal Grade:%d\nA:%d,B:%d,C:%d,D:%d,F:%d\n",gradeCounter,total,aCounter,bCounter,cCounter,dCounter,fCounter);
    }
}
