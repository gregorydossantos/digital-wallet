package com.gregory.digitalwallet.entities.enums;

public enum TypePerson {

    PHYSICAL(1, "P"),
    LEGAL (2, "L");

    private final int key;
    private final String value;

    TypePerson(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
