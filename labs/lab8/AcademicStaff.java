
public class AcademicStaff extends Person implements Payable {
    protected String title;
    protected double baseSalary;

    public AcademicStaff(int id, String name, String title, double baseSalary) {
        super(id, name);
        this.title = title;
        this.baseSalary = baseSalary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Academic Staff: " + getId() + " | " + getName() + " | " + title + " | Salary: " + calculateSalary());
    }
}