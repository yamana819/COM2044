package exercises.Chapter_8;

public class Employee1 {
    public static int count;
    private String firstName;
    private String lastName;
    public Employee1(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        count++;
        System.out.println("Constructor for employee object count:"+count);
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public static int getCount(){
        return count;
    }
}
