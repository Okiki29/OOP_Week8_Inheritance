package ie.atu.oop.task;

public class VIPTicket extends Tickets {

    // No extra fields, so the constructor just forwards to Ticket.
    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    // VIP surcharge: base price plus €25.
    @Override
    public double calculatePrice() {
        return getBasePrice() + 25;
    }

    // Text must match the lab exactly.
    public String getBenefits() {
        return "Priority entry and reserved seating";
    }
}
