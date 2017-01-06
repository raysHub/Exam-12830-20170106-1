package com.ray.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.dao.LanguageDao;
import com.ray.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    LanguageDao languageDao;
    
    @Override
    public Long findIdByName(String name) {
        return languageDao.findIdByName(name);
    }

}
