import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, getName(), getSurname());
    }
    @Override
    public String toString() {
        return super.toString() + " , рост = " + height;
    }
}


