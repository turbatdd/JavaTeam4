package assignmentLesson9.prob4;

public class TestTicket {
    public static void main(String[] args) {
        TicketingSystem t = new TicketingSystem();

        t.addTicket("Ticket 1 add");
        t.addTicket("Ticket 2 add");

        System.out.println(t.toString());

        t.viewNextTicket();
        t.processTicket();
        t.processTicket();

        t.viewNextTicket();
        System.out.println(t.toString());
    }
}
