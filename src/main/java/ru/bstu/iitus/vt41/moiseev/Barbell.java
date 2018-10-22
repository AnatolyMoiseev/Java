package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Barbell extends Training {

    public Barbell() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

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
