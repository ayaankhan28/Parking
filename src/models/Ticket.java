package models;

import java.util.Date;

public class Ticket extends BaseModel {
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Gates generatedAt;
    private OperatorCus generatedBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getAssignedSpot() {
        return assignedSpot;
    }

    public void setAssignedSpot(ParkingSpot assignedSpot) {
        this.assignedSpot = assignedSpot;
    }

    public Gates getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gates generatedAt) {
        this.generatedAt = generatedAt;
    }

    public OperatorCus getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(OperatorCus generatedBy) {
        this.generatedBy = generatedBy;
    }
}