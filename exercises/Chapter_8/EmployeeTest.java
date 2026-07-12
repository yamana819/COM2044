package exercises.Chapter_8;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(15,10,2004);
        Date hire = new Date(13,9,2027);
        Employee furkan = new Employee("Ahmet Furkan","Yaman",birth,hire);
        System.out.println(furkan);
    }
}
