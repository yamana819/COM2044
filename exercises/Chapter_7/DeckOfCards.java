package exercises.Chapter_7;
import java.security.SecureRandom;
import java.util.Currency;

public class DeckOfCards {
    private static final SecureRandom random= new SecureRandom();
    private static final int NUMBER_OF_CARDS=52;
    private Card[] deck= new Card[NUMBER_OF_CARDS];
    private int currentCard=0;
    public DeckOfCards(){
        String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Hearths","Diamonds","Clubs","Spades"};
        for (int i=0;i<deck.length;i++){
            deck[i] = new Card(suits[i/13],faces[i%13]);
        }
    }
    public void shuffle(){
        currentCard=0;
        for (int i=0;i<deck.length;i++){
            int second = random.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[i];
            deck[i]=deck[second];
            deck[second]=temp;
        }
    }
    public Card dealCard(){
        if (currentCard<deck.length){
            return deck[currentCard++];
        }
        else {
            return null;
        }
    }
}
