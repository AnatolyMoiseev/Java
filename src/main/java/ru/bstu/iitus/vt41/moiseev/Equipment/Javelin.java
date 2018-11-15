package ru.bstu.iitus.vt41.moiseev.Equipment;

import lombok.Data;
import ru.bstu.iitus.vt41.moiseev.Enums.TypeEquipmentEnum;

import java.util.Scanner;

@Data
public class Javelin extends SportsEquipment {

    private int length;

    public Javelin() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите длину копья: ");
        setLength(scanner.nextInt());

        setSportType(TypeEquipmentEnum.JAVELIN.getName());
    }

    @Override
    public String toString() {
        return "Копье \nДлина копья: " + getLength() + "\nВид спорта: " + getSportType();
    }


}
