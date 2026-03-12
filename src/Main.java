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

        EO.applayActor(Serafima, Dmitriy);
        EO.printActors();
        System.out.println("----------------------------------------" + "\n");

        EO.applayActor(Serafima, Grigory);
        EO.printActors();
        System.out.println("----------------------------------------" + "\n");

        // то, что дальше это просто из интереса, в ТЗ этого нет
        System.out.println("Режиссёр спектакля " + MD.title + " : " + MD.getDirector());
        System.out.println("Режиссёр спектакля " + LO.title + " : " + LO.getDirector());
        System.out.println("Режиссёр спектакля " + EO.title + " : " + EO.getDirector());

        System.out.println("Хореограф балета " + LO.title + " : " + LO.choreographer);

        System.out.println("Автор музыки: " + MD.title + " : " + MD.musicAuthor);
        System.out.println("Автор музыки: " + LO.title + " : " + LO.musicAuthor);
        System.out.println("Автор музыки: " + EO.title + " : " + EO.musicAuthor);

        System.out.println("Размер хора в опере " + EO.title + " : " + EO.getChoirSize());
    }
}
