package ru.bstu.iitus.vt41.moiseev;

public class JavelinFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new Javelin();
    }

}
