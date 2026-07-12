
public class Student extends Person implements Comparable<Student> {
    private String department;
    private double gpa;

    public Student(int id, String name, String department, double gpa) throws InvalidGPAException {
        super(id, name);
        this.department = department;
        if (gpa < 0 || gpa > 4) {
            throw new InvalidGPAException("Error: GPA must be between 0 and 4.");
        }
        this.gpa = gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) throws InvalidGPAException {
        if (gpa < 0 || gpa > 4) {
            throw new InvalidGPAException("Error: GPA must be between 0 and 4.");
        }
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getId() + " | " + getName() + " | " + department + " | GPA: " + gpa);
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }
}
