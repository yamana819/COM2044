package exercises.Chapter_20;

import java.util.NoSuchElementException;

public class StackTest2 {
    public static void main(String[] args) {
        Double[] doubles = {12.2,232.2,11.55,321.42};
        Integer[] integers = {3,41,232,12,98,42};
        Stack<Integer> integerStack = new Stack<>();
        Stack<Double> doubleStack = new Stack<>();
        testPush(integerStack,integers);
        testPop(integerStack);
        testPush(doubleStack,doubles);
        testPop(doubleStack);
    }
    public static <E> void testPush(Stack<E> stack,E[] elements){
        for (E element:elements){
            stack.push(element);
        }
    }
    public static <E> void testPop(Stack<E> stack){
        try {
            E popValue;
            while (true){
                popValue=stack.pop();
                System.out.println("Popping:"+popValue);
            }
        }catch (NoSuchElementException exception){
            exception.printStackTrace();
        }
    }
}
