package exercises.Chapter_16;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        Character[] letters = {'C','D','A'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("List contains:");
        output(list);
        Collections.reverse(list);
        output(list);
        Character[] copyLetters = new Character[3];
        List<Character> coppyList = Arrays.asList(copyLetters);
        Collections.copy(coppyList,list);
        output(coppyList);
        Collections.fill(list,'R');
        output(list);
    }
    public static void output(List<Character> list){
        for (Character element:list){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Max"+ Collections.max(list));
        System.out.println("Min:"+Collections.min(list));
    }
}
