package ru.bstu.iitus.vt41.moiseev;

import java.util.Scanner;

public class Application {

    public static SportsEquipment createEquipment(int _choice) {

        SportsEquipment equipment = null;

        switch (_choice) {
            case 2:
                equipment = new Racket();
                break;
            case 3:
                equipment = new Javelin();
                break;
            case 5:
                equipment = new VolleyballBall();
                break;
            case 6:
                equipment = new TennisBall();
                break;
            case 7:
                equipment = new Barbell();
                break;
            case 8:
                equipment = new Weight();
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
        SportsEquipment[] equipment = new SportsEquipment[scanner.nextInt()];

        for (int i = 0; i < equipment.length; i++) {
            System.out.println("Выберите тип спортивного инвентаря\n" + "1 - Мяч\n" + "2 - Ракетка\n" + "3 - Метательное копье\n" + "4 - Тренажерный\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Мяч для какого вида спорта?\n" + "5 - для волейбола\n" + "6 - для тенниса\n");
                    choice = scanner.nextInt();
                    break;
                case 4:
                    System.out.print("Тренажерный для какого вида спорта?\n" + "7 - для тяжелой атлетики\n" + "8 - для гиревого спорта\n");
                    choice = scanner.nextInt();
                    break;
            }
            equipment[i] = createEquipment(choice);
            equipment[i].init(scanner);
        }

        for (int i = 0; i < equipment.length; i++) {
            System.out.println();
            if (isTennisEquipment(equipment[i]))
                System.out.print(i + 1 + "-й элемент инвентаря: " + equipment[i].toString() + "\n");
        }
    }
}
