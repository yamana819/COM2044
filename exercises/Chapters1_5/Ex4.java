package exercises.Chapters1_5;

public class Ex4 {
    public static void main(String[] args){
        Student student1 = new Student("Furkan",95.70);
        Student student2 = new Student("Aleyna",72.40);
        System.out.println("Letter grade of "+student1.getName()+" is "+student1.getStudentGrade());
        System.out.println("Letter grade of "+student2.getName()+" is "+student2.getStudentGrade());
    }
}
