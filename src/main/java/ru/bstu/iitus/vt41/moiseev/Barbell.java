package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Barbell extends Training {

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес штанги: ");
        setWeight(scanner.nextInt());

        setSportType("Тяжелая атлетика");
    }

    @Override
    public String toString() {
        return "Штанга \nВес штанги: " + this.getWeight() + "\nВид спорта: " + this.getSportType();
    }
}
