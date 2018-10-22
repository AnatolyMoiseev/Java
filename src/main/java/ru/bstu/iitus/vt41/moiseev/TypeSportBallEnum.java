package ru.bstu.iitus.vt41.moiseev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSportBallEnum {
    TENNIS(1),
    VOLEYBALL(2);

    private int value;

    public static TypeSportBallEnum from(int number) {
        for(TypeSportBallEnum ballEnum : TypeSportBallEnum.values()) {
            if (number == ballEnum.getValue()) {
                return ballEnum;
            }
        }
        throw new RuntimeException("type do not exist with this number: " + number);
    }

}
