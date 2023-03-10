package com.gregory.digitalwallet.dtos;

import com.gregory.digitalwallet.entities.Releases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

public class ReleasesDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer branchOrigin;
    private Integer branchDestiny;
    private BigDecimal amount;
    private Instant dateHour;
    private String typeTransfer;

    public ReleasesDto() {}

    public ReleasesDto(Releases release) {
        id = release.getId();
        branchOrigin = release.getBranchOrigin();
        branchDestiny = release.getBranchDestiny();
        amount = release.getAmount();
        dateHour = release.getDateHour();
        typeTransfer = release.getTypeTransfer().getValue();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBranchOrigin() {
        return branchOrigin;
    }

    public void setBranchOrigin(Integer branchOrigin) {
        this.branchOrigin = branchOrigin;
    }

    public Integer getBranchDestiny() {
        return branchDestiny;
    }

    public void setBranchDestiny(Integer branchDestiny) {
        this.branchDestiny = branchDestiny;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getDateHour() {
        return dateHour;
    }

    public void setDateHour(Instant dateHour) {
        this.dateHour = dateHour;
    }

    public String getTypeTransfer() {
        return typeTransfer;
    }

    public void setTypeTransfer(String typeTransfer) {
        this.typeTransfer = typeTransfer;
    }

    @Override
    public String toString() {
        return "ReleasesDto{" +
                "id=" + id +
                ", branchOrigin=" + branchOrigin +
                ", branchDestiny=" + branchDestiny +
                ", amount=" + amount +
                ", dateHour=" + dateHour +
                ", typeTransfer=" + typeTransfer +
                '}';
    }

}
