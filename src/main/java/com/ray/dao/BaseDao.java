package com.ray.dao;

import java.util.List;

import com.ray.dto.Page;

public interface BaseDao<T> {

    void insert(T film);

    int deleteById(Long id);
    
    void update(T dto);

    List<T> select(Page<T> dto);

}
