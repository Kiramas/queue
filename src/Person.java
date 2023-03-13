public class Person {
    private String name;
    private String surname;
    private int tickets;


    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int Tickets() {
        return tickets;
    }

    public String Name() {
        return name;
    }

    public String Surname() {
        return surname;
    }

    public int spendTicket() {
        tickets -= 1;
        return tickets;
    }
}