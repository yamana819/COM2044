package exercises.Chapter_6;

public class Calculation {
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}

class CalculationTest{
    public static void main(String[] args) {
        int result = Calculation.add(5,10);
        System.out.println(result);
        result = Calculation.multiply(5,10);
        System.out.println(result);
    }
}
