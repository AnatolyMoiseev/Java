package ru.bstu.iitus.vt41.moiseev;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Training extends SportsEquipment{

    private int weight;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес штанги: ");
        setWeight(scanner.nextInt());
    }

}
