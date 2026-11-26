package ie.atu.oop.task;

public class Main {
    public static void main(String[] args) {

        // Three tickets: same event and base price, different types.
        Tickets standard = new Tickets ("Summer Concert", "Alice", 50.0);
        StudentTickets student = new StudentTickets ("Summer Concert", "Bob", 50.0, "S12345");
        VIPTicket vip = new VIPTicket("Summer Concert", "Charlie", 50.0);

        System.out.println("Event: " + standard.getEventName());

        // Prices come only from calculatePrice(). Main never recalculates them.
        System.out.printf("Standard Ticket - %s: €%.2f%n",
                standard.getHolderName(), standard.calculatePrice());
        System.out.printf("Student Ticket - %s: €%.2f%n",
                student.getHolderName(), student.calculatePrice());
        System.out.printf("VIP Ticket - %s: €%.2f%n",
                vip.getHolderName(), vip.calculatePrice());

        // Details that exist only on the subclasses.
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Benefits: " + vip.getBenefits());
    }
}
