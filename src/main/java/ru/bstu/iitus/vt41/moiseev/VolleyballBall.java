package ru.bstu.iitus.vt41.moiseev;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class VolleyballBall extends Ball {

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        setSportType("Волейбол");
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + getRadius() + "\nВид спорта: " + getSportType();
    }
}
