package ChapterTwelve; 

import java.util.Arrays;

public class Ch12Exercises { 

public class Card {
    private int rank;
    private int suit;

    public Card() { 
        this.rank = 0; 
        this.suit = 0; 
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // 12.2 Card To String 

    public String toString() {
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
        }

    // 12.4 Compare Method 

    public boolean equals(Card that) {
    return this.rank == that.rank
        && this.suit == that.suit;
    }

    public int compareTo(Card that) {
    if (this.suit < that.suit) {
        return -1;
    }
    if (this.suit > that.suit) {
        return 1;
    }
    if (this.rank < that.rank) {
        return -1;
    }
    if (this.rank > that.rank) {
        return 1;
    }
    return 0;
    }

    // 12.5 Cards Are Immutable 

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    //12.6 

    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    //12.7 

    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    //12.8 

    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            System.out.println(low + ", " + high);
            int mid = (low + high) / 2;                 // step 1
            int comp = cards[mid].compareTo(target);

            if (comp == 0) {                            // step 2
                return mid;
            } else if (comp < 0) {                      // step 3
                low = mid + 1;
            } else {                                    // step 4
                high = mid - 1;
            }
        }
        return -1;
    }


    //MAIN
    public void main(String[] args) { 
        Card card = new Card(11, 1);
        System.out.println(card);

        // 12.6
        Card[] cards = new Card[52];
        if (cards[0] == null) {
            System.out.println("No card yet!");
        }

        int index = 0;
            for (int suit = 0; suit <= 3; suit++) {
                for (int rank = 1; rank <= 13; rank++) {
                    cards[index] = new Card(rank, suit);
                    index++;
                }
            }


        System.out.println(cards[0].rank);  // NullPointerException

        System.out.println(Arrays.toString(cards));
       
        Card.printDeck(cards);
        System.out.println(Arrays.toString(cards));
        System.out.println(cards[50]);

        //12.9 

        Card card1 = new Card(11, 0);
        System.out.println(binarySearch(cards, card1));

        System.out.println("rightone"); 
    }
    
}

}

