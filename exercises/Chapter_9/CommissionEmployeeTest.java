package exercises.Chapter_9;

public class CommissionEmployeeTest {
    public static void main(String[] args){
        CommissionEmployee employee1=new CommissionEmployee("Ahmet","Yaman","12394132212",10000,0.06);
        System.out.println("First Name:"+employee1.getFirstName());
        System.out.println("Last Name:"+employee1.getLastName());
        System.out.println("Social Security Number:"+employee1.getSocialSecurityNumber());
        System.out.println("Gross Sales:"+employee1.getGrossSales());
        System.out.println("Commission Rate:"+employee1.getCommissionRate());
        System.out.println("Information printed by toString");
        System.out.println(employee1);
    }
}
