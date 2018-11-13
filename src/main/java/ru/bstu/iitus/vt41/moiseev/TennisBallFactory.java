package ru.bstu.iitus.vt41.moiseev;

public class TennisBallFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new TennisBall();
    }

}
