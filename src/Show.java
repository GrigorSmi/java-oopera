import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<String> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director, ArrayList<String> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
}
