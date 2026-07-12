package exercises.Chapter_10;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;
    public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem){
        if (pricePerItem<0.0){
            throw new IllegalArgumentException("Error:Price per item must be >=0");
        }
        if (quantity<0){
            throw new IllegalArgumentException("Error:quantity must be>=0");
        }
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    @Override
    public String toString(){
        return "Part No:"+partNumber+" Part description:"+partDescription+" quantity:"+quantity+" Price Per Item:"+pricePerItem;
    }
    @Override
    public double getPaymentAmount(){
        return quantity*pricePerItem;
    }
}
