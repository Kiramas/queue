import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static Person Alla = new Person("Alla", "Vadimova", 2);
    static Person Zoya = new Person("Zoya", "Peltz", 1);
    static Person Pavel = new Person("Pavel", "Obolyaninov", 4);
    static Person Alexander = new Person("Alexander", "Amethystov", 3);
    static Person Anton = new Person("Anisimus", "Popov", 2);

    public static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(Alla);
        personList.add(Zoya);
        personList.add(Pavel);
        personList.add(Alexander);
        personList.add(Anton);
        return personList;
    }

    public static void main(String[] args) {
        Queue<Person> Attraction = new LinkedList<>();
        for (int i = 0; i < generateClients().size(); i++) {
            Attraction.offer(generateClients().get(i));

            while (!Attraction.isEmpty()) {
                Person person = Attraction.poll();
                System.out.println(person.Name() + person.Surname() + " прокатился на аттракционе.");
                person.spendTicket();
                if (person.Tickets() > 0) {
                    Attraction.add(person);
                }
            }
        }
    }
}