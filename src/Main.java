import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        System.out.println("----------------------------------------" + "\n");

        Director Alice = new Director("Алиса", "Фантарова", Gender.FEMALE, 15);
        Director Sergey = new Director("Сергей", "Павлов", Gender.MALE, 32);

        Actor Grigory = new Actor("Григорий", "Артистов", Gender.MALE, 175);
        Actor Serafima = new Actor("Серафима", "Воронцова", Gender.FEMALE, 154);
        Actor Dmitriy = new Actor("Дмитрий", "Лебедев", Gender.MALE, 190);

        Person musicAuthor = new Person("Мила", "Мелодиева", Gender.FEMALE);
        Person choreographer = new Person("Платон", "Мещерский", Gender.MALE);

        MusicalShow MD = new MusicalShow("Мёртвые души", 165, Sergey,
                new ArrayList<>(), musicAuthor, "Ура-ура");
        MD.addActor(Grigory);
        MD.addActor(Serafima);
        MD.addActor(Dmitriy);
        MD.printActors();
        System.out.println("----------------------------------------" + "\n");

        Ballet LO = new Ballet("Лебединое озеро", 140, Alice, new ArrayList<>(), musicAuthor,
                "Принц влюбляется в деву-лебедя", choreographer);
        LO.addActor(Dmitriy);
        LO.addActor(Serafima);
        LO.printActors();
        System.out.println(LO);
        System.out.println("----------------------------------------" + "\n");

        Opera EO = new Opera("Евгений Онегин", 220, Alice, new ArrayList<>(), musicAuthor,
                "История отвергнутой любви Татьяны к Онегину", 48);
        EO.addActor(Serafima);
        EO.addActor(Grigory);
        EO.printActors();
        System.out.println(EO);
        System.out.println("----------------------------------------" + "\n");

        EO.replaceActor(Serafima, "Лебедев");
        EO.printActors();
        System.out.println("----------------------------------------" + "\n");

        EO.replaceActor(Serafima, "Артистов");
        EO.printActors();
        System.out.println("----------------------------------------" + "\n");

        // теперь это, чтобы проверять исправленные ошибки по ревью

        MD.printDirector();
        LO.printDirector();
        EO.printDirector();

        System.out.println("Хореограф балета " + LO.getTitle() + " : " + LO.getChoreographer());

        System.out.println("Автор музыки: " + MD.getTitle() + " : " + MD.getMusicAuthor());
        System.out.println("Автор музыки: " + LO.getTitle() + " : " + LO.getMusicAuthor());
        System.out.println("Автор музыки: " + EO.getTitle() + " : " + EO.getMusicAuthor());

        System.out.println("Размер хора в опере " + EO.getTitle() + " : " + EO.getChoirSize());
    }
}
