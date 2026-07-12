package exercises.Chapter_10;

public abstract class Calculation {
    public abstract int calculate(int a,int b);
}

class Addition extends Calculation{
    @Override
    public int calculate(int a,int b){
        return a+b;
    }
}

class Substraction extends Calculation {
    @Override
    public int calculate(int a,int b){
        return a-b;
    }
}

class CalculationTest {
    public static void main(String[] args) {
        Calculation addition = new Addition();
        Calculation substraction = new Substraction();
        System.out.println(addition.calculate(15,5));
        System.out.println(substraction.calculate(15,5));
    }
}
