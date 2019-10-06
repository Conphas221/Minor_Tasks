package com.example4.demo4;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    public String street;
    public String houseNumber;
    public String city;
    public String zipCode;
    public String country;


}
