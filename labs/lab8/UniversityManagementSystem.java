
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        try {
            Student s1 = new Student(1001, "Furkan Yilmaz", "Software Engineering", 3.85);
            Student s2 = new Student(1002, "Zekeriya Kaya", "Computer Engineering", 3.40);
            Student s3 = new Student(1003, "Burak Demir", "Software Engineering", 3.92);

            Professor p1 = new Professor(2001, "Ahmet Yildiz", "Prof. Dr.", 25000.0, 10);
            Professor p2 = new Professor(2002, "Mustafa Celik", "Assoc. Prof.", 24000.0, 8);

            ResearchAssistant r1 = new ResearchAssistant(3001, "Kerem Sahin", "Res. Asst.", 20000.0, 4);
            ResearchAssistant r2 = new ResearchAssistant(3002, "Sarp Ozturk", "Res. Asst.", 19000.0, 5);

            people.add(s1);
            people.add(s2);
            people.add(s3);
            people.add(p1);
            people.add(p2);
            people.add(r1);
            people.add(r2);

            students.add(s1);
            students.add(s2);
            students.add(s3);

            System.out.println("=== University Members ===");
            for (Person p : people) {
                p.displayInfo();
            }

            System.out.println("\n=== Academic Staff Salaries ===");
            for (Person p : people) {
                if (p instanceof AcademicStaff) {
                    AcademicStaff staff = (AcademicStaff) p;
                    System.out.println(staff.getName() + " salary: " + staff.calculateSalary());
                }
            }

            Collections.sort(students);

            System.out.println("\n=== Students Sorted by GPA ===");
            for (Student s : students) {
                System.out.println(s.getName() + " " + s.getGpa());
            }

            try (FileWriter writer = new FileWriter("students.txt")) {
                for (Student s : students) {
                    writer.write(s.getId() + "," + s.getName() + "," + s.getDepartment() + "," + s.getGpa() + "\n");
                }
                System.out.println("\nStudent information was written to students.txt successfully.");
            } catch (IOException e) {
                System.out.println("File writing error: " + e.getMessage());
            }

            System.out.println("\n=== Testing Invalid GPA ===");
            Student invalidStudent = new Student(1004, "Veli", "Electrical Engineering", 4.5);

        } catch (InvalidGPAException e) {
            System.out.println(e.getMessage());
        }
    }
}