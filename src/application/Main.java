package application;

import devices.ComboDevice;
import devices.Printer;
import devices.Scanner;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");

        System.out.println();
        Scanner scanner = new Scanner("2003");
        scanner.processDoc("My e-mail");
        System.out.println("Scanner: " + scanner.scan());

        System.out.println();
        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println("Scan result: " + comboDevice.scan());
    }
}
