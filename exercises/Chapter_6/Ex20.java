package exercises.Chapter_6;

public class Ex20 {
    private static int x=1;
    public static void main(String[] args) {
        int x=5;
        System.out.println("Local x in main is: "+x);
        useLocalVariable();
        useField();
        System.out.println("Local x in main after executing functions is "+x);
        System.out.println("Field x after executing functions is "+Ex20.x);
    }
    public static void useLocalVariable(){
        int x=25;
        System.out.println("The local variable x entering method useLocalVariable is "+x);
        x++;
        System.out.println("The local variable x exiting method useLocalVariable is "+x);
    }
    public static void useField(){
        System.out.println("Field x entering method useField is "+x);
        x*=10;
        System.out.println("Field x exiting method useField is "+x);
    }
}
