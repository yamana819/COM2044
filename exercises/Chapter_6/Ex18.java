package exercises.Chapter_6;
import java.security.SecureRandom;

public class Ex18 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        for (int i=1;i<=20;i++){
            int dice = 1+randomNumbers.nextInt(6);
            System.out.print(dice+" ");
            if (i%5==0){
                System.out.println();
            }
        }
    }
}
