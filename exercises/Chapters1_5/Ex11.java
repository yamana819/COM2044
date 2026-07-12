package exercises.Chapters1_5;

public class Ex11 {
    public static void main(String[] args) {
        double principal=1000.0;
        double rate=0.05;
        for (int i=1;i<=10;i++){
            double amount = principal * Math.pow(1.0+rate,i);
            System.out.printf("Year:%d Deposit:%.2f\n",i,amount);
        }
    }
}
