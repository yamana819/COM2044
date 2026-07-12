package exercises.Chapter_7;

public class VarArgsTest {
    public static void main(String[] args) {
        double d1=10.0,d2=20.0,d3=30.0,d4=40.0;
        System.out.println("Average of d1 and d2 "+average(d1,d2));
        System.out.println("Average of d1,d2 and d3 "+average(d1,d2,d3));
        System.out.println("Average of d1,d2,d3 and d4 "+average(d1,d2,d3,d4));
    }
    public static double average(double... numbers){
        double total=0.0;
        for (double d:numbers){
            total+=d;
        }
        return total/numbers.length;
    }
}
