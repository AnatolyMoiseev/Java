package ru.bstu.iitus.vt41.moiseev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportBallEnum {
    TENNIS(1),
    VOLEYBALL(2);

    private int value;

    public static TypeSportBallEnum from(int source) {
        for(TypeSportBallEnum ballEnum : TypeSportBallEnum.values()) {
            if (source == ballEnum.getValue()) {
                return ballEnum;
            }
        }
        throw new RuntimeException("unable to create type with this number: " + source);
    }

}
