package com.example4.demo4;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Account extends BaseEntity {
    public Double balance;

    @ManyToOne(fetch = FetchType.EAGER)
    public Customer owner;

    @ManyToOne(fetch = FetchType.EAGER)
    public Employee manager;
}
