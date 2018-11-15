package ru.bstu.iitus.vt41.moiseev.Factory;

import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;
import ru.bstu.iitus.vt41.moiseev.Equipment.TennisBall;

public class TennisBallFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new TennisBall();
    }

}
