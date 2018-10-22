package ru.bstu.iitus.vt41.moiseev;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Weight extends Training {

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        setSportType("Гиревой спорт");
    }

    @Override
    public String toString() {
        return "Гиря \nВес гири: " + getWeight() + "\nВид спорта: " + getSportType();
    }
}
