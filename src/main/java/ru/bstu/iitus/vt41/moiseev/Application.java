package ru.bstu.iitus.vt41.moiseev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.bstu.iitus.vt41.moiseev.TypeEquipmentEnum.showAllTypeEquipmentEnum;
import static ru.bstu.iitus.vt41.moiseev.TypeSportBallEnum.showAllTypeSportBallEnum;
import static ru.bstu.iitus.vt41.moiseev.TypeSportTrainingEnum.showAllTypeSportTrainingEnum;

public class Application {

    public static Ball createBall(TypeSportBallEnum typeBall) {

        Ball ball = null;

        switch (typeBall) {
            case TENNIS:
                ball = new TennisBall();
                break;
            case VOLEYBALL:
                ball = new VolleyballBall();
                break;
        }
        return ball;
    }

    public static Training createTraining(TypeSportTrainingEnum typeTraining) {

        Training training = null;

        switch (typeTraining) {
            case POWERLIFTING:
                training = new Barbell();
                break;
            case WEIGHTLIFTING:
                training = new Weight();
                break;
        }
        return training;
    }

    public static SportsEquipment createEquipment(TypeEquipmentEnum typeEqiupment) {

        SportsEquipment equipment = null;

        Scanner scanner = new Scanner(System.in);

        int choice;

        switch (typeEqiupment) {
            case RACKET:
                equipment = new Racket();
                break;
            case JAVELIN:
                equipment = new Javelin();
                break;
            case BALL:
                do {
                    System.out.print("Мяч для какого вида спорта?\n" + showAllTypeSportBallEnum());
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > TypeSportBallEnum.values().length);
                equipment = createBall(TypeSportBallEnum.from(choice));
                break;
            case TRAINING:
                do {
                    System.out.print("Тренажерный для какого вида спорта?\n" + showAllTypeSportTrainingEnum());
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > TypeSportTrainingEnum.values().length);
                equipment = createTraining(TypeSportTrainingEnum.from(choice));
                break;
        }
        return equipment;
    }

    public static boolean isTennisEquipment(SportsEquipment equipment) {
        return TypeSportBallEnum.TENNIS.getName().equals(equipment.getSportType());
    }

    public static void inputEquipment(List<SportsEquipment> equipment) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество спортивного инвентаря: ");
        int size = scanner.nextInt();


        int choice;

        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Выберите тип спортивного инвентаря\n" + showAllTypeEquipmentEnum());
                choice = scanner.nextInt();
            } while (choice < 1 || choice > TypeEquipmentEnum.values().length);

            equipment.add(createEquipment(TypeEquipmentEnum.from(choice)));
        }
    }

    public static void outputTennisEquipment(List<SportsEquipment> equipment) {
        for (int i = 0; i < equipment.size(); i++) {
            System.out.println();
            if (isTennisEquipment(equipment.get(i)))
                System.out.print(i + 1 + "-й элемент инвентаря: " + equipment.get(i).toString() + "\n");
        }
    }

    public static void main(String[] args) {

        List<SportsEquipment> equipments = new ArrayList<>();

        inputEquipment(equipments);

        outputTennisEquipment(equipments);
    }
}
