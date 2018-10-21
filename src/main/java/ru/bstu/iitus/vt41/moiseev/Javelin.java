package ru.bstu.iitus.vt41.moiseev;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class Javelin extends SportsEquipment {

    private int length;
    private int weight;

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
