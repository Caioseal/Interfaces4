package devices;

public class ComboDevice extends Device implements InterfacePrinter, InterfaceScanner{

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo device processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo device printing: " + doc);
    }

    @Override
    public String scan() {
        return "Document scanned";
    }
}
