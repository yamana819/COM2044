
public class Warrior extends GameCharacter {
    private int strength;
    private final int initialStrength;
    public Warrior(String name,int health,int strength){
        super(name,health);
        this.initialStrength = Math.max(0, strength);
        this.strength=initialStrength;
    }
    public void setStrength(int strength){
        if (strength>=0){
            this.strength=strength;
        }
        else {
            this.strength=0;
        }
    }
    public int getStrength(){
        return strength;
    }
    @Override
    public void attack(GameCharacter target) {
        super.attack(target);
        int reduceStrength = random.nextInt(initialStrength + 1);
        setStrength(this.strength - reduceStrength);
        System.out.println(" [Warrior strength -" + reduceStrength + ", now " + this.strength + "]");
    }
    @Override
    public String toString() {
        return super.toString() + ", Strength: " + strength;
    }
}
