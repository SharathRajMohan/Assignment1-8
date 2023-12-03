public class Car extends Vehicle {
    // Properties
    private Gear transmission = Gear.Automatic;
    private VehicleType type = VehicleType.Sedan;

    // Methods
    public Car(String make, String plate, String color, VehicleType category, Gear transmission, VehicleType type) {
        super(make, plate, color, category);
        this.transmission = transmission;
        this.type = type;
    }

    public Gear getTransmission() {
        return transmission;
    }

    public void setTransmission(Gear transmission) {
        this.transmission = transmission;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee has a car.\n"+
        super.toString()+
        "\t- gear type: "+this.getTransmission()+"\n" +
        "\t- type: "+this.getType()+"\n" ;
    }
}
