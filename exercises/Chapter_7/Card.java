package exercises.Chapter_7;

public class Card {
    private final String suit;
    private final String face;
    public Card(String suit,String face){
        this.suit=suit;
        this.face=face;
    }
    public String toString(){
        return face+" of "+suit;
    }
}
