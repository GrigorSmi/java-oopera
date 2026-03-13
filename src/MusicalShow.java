import java.util.ArrayList;

public class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;


    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    @Override
    public String toString() {
        return "Текст либеретто: " + librettoText;
    }


    public Person getMusicAuthor() {
        return musicAuthor;
    }


}
