package ru.bstu.iitus.vt41.moiseev;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Barbell extends Training {

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType("Тяжелая атлетика");
    }

    @Override
    public String toString() {
        return "Штанга \nВес штанги: " + getWeight() + "\nВид спорта: " + getSportType();
    }
}
