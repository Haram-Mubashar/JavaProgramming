import java.util.Random;

public class Deck{

       Card cards[];
       int index=0;     // For drawing card through sequence of indexes

       private String suits[]={"Spades","Clubs","Hearts","Diamonds"};
       private String ranks[]={"Ace","2","3","4","5","6","7","8","Jack","Queen","King"};
       
       Deck(){

       cards=new Card[52];
       int counter=0;
       for(int i=0; i<suits.length;i++)
           for (int j=0;j<ranks.length;j++)
             cards[counter++]=new Card(suits[i],ranks[j]);
       
      }
 

     public void displayDeck(){

     for(Card card:cards)
        System.out.println(card);
   

    }

     public void shuffle(){

     Random random=new Random();
     for(int i=0;i<10000;i++){
         int tempIndex = random.nextInt(52);
         Card temp=cards[0];
         cards[0]=cards[tempIndex];
         cards[tempIndex]=temp;

      }
    
     }

 public Card draw() {
    if (index < cards.length) {
        return cards[index++];   // gives cards in a sequence  
  }
    return null;   

}

}
