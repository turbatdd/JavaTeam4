package assignmentLesson9.prob4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.random.RandomGenerator;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int idCount = 1;

    TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
    }

    public void addTicket(String description) {
        Ticket t = new Ticket(idCount++, description);
        ticketQueue.add(t);
    }

    public Ticket processTicket() {
        Ticket t = ticketQueue.poll();
        if (t == null) {
            System.out.println("No tickets to process.");
        } else {
            System.out.println("Processing: " + t);
        }
        return t;
    }

    public Ticket viewNextTicket() {
        Ticket t = ticketQueue.peek();
        if (t == null) {
            System.out.println("No tickets in queue.");
        } else {
            System.out.println("Next ticket: " + t);
        }
        return t;
    }

    @Override
    public String toString() {
        return ticketQueue.toString();
    }
}
