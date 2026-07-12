package exercises.Chapter_17;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ahmet","Furkan",5000,"IT"),
                new Employee("Zekeriya","Burak",6500,"IT"),
                new Employee("Sarp","Matas",5600,"Marketing"),
                new Employee("Ahmet","Mete",5900,"Marketing")
        };
        List<Employee> list = Arrays.asList(employees);
        System.out.println("Complete employee list:");
        list.stream().forEach(System.out::println);
    }
}
