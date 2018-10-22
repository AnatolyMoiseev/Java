package ru.bstu.iitus.vt41.moiseev;

import lombok.Data;

import java.util.Scanner;

@Data
public class Racket extends SportsEquipment{

    private int length;

    public Racket() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
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
