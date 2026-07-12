package exercises.Chapter_16;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();
        for (String color : colors) {
            list.add(color);
        }
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();
        for (String removeColor : removeColors) {
            removeList.add(removeColor);
        }
        for (String color : list) {
            System.out.print(color + " ");
        }
        System.out.println();
        removeColors(list,removeList);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void removeColors(Collection<String> collection1,Collection<String> collection2){
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()){
            if (collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
