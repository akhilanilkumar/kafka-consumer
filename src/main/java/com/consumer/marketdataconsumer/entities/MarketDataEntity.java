package com.consumer.marketdataconsumer.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * The type Market data.
 */
@Table(name = "MarketDataEntity")
@Entity
@Getter
@Setter
public class MarketDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private BigDecimal price;

    @Column
    private String ricCode;

    @Column
    private String lastUpdatedTime;

}
