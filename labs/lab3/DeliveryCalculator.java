import java.util.Scanner;

enum CustomerType {
    REGULAR,
    PREMIUM
}

public class DeliveryCalculator {
    public static double calculateCost(double weight,double distance){
        return calculateCost(weight,distance,false,CustomerType.REGULAR);
    }
    public static double calculateCost(double weight,double distance,boolean isExpress){
        return calculateCost(weight,distance,isExpress,CustomerType.REGULAR);
    }
    public static double calculateCost(double weight,double distance,boolean isExpress,CustomerType customerType){
        double cost=0.0;
        if (weight<=5){
            cost+=10.0;
        } else if (weight<=20){
            cost+=20.0;
        } else {
            cost+=40.0;
        }

        if (distance>50){
            cost+=(distance-50)*0.5;
        }
        if (isExpress){
            cost*=1.5;
        }
        if (customerType==CustomerType.PREMIUM){
            cost*=0.8;
        }
        return cost;
    }

    public static CustomerType parseCustomerType(String userInput){
        if (userInput==null) return null;
        userInput=userInput.trim().toLowerCase();
        if (userInput.equals("regular")){
            return CustomerType.REGULAR;
        } else if (userInput.equals("premium")){
            return CustomerType.PREMIUM;
        }
        return null;
    }

    public static String findCheapestOption(double weight,double distance){
        double normalRegular=DeliveryCalculator.calculateCost(weight,distance);
        double expressRegular=DeliveryCalculator.calculateCost(weight,distance,true);
        double normalPremium=DeliveryCalculator.calculateCost(weight,distance,false,CustomerType.PREMIUM);
        double expressPremium=DeliveryCalculator.calculateCost(weight,distance,true,CustomerType.PREMIUM);
        double minimum=normalRegular;
        String bestOption="Normal Delivery for Regular Customer";
        if (expressRegular<minimum){
            minimum=expressRegular;
            bestOption="Express Delivery for Regular Customer";
        }
        if (normalPremium<minimum){
            minimum=normalPremium;
            bestOption="Normal Delivery for Premium Customer";
        }
        if (expressPremium<minimum){
            minimum=expressPremium;
            bestOption="Express Delivery for Premium Customer";
        }
        return bestOption;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight=-1;
        double distance=-1;
        boolean isExpress=false;
        String customerInput="";
        CustomerType customerType=null;
        while (weight<0){
            System.out.print("Enter weight (kg):");
            weight=input.nextDouble();
            if (weight<0) System.out.println("Invalid input.Weight can not be negative.");
        }
        while (distance<=0){
            System.out.print("Enter distance (km):");
            distance=input.nextDouble();
            if (distance<=0) System.out.println("Invalid input.Distance must be positive.");
        }
        System.out.print("Is express delivery (true/false):");
        isExpress=input.nextBoolean();
        input.nextLine();
        while (customerType==null){
            System.out.print("Enter customer type (regular/premium):");
            customerInput=input.nextLine();
            customerType=DeliveryCalculator.parseCustomerType(customerInput);
            if (customerType==null) System.out.println("Invalid input.Customer type must be premium or regular.");
        }
        double totalCost=calculateCost(weight,distance,isExpress,customerType);
        String cheapestOption=findCheapestOption(weight,distance);
        System.out.println("\nTotal Cost:"+totalCost);
        System.out.println("Best Option:"+cheapestOption);
    }
}
