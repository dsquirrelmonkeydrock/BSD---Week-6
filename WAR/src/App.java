public class App {
    public static void main(String[] args) {
        Deck mainDeck = new Deck();
        Player player1 = new Player();
        player1.setName("Derrick");
        Player player2 = new Player();
        player2.setName("Alison");
        mainDeck.shuffle();

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(mainDeck);
            } else {
                player2.draw(mainDeck);
            }
        }
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
            }
        }

        System.out.println(player1.getName() + " score: " + player1.getScore());
        System.out.println(player2.getName() + " score: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else if (player1.getScore() == player2.getScore()) {
            System.out.println("Draw");
        }
    }
}
