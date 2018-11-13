package ru.bstu.iitus.vt41.moiseev;

public class WeightFactory extends SportsEquipmentFactory {

    public SportsEquipment createSportsEquipment() {
        return new Weight();
    }

}
