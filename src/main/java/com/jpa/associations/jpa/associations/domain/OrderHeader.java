package com.jpa.associations.jpa.associations.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class OrderHeader extends BaseEntity{
    private String Customer;
    private String address;
    @OneToMany(mappedBy = "orderHeader")
    private Set<OrderLine> orderLines;


}
