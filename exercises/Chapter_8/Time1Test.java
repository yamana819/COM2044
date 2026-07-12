package exercises.Chapter_8;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        displayTime("After the time object is created:",time);
        time.setTime(13,27,33);
        displayTime("After the setTime is used:",time);
        try {
            time.setTime(99,99,99);
        } catch (IllegalArgumentException e){
            System.out.println("Exception:"+e.getMessage()+"\n");
        }
        displayTime("After calling setTime with improper numbers",time);
    }
    private static void displayTime(String header,Time1 time){
        System.out.println(header);
        System.out.println("Time in universal format:"+time);
        System.out.println("Time in standard format:"+time.toUniversalString());
        System.out.println();
    }
}
