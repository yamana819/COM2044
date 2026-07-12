package exercises.Chapter_10;

public class BasePlusCommissionEmployee1 extends CommissionEmployee1 {
    double baseSalary;
    double commissionRate;
    double grossSales;
    public BasePlusCommissionEmployee1(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be greater than or equal to 0.");
        }
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be greater than or equal to 0.");
        }
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    @Override
    public double earnings(){
        return baseSalary+super.earnings();
    }
    @Override
    public String toString(){
        return super.toString()+"\nBaseSalaried Base Salary:"+baseSalary;
    }
}
