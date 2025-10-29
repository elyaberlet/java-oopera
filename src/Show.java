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

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public String getTitle() {
        return title;
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

    public void replaceActor(Actor oldActor, Actor newActor) {
        if (listOfActors.contains(oldActor)) {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
            System.out.println("Актер заменен");
        } else {
            System.out.println("Актер не найден в списке");
        }
    }
}
