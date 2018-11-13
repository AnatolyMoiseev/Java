package ru.bstu.iitus.vt41.moiseev;

public class VolleyballBallFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new VolleyballBall();
    }

}
