package exercises.Chapter_8;

import javax.sound.midi.SysexMessage;

public class Employee1Test {
    public static void main(String[] args) {
        System.out.println("Employee count before instantiation");
        System.out.println(Employee1.getCount());
        Employee1 e1 = new Employee1("Zekeriya","Baba");
        Employee1 e2 = new Employee1("Furkan","Yaman");
        System.out.println("Employee count after instantiation");
        System.out.println(e1.getCount());
        System.out.println(e2.getCount());
        System.out.println(Employee1.getCount());
    }
}
