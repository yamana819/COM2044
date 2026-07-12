package exercises.Chapter_16;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;


public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black","green","yellow","blue","violet","silver"};
        List<String> list1 = new LinkedList<>();
        for (String color:colors){
            list1.add(color);
        }
        String[] colors2= {"gold","white","brown","blue","gray","silver"};
        List<String> list2 = new LinkedList<>();
        for (String color:colors2){
            list2.add(color);
        }
        list1.addAll(list2);
        list2=null;
        printList(list1);
        convertToUpperCase(list1);
        printList(list1);
        System.out.println("Removing the elements 4 to 6");
        removeItems(list1,4,7);
        printList(list1);
        printReversedList(list1);
    }
    private static void convertToUpperCase(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
    private static void printList(List<String> list){
        for (String color:list){
            System.out.print(color+" ");
        }
        System.out.println();
    }
    private static void removeItems(List<String> list,int start,int end){
        list.subList(start,end).clear();
    }
    private static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("Reversed list:");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+" ");
        }
        System.out.println();
    }
}
