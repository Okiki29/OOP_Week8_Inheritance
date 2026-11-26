package ie.atu.oop.task;

public class StudentTickets extends Tickets {

    // Only the new field. Shared fields stay in Ticket.
    private String studentId;

    // super(...) sends the shared values up to Ticket.
    public StudentTickets (String eventName, String holderName,
                         double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }

    // 20% discount means paying 80%. Uses the getter because basePrice is private.
    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.80;
    }
}
