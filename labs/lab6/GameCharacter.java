import java.security.SecureRandom;

public class GameCharacter {
    private String name;
    private int health;
    protected static final SecureRandom random = new SecureRandom();
    public GameCharacter(String name,int health){
        this.name = name;
        if (health>=0){
            this.health=health;
        }
        else {
            this.health=0;
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public void setHealth(int health){
        if (health>=0){
            this.health=health;
        }
        else {
            this.health=0;
        }
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public void attack(GameCharacter target) {
        int damageAmount = random.nextInt(11);
        target.takeDamage(damageAmount);
        System.out.print(this.name + " attacks " + target.getName() + " for " + damageAmount + " damage.");
        if (damageAmount == 0 || damageAmount == 5 || damageAmount == 10) {
            int healAmount = random.nextInt(11);
            target.heal(healAmount);
            System.out.print(" (Triggered heal: " + target.getName() + " heals " + healAmount + ")");
        }
    }
    public void takeDamage(int damage){
        setHealth(this.health-damage);
    }
    public void heal(int amount){
        setHealth(this.health+amount);
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Health: " + health;
    }
}
