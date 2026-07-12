import java.util.Scanner;
import java.util.ArrayList;

public class DuelRPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wizard name:");
        String wizardName = input.nextLine();
        System.out.print("Enter Wizard health:");
        int wizardHealth = Integer.parseInt(input.nextLine());
        System.out.print("Enter Wizard mana (0-100):");
        int wizardMana = Integer.parseInt(input.nextLine());
        Wizard wizard = new Wizard(wizardName, wizardHealth, wizardMana);
        System.out.print("Enter Warrior name:");
        String warriorName = input.nextLine();
        System.out.print("Enter Warrior health:");
        int warriorHealth = Integer.parseInt(input.nextLine());
        System.out.print("Enter Warrior strength (>=0):");
        int warriorStrength = Integer.parseInt(input.nextLine());
        Warrior warrior = new Warrior(warriorName,warriorHealth,warriorStrength);
        ArrayList<GameCharacter> characters = new ArrayList<>();
        characters.add(wizard);
        characters.add(warrior);
        System.out.println("\nInitial Status");
        System.out.println(wizard);
        System.out.println(warrior);
        System.out.println("\nDuel Begins");
        int turn = 0;
        while (true){
            GameCharacter attacker = characters.get(turn%2);
            GameCharacter defender = characters.get((turn+1)%2);
            attacker.attack(defender);
            System.out.println("Status -> " + wizard);
            System.out.println("Status -> " + warrior);
            boolean wizardLoses = wizard.getHealth() == 0 || wizard.getMana() == 0;
            boolean warriorLoses = warrior.getHealth() == 0 || warrior.getStrength() == 0;
            if (wizardLoses || warriorLoses) {
                System.out.println("\n--- Duel Ends ---");
                if (wizardLoses) {
                    System.out.println(wizard.getName() + " loses (health or mana reached 0). " + warrior.getName() + " wins.");
                } else {
                    System.out.println(warrior.getName() + " loses (health or strength reached 0). " + wizard.getName() + " wins.");
                }
                break;
            }
            turn++;
        }
        input.close();
    }
}
