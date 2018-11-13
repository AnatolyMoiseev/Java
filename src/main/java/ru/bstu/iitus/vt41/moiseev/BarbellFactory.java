package ru.bstu.iitus.vt41.moiseev;

public class BarbellFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new Barbell();
    }

}
