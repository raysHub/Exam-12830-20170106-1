package com.ray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ray.dto.Film;
import com.ray.dto.Language;
import com.ray.dto.Page;
import com.ray.dto.ResponseData;
import com.ray.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;
    
    @RequestMapping(path="/select", method = RequestMethod.GET)
    public ResponseData<Film> query(
            @RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "description", required = false, defaultValue = "") String description,
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "100") int pageSize) {
        Page<Film> p = new Page<Film>().setPage(page).setPageSize(pageSize)
                .setEntity(new Film().setTitle(title).setDescription(description));
        return filmService.findFilms(p).setPageNow(page);
    }
    
    @RequestMapping(path="/update",method = RequestMethod.GET)
    public String update(
            @RequestParam(name = "filmId", required = false) Long filmId,
            @RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "description", required = false, defaultValue = "") String description,
            @RequestParam(name = "language", required = false, defaultValue = "english") String language){
        Film film = new Film().setFilmId(filmId).setTitle(title).setDescription(description).setLanguage(new Language().setName(language));
        if(filmService.updateFilm(film)){
            return "true";
        }else{
            return "语言输入错误!";
        }
        
    }
    
    
}
