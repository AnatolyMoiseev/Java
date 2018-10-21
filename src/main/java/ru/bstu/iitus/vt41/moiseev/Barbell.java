package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Barbell extends Training {

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес штанги: ");
        setWeight(scanner.nextInt());

        setSportType("Тяжелая атлетика");
    }

    @Override
    public String toString() {
        return "Штанга \nВес штанги: " + getWeight() + "\nВид спорта: " + getSportType();
    }
}
