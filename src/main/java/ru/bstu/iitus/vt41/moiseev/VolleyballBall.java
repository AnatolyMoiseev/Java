package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class VolleyballBall extends Ball {

    public VolleyballBall() {}

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите радиус мяча: ");
        setRadius(scanner.nextInt());

        setSportType("Волейбол");
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + this.getRadius() + "\nВид спорта: " + this.getSportType();
    }
}
