package exercises.Chapter_20;

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        double[] doubles = {33.21,42.34,12.81,92.15};
        int[] integers = {1,23,4,4,56,12,556};
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();
        testPushDouble(doubleStack,doubles);
        testPopDouble(doubleStack);
        testPushInteger(integerStack,integers);
        testPopInteger(integerStack);
    }
    private static void testPushDouble(Stack<Double> stack,double[] values){
        for (double value:values){
            stack.push(value);
        }
    }
    private static void testPopDouble(Stack<Double> stack){
        try {
            double popValue;
            while (true){
                popValue=stack.pop();
                System.out.println("Popping:"+popValue);
            }
        } catch (NoSuchElementException exception){
            exception.printStackTrace();
        }
    }
    private static void testPushInteger(Stack<Integer> stack,int[] values){
        for (int value:values){
            stack.push(value);
        }
    }
    private static void testPopInteger(Stack<Integer> stack){
        try {
            int popValue;
            while (true){
                popValue=stack.pop();
                System.out.println("Popping:"+popValue);
            }
        } catch (NoSuchElementException exception){
            exception.printStackTrace();
        }
    }
}
