package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class TennisBall extends Ball{

    public TennisBall() {}

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите радиус мяча: ");
        setRadius(scanner.nextInt());

        setSportType("Теннис");
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + this.getRadius() + "\nВид спорта: " + this.getSportType();
    }
}
