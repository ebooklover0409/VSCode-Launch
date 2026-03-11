package ChapNine;

public class Ch11ExercisesDate {

    private int year;
    private int month;
    private int day;

   
    public Ch11ExercisesDate() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    public Ch11ExercisesDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return year + "/" + month + "/" + day;
    }

    public static void main(String[] args) {
        Ch11ExercisesDate defaultDate = new Ch11ExercisesDate();
        System.out.println("Default date: " + defaultDate);

        Ch11ExercisesDate birthday = new Ch11ExercisesDate(1995, 6, 15);
        System.out.println("Birthday: " + birthday);
    }
}
