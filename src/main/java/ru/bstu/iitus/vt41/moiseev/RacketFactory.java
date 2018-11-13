package ru.bstu.iitus.vt41.moiseev;

public class RacketFactory extends SportsEquipmentFactory {

    @Override
    public SportsEquipment createSportsEquipment() {
        return new Racket();
    }

}
