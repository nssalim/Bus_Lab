import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String getName() {
        return this.name;
    }

    public int queueCount() {
        return queue.size();
    }

    public void addPassenger(Person person) {
        queue.add(person);
    }

    public void removePassenger(Person person) {
        queue.remove(person);
    }
}
