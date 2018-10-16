package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Weight extends Training {

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес штанги: ");
        setWeight(scanner.nextInt());

        setSportType("Гиревой спорт");
    }

    @Override
    public String toString() {
        return "Гиря \nВес гири: " + this.getWeight() + "\nВид спорта: " + this.getSportType();
    }
}
