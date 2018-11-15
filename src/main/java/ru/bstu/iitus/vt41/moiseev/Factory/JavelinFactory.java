package ru.bstu.iitus.vt41.moiseev.Factory;

import ru.bstu.iitus.vt41.moiseev.Equipment.Javelin;
import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;

public class JavelinFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new Javelin();
    }

}
