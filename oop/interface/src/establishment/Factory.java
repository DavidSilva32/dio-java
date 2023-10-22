package establishment;

import equipments.multifunctional.MultifunctionalEquipment;

public class Factory {
    public static void main(String[] args) {
        MultifunctionalEquipment em = new MultifunctionalEquipment();

        em.copy();
        em.digitize();
        em.print();
    }
}
