package ru.bstu.iitus.vt41.moiseev.Equipment;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Ball extends SportsEquipment {

    private int radius;

    public void init(Scanner scanner) {
        System.out.print("Введите радиус мяча: ");
        this.radius = scanner.nextInt();
    }

}
