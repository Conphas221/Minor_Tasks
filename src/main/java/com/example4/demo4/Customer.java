package com.example4.demo4;


import javax.persistence.*;
import java.util.List;

@Entity
@TableGenerator(name="customerId", initialValue=0, allocationSize=50000)
public class Customer extends User {
    @OneToOne(cascade = CascadeType.ALL)

    @GeneratedValue(strategy=GenerationType.TABLE, generator="customerId")
    public Long customerId;

    @Embedded
    public Address address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Account> Accounts;

    @Enumerated
    public Gender gender;

}
