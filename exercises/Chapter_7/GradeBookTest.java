package exercises.Chapter_7;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] grades = {87,68,94,100,83,78,85,91,76,87};
        GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming",grades);
        System.out.println("Welcome to the grade book for "+gradeBook.getCourseName());
        gradeBook.processGrades();
    }
}
