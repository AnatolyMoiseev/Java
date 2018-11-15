package ru.bstu.iitus.vt41.moiseev.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportBallEnum {

    TENNIS(1, "Теннис"),
    VOLEYBALL(2, "Воллейбол");

    private int id;
    private String name;

    public static TypeSportBallEnum from(int number) {
        for(TypeSportBallEnum ballEnum : TypeSportBallEnum.values()) {
            if (number == ballEnum.getId()) {
                return ballEnum;
            }
        }
        throw new RuntimeException("Не существует типа с данным числом: " + number);
    }

    public static String showAllTypeSportBallEnum() {
        String result = "";
        for(TypeSportBallEnum sportBallEnum : TypeSportBallEnum.values()) {
            result += sportBallEnum.id + " - " + sportBallEnum.getName() + "\n";
        }
        return result;
    }

}
