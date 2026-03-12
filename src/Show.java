import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    private Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }



    public void printActors() {
        System.out.println("Список актёров для спектакля " + title + ":");
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

    public void applayActor(Actor oldActor, Actor newActor) {

        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актёр заменён");
        } else {
            System.out.println("Актёр не найден");
        }

            }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
