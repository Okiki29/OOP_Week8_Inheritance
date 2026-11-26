package ie.atu.oop.task;

public class StudentTickets extends Tickets {


    private String studentId;


    public StudentTickets (String eventName, String holderName,
                         double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }


    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.80;
    }
}
