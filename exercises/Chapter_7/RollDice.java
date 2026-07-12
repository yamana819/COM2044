package exercises.Chapter_7;
import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i=0;i<60000000;i++){
            ++frequency[1+random.nextInt(6)];
        }
        for (int i=1;i<frequency.length;i++){
            System.out.println(i+":"+frequency[i]);
        }
    }
}
