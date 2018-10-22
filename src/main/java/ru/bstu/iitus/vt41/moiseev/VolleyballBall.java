package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class VolleyballBall extends Ball {

    public VolleyballBall() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType(TypeSportBallEnum.VOLEYBALL.getName());
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + getRadius() + "\nВид спорта: " + getSportType();
    }
}
