import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }



    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " +
                    actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр " + newActor.getName() + " " +
                    newActor.getSurname() + " (" + newActor.getHeight() +
                    ") уже участвует в спектакле!");
            return;
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен: " + newActor.getName() + " " +
                newActor.getSurname() + " (" + newActor.getHeight() + ")");
    }

}
