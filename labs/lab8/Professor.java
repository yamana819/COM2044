
public class Professor extends AcademicStaff {
    private int publishedPapers;

    public Professor(int id, String name, String title, double baseSalary, int publishedPapers) {
        super(id, name, title, baseSalary);
        this.publishedPapers = publishedPapers;
    }

    public int getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(int publishedPapers) {
        this.publishedPapers = publishedPapers;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (publishedPapers * 1000);
    }

    @Override
    public void displayInfo() {
        System.out.println("Professor: " + getId() + " | " + getName() + " | " + title + " | Salary: " + calculateSalary());
    }
}