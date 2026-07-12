package exercises.Chapter_10;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hours){
        super(firstName,lastName,socialSecurityNumber);
        if (wage<0.0){
            throw new IllegalArgumentException("Wage must be >=0");
        }
        if (hours<0.0 || hours>168.0){
            throw new IllegalArgumentException("Hours must be >=0 and <=168");
        }
        this.hours=hours;
        this.wage=wage;
    }
    public void setWage(double wage){
        this.wage=wage;
    }
    public void setHours(double hours){
        this.hours=hours;
    }
    public double getWage(){
        return wage;
    }
    public double getHours(){
        return hours;
    }
    @Override
    public double earnings(){
        if (hours<=40.0){
            return wage*hours;
        }
        else {
            return (40*wage)+((hours-40)*wage*1.5);
        }
    }
    @Override
    public String toString(){
        return super.toString()+"Hourly Employee Hourly Wage:"+wage;
    }
}
