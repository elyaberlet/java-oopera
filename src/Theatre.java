import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> musicalShowActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();

        Actor actor1 = new Actor("Vasya", "Vas", Gender.MALE, 170);
        Actor actor2 = new Actor("Elya", "Berlet", Gender.FEMALE, 180);
        Actor actor3 = new Actor("Mila", "Swon", Gender.FEMALE, 165);

        Director director1 = new Director("Nikita", "N", Gender.MALE, 18);
        Director director2 = new Director("Maksim", "Iarozkiy", Gender.MALE, 13);

        Person musicAuthor = new Person("G", "Gg", Gender.MALE);
        Person choreographer = new Person("H", "Hh", Gender.FEMALE);

        Opera opera = new Opera("AAA", 2, director1, operaActors, "aaa", musicAuthor, 23);

        MusicalShow musicalShow = new MusicalShow("БББ", 3, director2, musicalShowActors, "ggg", musicAuthor);

        Ballet ballet = new Ballet("ДДД", 1, director1, balletActors, "lll", musicAuthor, choreographer);

        musicalShow.addActor(actor1);
        musicalShow.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println();

        opera.printAllActors();
        System.out.println();
        musicalShow.printAllActors();
        System.out.println();
        ballet.printAllActors();
        System.out.println();

        opera.replaceActor("Vas", actor2);
        opera.printAllActors();
        System.out.println();

        musicalShow.replaceActor("Swon", actor1);
        System.out.println();
        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());
    }
}

