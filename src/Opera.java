import java.util.ArrayList;

public class Opera extends  MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, String librettoText, Person musicAuthor, int choirSize) {
        super(title, duration, director, listOfActors, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }

    @Override
    public String getLibrettoText() {
        return super.getLibrettoText();
    }
}
