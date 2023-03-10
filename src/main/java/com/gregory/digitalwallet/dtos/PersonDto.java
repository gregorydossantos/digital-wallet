package com.gregory.digitalwallet.dtos;

import com.gregory.digitalwallet.entities.Person;

import java.io.Serializable;

public class PersonDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpfCnpj;
    private String typePerson;

    public PersonDto() {}

    public PersonDto(Person person) {
        id = person.getId();
        name = person.getName();
        cpfCnpj = person.getCpfCnpj();
        typePerson = person.getTypePerson().getValue();
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", typePerson=" + typePerson +
                '}';
    }

}
