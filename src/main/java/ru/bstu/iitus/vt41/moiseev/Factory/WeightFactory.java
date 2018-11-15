package ru.bstu.iitus.vt41.moiseev.Factory;

import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;
import ru.bstu.iitus.vt41.moiseev.Equipment.Weight;

public class WeightFactory extends SportsEquipmentFactory {

    public SportsEquipment createSportsEquipment() {
        return new Weight();
    }

}
