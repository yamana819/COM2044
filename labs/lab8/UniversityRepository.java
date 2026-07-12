
import java.util.ArrayList;

public class UniversityRepository<T> {
    private ArrayList<T> items;

    public UniversityRepository() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}
