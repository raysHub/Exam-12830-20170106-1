package com.ray.dao;

import org.springframework.stereotype.Component;

import com.ray.dto.Language;

@Component
public interface LanguageDao extends BaseDao<Language> {

    public int findLanguageId(Long id);
    
    public Long findIdByName(String name);
    
}
