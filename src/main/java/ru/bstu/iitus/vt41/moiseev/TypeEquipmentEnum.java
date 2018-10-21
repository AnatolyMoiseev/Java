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

    public static TypeEquipmentEnum from(int source) {
        for(TypeEquipmentEnum equipmentEnum : TypeEquipmentEnum.values()) {
            if (source == equipmentEnum.getValue()) {
                return equipmentEnum;
            }
        }
        throw new RuntimeException("unable to create type with this number: " + source);
    }



}
