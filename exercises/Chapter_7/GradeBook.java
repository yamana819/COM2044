package exercises.Chapter_7;

public class GradeBook {
    private String courseName;
    private int[] grades;
    public GradeBook(String courseName,int[] grades){
        this.grades=grades;
        this.courseName=courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrades(){
        outputGrades();
        System.out.println("Class Average:"+getAverage());
        System.out.println("Lowest Grade:"+getMinimum()+" Highest grade:"+getMaximum());
        outputBarChart();
    }
    public int getMinimum(){
        int minimum = grades[0];
        for (int x:grades){
            if (x<minimum){
                minimum=x;
            }
        }
        return minimum;
    }
    public int getMaximum(){
        int maximum=grades[0];
        for (int x:grades){
            if (x>maximum){
                maximum=x;
            }
        }
        return maximum;
    }
    public double getAverage(){
        int total = 0;
        for (int x:grades){
            total+=x;
        }
        return (double) total/grades.length;
    }
    public void outputBarChart(){
        int[] frequency = new int[11];
        System.out.println("Grade Distribution:");
        for (int x:grades){
            frequency[x/10]++;
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
        for (int i=0;i<grades.length;i++){
            System.out.println("Student->"+(i+1)+" Grade:"+grades[i]);
        }
    }
}
