package com.ray.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.dao.FilmDao;
import com.ray.dao.LanguageDao;
import com.ray.dto.Film;
import com.ray.dto.Page;
import com.ray.dto.ResponseData;
import com.ray.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDao filmDao;

    @Autowired
    private LanguageDao languageDao;

    /**
     * 插入film信息,接收从前台传来的film对象
     */
    @Override
    public boolean insertFilm(Film film) {
        // 用输入的语言ID去找language表，看有没有此ID，有就返回true，没有就返回false
        if (languageDao.findLanguageId(film.getLanguage().getLanguageId()) > 0) {
            filmDao.insert(film);
            return true;
        }
        return false;
    }

    public ResponseData<Film> findFilms(Page<Film> film) {
        ResponseData<Film> responseData = new ResponseData<>();
        List<Film> list = filmDao.select(film);
        responseData.setRows(list);
        responseData.setTotal(filmDao.selectCount((Film) film.getEntity()));
        return responseData;
    }

    /**
     * 根据id删除film表相关数据,先判断有没有级联关系,如果有,返回false,并且提示用户,没有,删掉,返回true
     */
    @Override
    public boolean deleteFilm(Long id) {

        return false;
    }

    /**
     * 当用户确认级联删除之后,先删掉相关子表的数据,再删film表数据
     */
    @Override
    public void deleteFilmCascade(Long id) {
    }

    @Override
    public boolean updateFilm(Film film) {
        if (languageDao.findIdByName(film.getLanguage().getName()) != null) {
            film.getLanguage().setLanguageId(languageDao.findIdByName(film.getLanguage().getName()));
            filmDao.update(film);
            return true;
        }
        return false;
    }
}
