package ru.bstu.iitus.vt41.moiseev.Factory;

import ru.bstu.iitus.vt41.moiseev.Equipment.Barbell;
import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;

public class BarbellFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new Barbell();
    }

}
