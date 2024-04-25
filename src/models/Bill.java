package models;

import java.util.List;

public class Bill {
    public Long id;
    public Ticket ticket;
    public String exitTime;
    public Long amount;
    public List<Payment> payments;
    public Status status;
}
