package exercises.Chapter_10;

import exercises.Chapter_9.BasePlusCommissionEmployee;
import exercises.Chapter_9.CommissionEmployee;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Ahmet","Yaman","1312312321",800.0);
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Furkan","Yaman","231312321321",16.75,40.0);
        CommissionEmployee1 commissionEmployee=new CommissionEmployee1("Zekeriya","Burak","32121321312",10000,0.06);
        BasePlusCommissionEmployee1 basePlusCommissionEmployee1=new BasePlusCommissionEmployee1("Sarp","Matas","23132123111",5000,0.04,300);
        Employee[] employees=new Employee[4];
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee1;
        for (Employee employee:employees){
            System.out.println(employee);
            if (employee instanceof BasePlusCommissionEmployee1){
                BasePlusCommissionEmployee1 currentEmployee = (BasePlusCommissionEmployee1) employee;
                currentEmployee.setBaseSalary(currentEmployee.getBaseSalary()*1.10);
                System.out.println("New base salary with %10 increase is "+((BasePlusCommissionEmployee1) employee).getBaseSalary());
            }
            System.out.println("Earned:"+employee.earnings());
            System.out.println();
        }
        for (int i=0;i<employees.length;i++){
            System.out.printf("Employee %d is a %s\n",i,employees[i].getClass().getName());
        }
    }
}
