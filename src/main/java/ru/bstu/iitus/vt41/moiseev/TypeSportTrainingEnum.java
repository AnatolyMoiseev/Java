package ru.bstu.iitus.vt41.moiseev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportTrainingEnum {
    POWERLIFTING(1, "Тяжелая атлетика"),
    WEIGHTLIFTING(2, "Гиревый спорт");

    private int id;
    private String name;

    public static TypeSportTrainingEnum from(int number) {
        for(TypeSportTrainingEnum trainingEnum : TypeSportTrainingEnum.values()) {
            if (number == trainingEnum.getId()) {
                return trainingEnum;
            }
        }
        throw new RuntimeException("type do not exist with this number: " + number);
    }
}
