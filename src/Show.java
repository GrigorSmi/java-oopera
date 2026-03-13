import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private final Director director;
    private ArrayList<Actor> listOfActors;


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

    public void replaceActor(Actor newActor, String surname) {
        int index = -1;

                for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(surname)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актёр с фамилией '" + surname + "' заменён на " +
                    newActor.name + " " + newActor.surname);
        } else {
            System.out.println("Актёр с фамилией '" + surname + "' не найден");
        }
    }

    public Director getDirector() {
        return director;
    }

    public void printDirector() {
        if (getDirector() == null) {
            System.out.println("Режиссёра нет");
        } else {
            System.out.println("Режиссёр: " + getDirector());
        }
    }

    public String getTitle() {
        return title;
    }

}
