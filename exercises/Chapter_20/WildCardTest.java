package exercises.Chapter_20;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        List<Integer> integerList=new ArrayList<>();
        for (Integer element:integers){
            integerList.add(element);
        }
        System.out.println("Integer list contains:"+integerList);
        System.out.println("Sum:"+sum(integerList));
        Double[] doubles = {3.2,5.3,6.4};
        List<Double> doubleList = new ArrayList<>();
        for (Double element:doubles){
            doubleList.add(element);
        }
        System.out.println("Double list contains:"+doubleList);
        System.out.println("Sum:"+sum(doubleList));
        Number[] numbers = {1,5,3.2,4.6,21.2};
        List<Number> numberList = new ArrayList<>();
        for (Number element:numbers){
            numberList.add(element);
        }
        System.out.println("Number list contains:"+numberList);
        System.out.println("Sum:"+sum(numberList));
    }
    public static double sum(List<? extends Number> list){
        double total=0;
        for (Number element:list){
            total+=element.doubleValue();
        }
        return total;
    }
}
