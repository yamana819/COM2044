package exercises.Chapter_8;
import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All Books:");
        for (Book book:Book.values()){
            System.out.println("Title:"+book.getTitle()+" Copyright Year:"+book.getCopyRightYear());
        }
        System.out.println();
        for (Book book:EnumSet.range(Book.CHTP,Book.CPPHTP)){
            System.out.println("Title:"+book.getTitle()+" Copyright Year:"+book.getCopyRightYear());
        }
    }
}
