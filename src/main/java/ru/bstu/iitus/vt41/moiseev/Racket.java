package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Racket extends SportsEquipment{

    private int length;

    public Racket() {}

    public int getLength() {
        return this.length;
    }

    public void setLength(int _length) {
        this.length = _length;
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите длину ракетки: ");
        this.setLength(scanner.nextInt());

        this.setSportType("Теннис");
    }

    @Override
    public String toString() {
        return "Ракетка \nДлина ракетки: " + this.getLength() + "\nВид спорта: " + this.getSportType();
    }
}
