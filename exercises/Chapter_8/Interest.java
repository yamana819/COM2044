package exercises.Chapter_8;
import java.text.NumberFormat;
import java.math.BigDecimal;

public class Interest {
    public static void main(String[] args) {
        BigDecimal principal=BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        for (int year=1;year<=10;year++){
            BigDecimal amount=principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
