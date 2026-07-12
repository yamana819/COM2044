package exercises.Chapter_7;
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("red");
        items.add(1,"yellow");
        for (String color:items){
            System.out.print(color+" ");
        }
        System.out.println();
        System.out.println(items.get(0));
        items.add("blue");
        items.add("green");
        items.remove("blue");
        for (String color:items){
            System.out.print(color+" ");
        }
        System.out.println();
        items.remove(2);
        for (String color:items){
            System.out.print(color+" ");
        }
        System.out.println();
        System.out.printf("The list %s the element red\n",items.contains("red")?"contains":"does not contain");
        System.out.println("Size:"+items.size());
    }
}
