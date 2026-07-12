package exercises.Chapter_20;

import java.util.ArrayList;
import java.util.List;

public class TotalNumbers {
    public static void main(String[] args) {
        Number[] numbers={12.2,1,2.4,3,3.5};
        List<Number> numberList = new ArrayList<>();
        for (Number number:numbers){
            numberList.add(number);
        }
        System.out.println(numberList);
        System.out.println(sum(numberList));
    }
    public static Number sum(List<Number> list){
        double sum=0;
        for (Number number:list){
            sum+=number.doubleValue();
        }
        return sum;
    }
}
