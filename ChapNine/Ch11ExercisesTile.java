package ChapNine;

public class Ch11ExercisesTile {

    private char letter;
    private int value;

    public Ch11ExercisesTile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(Ch11ExercisesTile t) {
        System.out.println("Letter: " + t.letter + ", Value: " + t.value);
    }

    public String toString() {
        return "Tile(letter=" + letter + ", value=" + value + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ch11ExercisesTile)) return false;
        Ch11ExercisesTile other = (Ch11ExercisesTile) obj;
        return this.letter == other.letter && this.value == other.value;
    }

    public char getLetter() { return letter; }
    public int getValue()   { return value; }

    public void setLetter(char letter) { this.letter = letter; }
    public void setValue(int value)    { this.value = value; }

    public static void main(String[] args) {
        Ch11ExercisesTile t1 = new Ch11ExercisesTile('Z', 10);
        printTile(t1);

        System.out.println(t1);

        Ch11ExercisesTile t2 = new Ch11ExercisesTile('Z', 10);
        Ch11ExercisesTile t3 = new Ch11ExercisesTile('A', 1);
        System.out.println("t1 equals t2: " + t1.equals(t2)); // true
        System.out.println("t1 equals t3: " + t1.equals(t3)); // false

        System.out.println("Letter via getter: " + t1.getLetter());
        t1.setValue(12);
        System.out.println("Value after setter: " + t1.getValue());
    }
}
