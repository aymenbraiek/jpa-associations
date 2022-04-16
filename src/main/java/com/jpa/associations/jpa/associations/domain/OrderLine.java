package com.jpa.associations.jpa.associations.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine extends BaseEntity{
    private Integer quatityOrdered;
    @ManyToOne
    @JoinColumn(name="orderId")
    private OrderHeader orderHeader;

    @ManyToOne
    private Product produit;

}
