public class Player{

        String name;
        int score;
        String hand[];
        Card card;
        

       Player(String name){

          this.name=name;
          this.score=0;

       }


       void addScore(){

            score++;
       }

       //void draw(Card card) {

        //this.card = card;

       //}


       public String toString(){

       return String.format("%s %d", name , score);

       }

}


