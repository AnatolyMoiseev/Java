package ru.bstu.iitus.vt41.moiseev.Factory;

import ru.bstu.iitus.vt41.moiseev.Equipment.Racket;
import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;

public class RacketFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new Racket();
    }

}
