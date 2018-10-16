package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public abstract class SportsEquipment {
    private String sportType;

    public abstract void init(Scanner scanner);

    public String getSportType() {
        return this.sportType;
    }

    public void setSportType(String _sportType) {
        this.sportType = _sportType;
    }
}
