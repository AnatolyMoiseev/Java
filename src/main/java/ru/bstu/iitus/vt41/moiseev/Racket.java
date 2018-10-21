package ru.bstu.iitus.vt41.moiseev;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class Racket extends SportsEquipment{

    private int length;

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
