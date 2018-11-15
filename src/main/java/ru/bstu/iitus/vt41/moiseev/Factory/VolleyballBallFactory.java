package ru.bstu.iitus.vt41.moiseev.Factory;

import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;
import ru.bstu.iitus.vt41.moiseev.Equipment.VolleyballBall;

public class VolleyballBallFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new VolleyballBall();
    }

}
