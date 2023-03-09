package com.gregory.digitalwallet.entities;

import com.gregory.digitalwallet.entities.enums.TypeTransfer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TB_RELEASES")
public class Releases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer branchOrigin;

    @Column(nullable = false)
    private Integer branchDestiny;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private Instant dateHour;

    @Column(nullable = false)
    private TypeTransfer typeTransfer;

}
