package ru.bstu.iitus.vt41.moiseev;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeEquipmentEnum {
    BALL(1),
    RACKET(2),
    JAVELIN(3),
    TRAINING(4);

    private int value;

    public static TypeEquipmentEnum from(int number) {
        for(TypeEquipmentEnum equipmentEnum : TypeEquipmentEnum.values()) {
            if (number == equipmentEnum.getValue()) {
                return equipmentEnum;
            }
        }
        throw new RuntimeException("type do not exist with this number: " + number);
    }

}
