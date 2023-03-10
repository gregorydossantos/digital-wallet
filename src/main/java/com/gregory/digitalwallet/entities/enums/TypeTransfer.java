package com.gregory.digitalwallet.entities.enums;

public enum TypeTransfer {

    CREDIT(1, "C"),
    DEBIT(2, "D");

    private final int key;
    private final String value;

    TypeTransfer(int key, String value) {
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
