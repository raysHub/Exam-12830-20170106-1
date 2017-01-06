package com.ray.dao;

import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.ray.dto.Page;

public interface BaseDao<T> {

    void insert(T film);

    int deleteById(Long id) throws MySQLIntegrityConstraintViolationException;
    
    void update(T dto);

    List<T> select(Page<T> dto);

}
