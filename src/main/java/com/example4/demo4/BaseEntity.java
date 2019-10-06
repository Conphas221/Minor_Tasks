package com.example4.demo4;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class BaseEntity {
    @Id
    @GeneratedValue()
    public Long id;

    @CreationTimestamp
    public Date created;

    @UpdateTimestamp
    public Date updated;
}
