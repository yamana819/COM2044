
public class Wizard extends GameCharacter {
    private int mana;
    private final int initialMana;
    public Wizard(String name,int health,int mana){
        super(name,health);
        this.initialMana=Math.max(0,Math.min(100,mana));
        this.mana=initialMana;
    }
    public void setMana(int mana){
        if (mana<0){
            this.mana=0;
        }
        else if (mana>100){
            this.mana=100;
        }
        else {
            this.mana=mana;
        }
    }
    public int getMana(){
        return mana;
    }
    @Override
    public void attack(GameCharacter target){
        super.attack(target);
        int reduceMana = random.nextInt(initialMana+1);
        setMana(this.mana-reduceMana);
        System.out.println(" [Wizard mana -" + reduceMana + ", now " + this.mana + "]");
    }
    @Override
    public String toString(){
        return super.toString() + ", Mana: " + mana;
    }
}
