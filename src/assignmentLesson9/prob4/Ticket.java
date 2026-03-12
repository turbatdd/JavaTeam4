package assignmentLesson9.prob4;

public class Ticket {
    private int id;
    private String description;

    Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "id: " + id + " description: " + description;
    }
}
