package exercises.Chapter_16;
import exercises.Chapter_8.Time2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();
        list.add(new Time2(6,24,34));
        list.add(new Time2(18,14,58));
        list.add(new Time2(6,5,34));
        System.out.println("Unsorted list:"+list);
        Collections.sort(list,new TimeComparator());
        System.out.println("Sorted list:"+list);
    }
}
