package com.gregory.digitalwallet.dtos;

import com.gregory.digitalwallet.entities.Account;

import java.io.Serializable;
import java.math.BigDecimal;

public class AccountDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer agency;
    private Integer number;
    private BigDecimal balance;
    private PersonDto person;
    private BankDto bank;

    public AccountDto() {}

    public AccountDto(Account account) {
        id = account.getId();
        agency = account.getAgency();
        number = account.getNumber();
        balance = account.getBalance();
        person = new PersonDto(account.getPerson());
        bank = new BankDto(account.getBank());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public BankDto getBank() {
        return bank;
    }

    public void setBank(BankDto bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", agency=" + agency +
                ", number=" + number +
                ", balance=" + balance +
                ", person=" + person +
                ", bank=" + bank +
                '}';
    }

}
