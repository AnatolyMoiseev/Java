package ru.bstu.iitus.vt41.moiseev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportTrainingEnum {
    POWERLIFTING(1),
    WEIGHTLIFTING(2);

    private int value;

    public static TypeSportTrainingEnum from(int source) {
        for(TypeSportTrainingEnum trainingEnum : TypeSportTrainingEnum.values()) {
            if (source == trainingEnum.getValue()) {
                return trainingEnum;
            }
        }
        throw new RuntimeException("unable to create type with this number: " + source);
    }
}
