public class Game{

       public String toString(){

       return playersDetails.toString();
       }

  }

public class Player{

        String name;
        int score;
        Card[] hand;
        

       Player(String name){

          this.name=name;
       }

       public String toString(){

       return String.format("%s %d %s", name , score, hand);

       }

}



