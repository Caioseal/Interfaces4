package devices;

public abstract class Device {

    //Attribute
    String serialNumber;

    //Constructor
    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Getter and Setter
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Functions
    public abstract void processDoc(String doc);
}
