import java.util.Arrays;

public class DeckOfCards10 {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Initialize the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        
        // Shuffle the deck using Fisher-Yates shuffle algorithm
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be equally distributed among players.");
            return null;
        }

        // Create a 2D array to store players and their cards
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        int cardIndex = 0;

        // Distribute the cards
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " Cards: " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        // Number of cards to distribute and number of players
        int numOfCards = 52;  // Total number of cards in a standard deck
        int numOfPlayers = 4; // Number of players

        // Step 1: Initialize the deck of cards
        String[] deck = initializeDeck();
        
        // Step 2: Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Step 3: Distribute the cards to players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        
        // Step 4: Print the players and their cards
        printPlayersCards(players);
    }
}
