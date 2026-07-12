package exercises.Chapter_8;

import java.sql.Time;

public class Time2Test {
    public static void main(String[] args){
        Time2 time1 = new Time2();
        Time2 time2 = new Time2(11);
        Time2 time3 = new Time2(21,22);
        Time2 time4= new Time2(23,11,44);
        Time2 time5 = new Time2(time4);
        displayTime("All default",time1);
        displayTime("Hour initialized",time2);
        displayTime("Hour and minute initialized",time3);
        displayTime("All initialized",time4);
        displayTime("Initialized with another object Time2(time4)",time5);
        try {
            Time2 time6=new Time2(99,99,99);
        } catch (IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    private static void displayTime(String header,Time2 time){
        System.out.println(header);
        System.out.println("Time in universal format:"+time);
        System.out.println("Time in standard format:"+time.toUniversalString());
        System.out.println();
    }
}
