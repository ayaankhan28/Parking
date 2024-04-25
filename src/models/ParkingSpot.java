package models;

import java.util.List;

public class ParkingSpot {
    public Long id;
    public Long number;
    public List<VehicleType> vehicleTypes;
    public Status status;
    public Long parkingFloorId;

}
