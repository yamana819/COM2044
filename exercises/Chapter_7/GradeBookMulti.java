package exercises.Chapter_7;

public class GradeBookMulti {
    private String courseName;
    private int[][] grades;

    public GradeBookMulti(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void processGrades() {
        outputGrades();
        System.out.println("Lowest grade in grade book is " + getMinimum());
        System.out.println("Highest grade in grade book is " + getMaximum());
        outputBarChart();
    }

    public int getMinimum() {
        int minimum = grades[0][0];
        for (int[] row : grades) {
            for (int grade : row) {
                if (grade < minimum) {
                    minimum = grade;
                }
            }
        }
        return minimum;
    }

    public int getMaximum() {
        int maximum = grades[0][0];
        for (int[] row : grades) {
            for (int grade : row) {
                if (grade < maximum) {
                    maximum = grade;
                }
            }
        }
        return maximum;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int x : setOfGrades) {
            total += x;
        }
        return (double) total / setOfGrades.length;
    }
    public void outputBarChart(){
        System.out.println("Overall grade distribution:");
        int[] frequency = new int[11];
        for (int[] row:grades){
            for (int grade:row){
                frequency[grade/10]++;
            }
        }
        for (int i=0;i<frequency.length;i++){
            if (i==10){
                System.out.printf("%5d: ",100);
            }
            else {
                System.out.printf("%02d-%02d: ",i*10,i*10+9);
            }
            for (int j=0;j<frequency[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("                ");
        for (int test=0;test<grades[0].length;test++){
            System.out.printf("Test %d ",test+1);
        }
        System.out.println("Average");
        for (int student=0;student<grades.length;student++){
            System.out.printf("Student %2d",student+1);
            for (int test:grades[student]){
                System.out.printf("%8d",test);
            }
            double average=getAverage(grades[student]);
            System.out.printf("%9.2f%n",average);
        }
    }
}