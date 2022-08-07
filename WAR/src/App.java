public class App {
    public static void main(String[] args) {
        // build deck of cards
        Deck mainDeck = new Deck();
        // create player 1
        Player player1 = new Player();
        player1.setName("Derrick");
        // create player 2
        Player player2 = new Player();
        player2.setName("Alison");
        // shuffle deck of cards
        mainDeck.shuffle();
        // deal each player 26 cards
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(mainDeck);
            } else {
                player2.draw(mainDeck);
            }
        }
        // iterate through the 26 cards where each player flips a card and if their
        // value is higher than the other players card they get +1 to their score
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
            }
        }
        // display both players score
        System.out.println(player1.getName() + " score: " + player1.getScore());
        System.out.println(player2.getName() + " score: " + player2.getScore());
        // declare a winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else if (player1.getScore() == player2.getScore()) {
            System.out.println("Draw");
        }
    }
}
