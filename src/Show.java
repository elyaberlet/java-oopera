import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printAllActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor + " уже добавлен");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " добавлен в спектакль");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер заменен");
                break;
            } else {
                System.out.println("Актер не найден");
            }
        }
    }
}
