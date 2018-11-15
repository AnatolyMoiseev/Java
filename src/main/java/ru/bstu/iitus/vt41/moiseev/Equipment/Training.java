package ru.bstu.iitus.vt41.moiseev.Equipment;

import lombok.Data;
import ru.bstu.iitus.vt41.moiseev.Equipment.SportsEquipment;

import java.util.Scanner;

@Data
public abstract class Training extends SportsEquipment {

    private int weight;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес снаряда: ");
        this.weight = scanner.nextInt();
    }

}
