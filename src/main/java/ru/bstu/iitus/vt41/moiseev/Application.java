package ru.bstu.iitus.vt41.moiseev;

import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.print("Мяч для какого вида спорта?\n" + "1 - для тенниса\n" + "2 - для волейбола\n");
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > TypeSportBallEnum.values().length);
                equipment = createBall(TypeSportBallEnum.from(choice));
                break;
            case TRAINING:
                do {
                    System.out.print("Тренажерный для какого вида спорта?\n" + "1 - для тяжелой атлетики\n" + "2 - для гиревого спорта\n");
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > TypeSportTrainingEnum.values().length);
                equipment = createTraining(TypeSportTrainingEnum.from(choice));
                break;
        }
        return equipment;
    }

    public static boolean isTennisEquipment(SportsEquipment equipment) {
        if (equipment.getSportType().equals("Теннис"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите количество спортивного инвентаря: ");
        int size = scanner.nextInt();
        ArrayList<SportsEquipment> equipments = new ArrayList<>();

        int choice;

        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Выберите тип спортивного инвентаря\n" + "1 - Мяч\n" + "2 - Ракетка\n" + "3 - Метательное копье\n" + "4 - Тренажерный\n");
                choice = scanner.nextInt();
            } while (choice < 1 || choice > TypeEquipmentEnum.values().length);

            equipments.add(createEquipment(TypeEquipmentEnum.from(choice)));
            equipments.get(i).init(scanner);
        }

        for (int i = 0; i < size; i++) {
            System.out.println();
            if (isTennisEquipment(equipments.get(i)))
                System.out.print(i + 1 + "-й элемент инвентаря: " + equipments.get(i).toString() + "\n");
        }
    }
}
