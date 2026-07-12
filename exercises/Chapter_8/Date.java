package exercises.Chapter_8;

public class Date {
    private int day;
    private int month;
    private int year;
    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public Date(int day,int month,int year){
        if (month<=0 || month>12){
            throw new IllegalArgumentException("Month must be 1-12.");
        }
        if (day<=0 || day>daysPerMonth[month] && !(month==2 && day==29)){
            throw new IllegalArgumentException("Day out of range for specified month.");
        }
        if (month==2 && day==29 && !(year%400==0 || (year%4==0 && year%100!=0))){
            throw new IllegalArgumentException("Day is out of range for specified year.");
        }
        this.day=day;
        this.month=month;
        this.year=year;
        System.out.println("Date object constructor for "+this);
    }
    public String toString(){
        return (day+"/"+month+"/"+year);
    }
}
