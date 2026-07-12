package exercises.Chapter_7;

public class GradeBookMultiTest {
    public static void main(String[] args) {
        int[][] gradesArray = {{88,92,95},{57,65,73},{77,82,57},{92,55,49},{100,100,100}};
        GradeBookMulti myGradeBookMulti = new GradeBookMulti("CS101 Introduction to Java Programming",gradesArray);
        System.out.println("Welcome to gradee book for "+myGradeBookMulti.getCourseName());
        myGradeBookMulti.processGrades();
    }
}
