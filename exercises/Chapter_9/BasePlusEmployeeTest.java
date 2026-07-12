package exercises.Chapter_9;

public class BasePlusEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee1=new BasePlusCommissionEmployee("Bob","Snow",
                "333-33-333",5000.0,0.04,300.0);
        System.out.println(employee1);
        System.out.println(employee1.earnings());
    }
}
