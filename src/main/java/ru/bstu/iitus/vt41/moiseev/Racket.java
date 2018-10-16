package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Racket extends SportsEquipment{

    private int length;

    public Racket() {}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите длину ракетки: ");
        setLength(scanner.nextInt());

        setSportType("Теннис");
    }

    @Override
    public String toString() {
        return "Ракетка \nДлина ракетки: " + getLength() + "\nВид спорта: " + getSportType();
    }
}
