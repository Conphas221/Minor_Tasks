package com.example4.demo4;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Employee extends User {
    public String function;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Account> managedBankAccounts;

}