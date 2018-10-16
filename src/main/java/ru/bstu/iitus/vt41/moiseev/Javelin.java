package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Javelin extends SportsEquipment {

    private int length;

    public Javelin() {}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите длину копья: ");
        setLength(scanner.nextInt());

        setSportType("Метание копья");
    }

    @Override
    public String toString() {
        return "Копье \nДлина копья: " + getLength() + "\nВид спорта: " + getSportType();
    }


}
