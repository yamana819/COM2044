package exercises.Chapter_10;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payables=new Payable[] {
                new SalariedEmployee("Furkan","Yaman","1321323",400.0),
                new SalariedEmployee("Ahmet","Yaman","231321321321",350.0),
                new Invoice("01234","Seat",2,400.0),
                new Invoice("32132","tire",4,79.75)
        };
        for (Payable p:payables){
            System.out.println(p.toString());
            System.out.println(p.getPaymentAmount());
        }
    }
}
