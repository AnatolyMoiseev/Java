package ru.bstu.iitus.vt41.moiseev;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class TennisBall extends Ball{

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите радиус мяча: ");
        setRadius(scanner.nextInt());

        setSportType("Теннис");
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + getRadius() + "\nВид спорта: " + getSportType();
    }
}
