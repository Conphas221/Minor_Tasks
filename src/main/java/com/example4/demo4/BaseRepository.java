package com.example4.demo4;

import org.springframework.data.repository.Repository;
import java.io.Serializable;

public interface BaseRepository<Type, Id extends Serializable> extends Repository<Type, Id> {
    Type findOne(Id id);
    Type save(Type entity);
}
