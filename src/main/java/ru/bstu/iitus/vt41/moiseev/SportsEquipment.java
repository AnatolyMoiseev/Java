package ru.bstu.iitus.vt41.moiseev;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class SportsEquipment {
    private String sportType;

    public abstract void init(Scanner scanner);

}
