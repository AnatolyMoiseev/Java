package ru.bstu.iitus.vt41.moiseev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportTrainingEnum {
    POWERLIFTING(1),
    WEIGHTLIFTING(2);

    private int value;

    public static TypeSportTrainingEnum from(int number) {
        for(TypeSportTrainingEnum trainingEnum : TypeSportTrainingEnum.values()) {
            if (number == trainingEnum.getValue()) {
                return trainingEnum;
            }
        }
        throw new RuntimeException("type do not exist with this number: " + number);
    }
}
