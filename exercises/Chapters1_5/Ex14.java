package exercises.Chapters1_5;

public class Ex14 {
    public static void main(String[] args) {
        AutoPolicy policy1=new AutoPolicy(11111111,"Toyota Camry","NJ");
        AutoPolicy policy2=new AutoPolicy(22222222,"Ford Fusion","ME");
        policyNoFaultState(policy1);
        policyNoFaultState(policy2);
    }
    public static void policyNoFaultState(AutoPolicy policy){
        System.out.println("Account:"+policy.getAccountNumber()+" Car:"+policy.getMakeAndModel());
        System.out.printf("State %s ",policy.getState());
        System.out.printf(policy.isNoFaultState()?"is a no-fault state.":"is not a no-fault state.");
        System.out.println();
    }
}
