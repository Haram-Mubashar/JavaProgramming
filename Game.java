public class Game {
    Player[] players;
    Deck deck;

    Game(Player[] players, Deck deck) {
        this.players = players;
        this.deck = deck;
        deck.shuffle();
    }

    public void playRound() {
        for (int i = 0; i < players.length; i++) {
            Card drawn = deck.draw();
            System.out.println(players[i].name + " drew " + drawn);
        }
    }

    public Player highestScore() {
        Player best = players[0];
        for (int i = 1; i < players.length; i++) {
            if (players[i].score > best.score) {
                best = players[i];
            }
        }
        return best;
    }

    public void roundWinner() {
        Player best = highestScore();
        System.out.println("winner is " + best);
        
  }
}
