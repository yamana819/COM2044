package exercises.Chapter_6;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("Square of 7 is:"+square(7));
        System.out.printf("Square of 7.5 is:%.2f\n",square(7.5));
    }
    public static int square(int x){
        System.out.println("Called the method square with "+x);
        return x*x;
    }
    public static double square(double x){
        System.out.printf("Called the method square with %.2f\n",x);
        return x*x;
    }
}
