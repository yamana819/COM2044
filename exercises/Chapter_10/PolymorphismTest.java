package exercises.Chapter_10;
import exercises.Chapter_9.*;

public class PolymorphismTest {
    public static void main(String[] args){
        CommissionEmployee employee1=new CommissionEmployee("Furkan","Yaman","12312312321",100000,0.06);
        BasePlusCommissionEmployee employee2= new BasePlusCommissionEmployee("Ahmet","Yaman","321321321321",5000,0.04,300);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("Employee information using polymorphism.");
        CommissionEmployee employee3 = employee2;
        System.out.println(employee3);
    }
}
