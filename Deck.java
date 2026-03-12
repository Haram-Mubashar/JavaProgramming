import java.util.Random;

public class Deck{

       Card cards[];
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


    





















}