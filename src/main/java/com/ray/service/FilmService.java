package com.ray.service;

import com.ray.dto.Film;
import com.ray.dto.Page;
import com.ray.dto.ResponseData;


public interface FilmService {
    
    boolean insertFilm(Film film);
    
    boolean deleteFilm(Long id);
    
    void deleteFilmCascade(Long id);
    
    boolean updateFilm(Film film);
    
    ResponseData<Film> findFilms(Page<Film> page);
    
}
