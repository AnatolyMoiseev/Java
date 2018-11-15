package ru.bstu.iitus.vt41.moiseev.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeEquipmentEnum {

    BALL(1, "Мяч"),
    RACKET(2, "Ракетка"),
    JAVELIN(3, "Метательное копье"),
    TRAINING(4, "Тренажерный");

    private int id;
    private String name;

    public static TypeEquipmentEnum from(int number) {
        for(TypeEquipmentEnum equipmentEnum : TypeEquipmentEnum.values()) {
            if (number == equipmentEnum.getId()) {
                return equipmentEnum;
            }
        }
        throw new RuntimeException("Не существует типа с данным числом: " + number);
    }

    public static String showAllTypeEquipmentEnum() {
        String result = "";
        for(TypeEquipmentEnum equipmentEnum : TypeEquipmentEnum.values()) {
            result += equipmentEnum.id + " - " + equipmentEnum.name + "\n";
        }
        return result;
    }

}
