package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Javelin extends SportsEquipment {

    private int length;

    public Javelin() {}

    public int getLength() {
        return this.length;
    }

    public void setLength(int _length) {
        this.length = _length;
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите длину копья: ");
        this.setLength(scanner.nextInt());

        this.setSportType("Метание копья");
    }

    @Override
    public String toString() {
        return "Копье \nДлина копья: " + this.getLength() + "\nВид спорта: " + this.getSportType();
    }


}
