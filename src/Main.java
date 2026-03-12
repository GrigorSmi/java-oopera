import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Director Alice = new Director("Алиса", "Фантарова", Gender.FEMALE, 15);
        Director Sergey = new Director("Сергей", "Павлов", Gender.MALE, 32);

        Actor Grigory = new Actor("Григорий", "Артистов", Gender.MALE, 175);
        Actor Serafima = new Actor("Серафима", "Воронцова", Gender.FEMALE, 154);
        Actor Dmitriy = new Actor("Дмитрий", "Лебедев", Gender.MALE, 190);

        Person musicAuthor = new Person("Мила", "Мелодиева", Gender.FEMALE);
        Person choreographer = new Person("Платон", "Мещерский", Gender.MALE);

        MusicalShow MD = new MusicalShow("Мёртвые души", 165, Sergey, new ArrayList<>(), musicAuthor, "Ура-ура");
        MD.addActor(Grigory);
        MD.addActor(Serafima);
        MD.addActor(Dmitriy);
        MD.printActors();

        /*Ballet LO;
        LO.addActor(Dmitriy);
        LO.addActor(Serafima);
        LO.printActors();

        Opera EO;
        EO.addActor(Serafima);
        EO.addActor(Grigory);
        EO.printActors();*/


        System.out.println(MD);
    }
}
