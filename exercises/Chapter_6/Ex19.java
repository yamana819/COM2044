package exercises.Chapter_6;
import java.security.SecureRandom;

public class Ex19 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int frequency1=0,frequency2=0,frequency3=0,frequency4=0,frequency5=0,frequency6=0;
        for (int i=1;i<=60_000_000;i++){
            int face =1+randomNumbers.nextInt(6);
            switch (face){
                case 1:
                    frequency1++;
                    break;
                case 2:
                    frequency2++;
                    break;
                case 3:
                    frequency3++;
                    break;
                case 4:
                    frequency4++;
                    break;
                case 5:
                    frequency5++;
                    break;
                case 6:
                    frequency6++;
                    break;
            }
        }
        System.out.println("frequency of 1:"+frequency1);
        System.out.println("frequency of 2:"+frequency2);
        System.out.println("frequency of 3:"+frequency3);
        System.out.println("frequency of 4:"+frequency4);
        System.out.println("frequency of 5:"+frequency5);
        System.out.println("frequency of 6:"+frequency6);
    }
}
