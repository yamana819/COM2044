package exercises.Chapter_6;

public class Department {
    public static int numberOfWorkers=0;
    private String name;
    public Department(String name){
        this.name=name;
        numberOfWorkers++;
    }
}

class DepartmentTest{
    public static void main(String[] args) {
        Department dpt1 = new Department("Admin");
        System.out.println(Department.numberOfWorkers);
        Department dpt2 = new Department("Finance");
        System.out.println(Department.numberOfWorkers);
        Department dpt3 = new Department("Software");
        System.out.println(Department.numberOfWorkers);
    }
}
