package exercises.Chapter_8;

public class Time2 {
    private int hour;
    private int minute;
    private int second;
    public Time2(){
        this(0,0,0);
    }
    public Time2(int hour){
        this(hour,0,0);
    }
    public Time2(int hour,int minute){
        this(hour,minute,0);
    }
    public Time2(int hour,int minute,int second){
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Hour minute or second was out of range.");
        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public Time2(Time2 time){
        this(time.hour,time.minute,time.second);
    }
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Hour minute or second was out of range.");
        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void setHour(int hour){
        if (hour<0 || hour>=24){
            throw new IllegalArgumentException("Hour was out of range.");
        }
        this.hour=hour;
    }
    public void setMinute(int minute){
        if (minute<0 || minute>=60){
            throw new IllegalArgumentException("Second was out of range.");
        }
        this.minute=minute;
    }
    public void setSecond(int second){
        if (second<0 || second>=60){
            throw new IllegalArgumentException("Second was out of range.");
        }
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return minute;
    }
    public String toUniversalString(){
        return String.format("%d:%02d:%02d %s",((hour==0 || hour==12)?12:hour%12),minute,second,hour<12?"AM":"PM");
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
