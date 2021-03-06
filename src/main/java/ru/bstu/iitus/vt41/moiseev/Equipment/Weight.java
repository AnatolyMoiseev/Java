package ru.bstu.iitus.vt41.moiseev.Equipment;

import ru.bstu.iitus.vt41.moiseev.Enums.TypeSportTrainingEnum;
import ru.bstu.iitus.vt41.moiseev.Equipment.Training;

import java.util.Scanner;

public class Weight extends Training {

	public Weight() {
		Scanner scanner = new Scanner(System.in);
		init(scanner);
	}

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType(TypeSportTrainingEnum.WEIGHTLIFTING.getName());
    }

    @Override
    public String toString() {
        return "Гиря \nВес гири: " + getWeight() + "\nВид спорта: " + getSportType();
    }
}
