package com.ray.dao;

import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.ray.dto.Film;
import com.ray.dto.Page;

public interface FilmDao extends BaseDao<Film> {

    @Override
    void insert(Film film);

    @Override
    int deleteById(Long id) throws MySQLIntegrityConstraintViolationException;

    @Override
    void update(Film film);

    @Override
    List<Film> select(Page<Film> film);

    int selectCount(Film film);
    

}
