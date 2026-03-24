package ChapterTwelve;

public class Ch12Exercises {

    static class Card {
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

        // EXERCISE 2: compareTo() — Ace High
        // Ace is stored as rank 1, but treated as highest (above King/13)
        public int compareTo(Card that) {
            int thisRank = (this.rank == 1) ? 14 : this.rank;
            int thatRank = (that.rank == 1) ? 14 : that.rank;

            if (this.suit < that.suit) return -1;
            if (this.suit > that.suit) return 1;
            if (thisRank < thatRank) return -1;
            if (thisRank > thatRank) return 1;
            return 0;
        }

        // 12.5 Cards Are Immutable
        public int getRank() {
            return this.rank;
        }

        public int getSuit() {
            return this.suit;
        }

        // 12.6
        public static void printDeck(Card[] cards) {
            for (Card card : cards) {
                System.out.println(card);
            }
        }

        // 12.7
        public static int search(Card[] cards, Card target) {
            for (int i = 0; i < cards.length; i++) {
                if (cards[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }

        // 12.8
        public static int binarySearch(Card[] cards, Card target) {
            int low = 0;
            int high = cards.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                int comp = cards[mid].compareTo(target);

                if (comp == 0) {
                    return mid;
                } else if (comp < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

        // EXERCISE 1: makeDeck()
        public static Card[] makeDeck() {
            Card[] cards = new Card[52];

            int index = 0;
            for (int suit = 0; suit <= 3; suit++) {
                for (int rank = 1; rank <= 13; rank++) {
                    cards[index] = new Card(rank, suit);
                    index++;
                }
            }
            return cards;
        }

        // EXERCISE 3A: suitHist()
        public static int[] suitHist(Card[] hand) {
            int[] hist = new int[4];
            for (Card card : hand) {
                hist[card.suit]++;
            }
            return hist;
        }

        // EXERCISE 3B: hasFlush()
        public static boolean hasFlush(Card[] hand) {
            int[] hist = suitHist(hand);
            for (int count : hist) {
                if (count >= 5) {
                    return true;
                }
            }
            return false;
        }

        // EXERCISE 3C: hasRoyal()
        // Royal Flush = 10, Jack, Queen, King, Ace — all same suit
        public static boolean hasRoyal(Card[] hand) {
            int[] royalRanks = {1, 10, 11, 12, 13}; // Ace=1, 10, Jack=11, Queen=12, King=13

            for (int suit = 0; suit <= 3; suit++) {
                boolean hasAll = true;
                for (int rank : royalRanks) {
                    Card target = new Card(rank, suit);
                    if (search(hand, target) == -1) {
                        hasAll = false;
                        break;
                    }
                }
                if (hasAll) {
                    return true;
                }
            }
            return false;
        }

        // MAIN
        public static void main(String[] args) {

            System.out.println("===== Exercise 1: makeDeck() =====");
            Card[] deck = makeDeck();
            System.out.println("Deck created with " + deck.length + " cards.\n");
            System.out.println("Printing the deck:");
            printDeck(deck);

            System.out.println("\n===== Exercise 2: compareTo() (Ace High) =====");
            Card aceSpades = new Card(1, 3);
            Card kingSpades = new Card(13, 3);
            int comparison = aceSpades.compareTo(kingSpades);
            System.out.println("Comparing:");
            System.out.println(aceSpades + " vs " + kingSpades);
            if (comparison > 0) {
                System.out.println("Result: Ace is higher than King.");
            } else if (comparison < 0) {
                System.out.println("Result: King is higher.");
            } else {
                System.out.println("Result: Cards are equal.");
            }

            System.out.println("\n===== Exercise 3A: suitHist() =====");
            int[] hist = suitHist(deck);
            System.out.println("Clubs: " + hist[0]);
            System.out.println("Diamonds: " + hist[1]);
            System.out.println("Hearts: " + hist[2]);
            System.out.println("Spades: " + hist[3]);

            System.out.println("\n===== Exercise 3B: hasFlush() =====");
            boolean flush = hasFlush(deck);
            System.out.println("Deck contains flush: " + flush);

            System.out.println("\n===== Exercise 3C: hasRoyal() =====");
            boolean royal = hasRoyal(deck);
            System.out.println("Deck contains royal flush: " + royal);

            System.out.println("\n===== Sequential Search Test =====");
            Card target = new Card(11, 0); // Jack of Clubs
            int index = search(deck, target);
            System.out.println("Searching for: " + target);
            System.out.println("Found at index: " + index);

            System.out.println("\n===== Binary Search Test =====");
            int binIndex = binarySearch(deck, target);
            System.out.println("Searching for: " + target);
            System.out.println("Found at index: " + binIndex);
        }
    }
}