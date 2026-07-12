package exercises.Chapter_10;

public class CommissionEmployee1 extends Employee {
    double grossSales;
    double commissionRate;
    public CommissionEmployee1(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        if (grossSales<0.0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.");
        }
        if (commissionRate<=0.0 || commissionRate>=1.0){
            throw new IllegalArgumentException("Commission rate must be greater than 0 and smaller than 1.");
        }
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }
    public void setGrossSales(double grossSales){
        if (grossSales<0.0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.");
        }
        this.grossSales=grossSales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double commissionRate){
        if (commissionRate<=0.0 || commissionRate>1.0){
            throw new IllegalArgumentException("Commission rate must be greater than 0 and smaller than 1.");
        }
        this.commissionRate=commissionRate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    @Override
    public double earnings(){
        return grossSales*commissionRate;
    }
    @Override
    public String toString(){
        return super.toString()+"Commission Employee Gross Sales:"+grossSales+" CommissionRate:"+commissionRate;
    }
}
