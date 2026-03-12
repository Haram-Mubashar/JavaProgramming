public class CardDemo {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.displayDeck();

        Player[] players = {
            new Player("Haram"),
            new Player("Sara"),
            new Player("Ayesha")
        };

        Game game1 = new Game(players, deck);

        game1.playRound();
        System.out.println(game1);

        game1.roundWinner();

    }
}
            

