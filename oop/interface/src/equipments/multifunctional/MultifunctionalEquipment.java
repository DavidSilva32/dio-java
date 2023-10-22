package equipments.multifunctional;

import equipments.copier.Copier;
import equipments.digitizer.Digitizer;
import equipments.printer.Printer;

public class MultifunctionalEquipment implements Copier, Digitizer, Printer {

    public void copy() {
        System.out.println("Copying via multifunctional equipment");
    }

    public void digitize() {
        System.out.println("Digitizing via multifunctional equipment");
    }

    public void print() {
        System.out.println("printing via multifunctional equipment");
    }

}
