package ru.bstu.iitus.vt41.moiseev;

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
        throw new RuntimeException("type do not exist with this number: " + number);
    }

}
