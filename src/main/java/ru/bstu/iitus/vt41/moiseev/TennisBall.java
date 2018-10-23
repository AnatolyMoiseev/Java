package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class TennisBall extends Ball{

    public TennisBall() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType(TypeSportBallEnum.TENNIS.getName());
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + getRadius() + "\nВид спорта: " + getSportType();
    }
}
