package com.gregory.digitalwallet.dtos;

import com.gregory.digitalwallet.entities.Bank;

import java.io.Serializable;

public class BankDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String nickName;

    public BankDto() {}

    public BankDto(Bank bank) {
        id = bank.getId();
        name = bank.getName();
        nickName = bank.getNickName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "BankDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

}
