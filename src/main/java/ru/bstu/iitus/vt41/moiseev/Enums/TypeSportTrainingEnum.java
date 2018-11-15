package ru.bstu.iitus.vt41.moiseev.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportTrainingEnum {

    POWERLIFTING(1, "Тяжелая атлетика"),
    WEIGHTLIFTING(2, "Гиревой спорт");

    private int id;
    private String name;

    public static TypeSportTrainingEnum from(int number) {
        for(TypeSportTrainingEnum trainingEnum : TypeSportTrainingEnum.values()) {
            if (number == trainingEnum.getId()) {
                return trainingEnum;
            }
        }
        throw new RuntimeException("Не существует типа с данным числом: " + number);
    }

    public static String showAllTypeSportTrainingEnum() {
        String result = "";
        for(TypeSportTrainingEnum sportTrainingEnum : TypeSportTrainingEnum.values()) {
            result += sportTrainingEnum.id + " - " + sportTrainingEnum.getName() + "\n";
        }
        return result;
    }
}
