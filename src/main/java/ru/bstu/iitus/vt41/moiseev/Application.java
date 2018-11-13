package ru.bstu.iitus.vt41.moiseev;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static ru.bstu.iitus.vt41.moiseev.TypeEquipmentEnum.showAllTypeEquipmentEnum;
import static ru.bstu.iitus.vt41.moiseev.TypeSportBallEnum.showAllTypeSportBallEnum;
import static ru.bstu.iitus.vt41.moiseev.TypeSportTrainingEnum.showAllTypeSportTrainingEnum;

public class Application {

    private static SportsEquipmentFactory createBall(TypeSportBallEnum typeBall) {
        SportsEquipmentFactory factory = null;

        switch (typeBall) {
            case TENNIS:
                factory = new TennisBallFactory();
                break;
            case VOLEYBALL:
                factory = new VolleyballBallFactory();
                break;
        }
        return factory;
    }

    private static SportsEquipmentFactory createTraining(TypeSportTrainingEnum typeTraining) {
        SportsEquipmentFactory factory = null;

        switch (typeTraining) {
            case POWERLIFTING:
                factory = new BarbellFactory();
                break;
            case WEIGHTLIFTING:
                factory = new WeightFactory();
                break;
        }
        return factory;
    }

    private static SportsEquipment createEquipment(TypeEquipmentEnum typeEqiupment) {
        SportsEquipmentFactory factory = null;

            switch (typeEqiupment) {
                case RACKET:
                    factory = new RacketFactory();
                    break;
                case JAVELIN:
                    factory = new JavelinFactory();
                    break;
                case BALL:
                    System.out.print("Мяч для какого вида спорта?\n" + showAllTypeSportBallEnum());
                    factory = inputChoiceBall();
                    break;
                case TRAINING:
                    System.out.print("Тренажерный для какого вида спорта?\n" + showAllTypeSportTrainingEnum());
                    factory = inputChoiceTraining();
                    break;
            }

        return factory.createSportsEquipment();
    }

    private static boolean isTennisEquipment(SportsEquipment equipment) {
        return TypeSportBallEnum.TENNIS.getName().equals(equipment.getSportType());
    }

    private static void inputInt(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            try {
                scanner.nextInt();
            } catch (InputMismatchException mEx) {
                System.out.print("Введите корректное значение! ");
                scanner.next();
            }
        }
    }

    private static void inputChoiceEquipment(List<SportsEquipment> equipment) {
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        inputInt(scanner);
        do {
            try {
                choice = scanner.nextInt();
                equipment.add(createEquipment(TypeEquipmentEnum.from(choice)));
            } catch (RuntimeException rEx) {
                System.out.print("Введите корректное значение! ");
                scanner.next();
            }
        } while ((choice < 1 || choice > TypeEquipmentEnum.values().length));
    }

    private static int inputSize() {
        Scanner scanner = new Scanner(System.in);

        int size = 0;

        inputInt(scanner);
        do {
            try {
                size = scanner.nextInt();
            } catch (RuntimeException rEx) {
                System.out.print("Введите корректное значение! ");
                scanner.next();
            }
        } while (size <= 0);

        return size;
    }

    private static SportsEquipmentFactory inputChoiceBall() {
        int choice = 0;

        SportsEquipmentFactory factory = null;

        Scanner scanner = new Scanner(System.in);

        inputInt(scanner);
        do {
            try {
                choice = scanner.nextInt();
                factory = createBall(TypeSportBallEnum.from(choice));
            } catch (RuntimeException rEx) {
                System.out.print("Введите корректное значение! ");
                scanner.next();
            }
        } while ((choice < 1 || choice > TypeEquipmentEnum.values().length));

        return factory;
    }

    private static SportsEquipmentFactory inputChoiceTraining() {
        int choice = 0;

        SportsEquipmentFactory factory = null;

        Scanner scanner = new Scanner(System.in);

        inputInt(scanner);
        do {
            try {
                choice = scanner.nextInt();
                factory = createTraining(TypeSportTrainingEnum.from(choice));
            } catch (RuntimeException rEx) {
                System.out.print("Введите корректное значение! ");
                scanner.next();
            }
        } while ((choice < 1 || choice > TypeEquipmentEnum.values().length));

        return factory;
    }

    private static void inputEquipment(List<SportsEquipment> equipment) {
        System.out.print("Введите количество спортивного инвентаря: ");
        int size = inputSize();

        for (int i = 0; i < size; i++) {
            System.out.println("Выберите тип спортивного инвентаря\n" + showAllTypeEquipmentEnum());
            inputChoiceEquipment(equipment);
        }
    }

    private static void outputTennisEquipment(List<SportsEquipment> equipment) {
        System.out.println("\nСписок теннисного инвентаря:");
        for (int i = 0; i < equipment.size(); i++) {
            System.out.println();
            if (isTennisEquipment(equipment.get(i)))
                System.out.print(i + 1 + "-й элемент инвентаря: " + equipment.get(i).toString() + "\n");
        }
    }

    private static void outputEquipment(List<SportsEquipment> equipment) {
        System.out.println("\nСписок инвентаря:");
        for (SportsEquipment equipments : equipment) {
            System.out.println();
            System.out.print(equipments.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        List<SportsEquipment> equipments = new ArrayList<>();

        inputEquipment(equipments);

        //outputTennisEquipment(equipments);

        outputEquipment(equipments);
    }
}
