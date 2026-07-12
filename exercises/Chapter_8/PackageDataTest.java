package exercises.Chapter_8;

public class PackageDataTest {
    public static void main(String[] args) {
        PackageData data = new PackageData();
        System.out.println("After initializing:\n"+data);
        data.number=80;
        data.string="Goodbye";
        System.out.println("After accessing:\n"+data);
    }
}
