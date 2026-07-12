package exercises.Chapters1_5;

public class Ex12 {
    public static void main(String[] args) {
        int counter=1;
        while ((counter>1) && (counter<10)){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
        counter=1;
        do {
            System.out.print(counter+" ");
            counter++;
        } while ((counter>1) && (counter<10));
    }
}
