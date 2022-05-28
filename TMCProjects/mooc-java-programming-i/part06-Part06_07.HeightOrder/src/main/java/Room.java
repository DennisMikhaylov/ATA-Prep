import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = this.people.get(0);
        for (Person i : this.people) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = this.people.get(0);
        int shortindex = 0;
        for (int i = 0; i < this.people.size(); i++) {
            if (this.people.get(i).getHeight() < shortest.getHeight()) {
                shortest = this.people.get(i);
                shortindex = i;
            }
        }

        this.people.remove(shortindex);
        return shortest;
    }
}