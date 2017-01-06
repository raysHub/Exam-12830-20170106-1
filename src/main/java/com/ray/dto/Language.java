package com.ray.dto;

import java.sql.Date;

public class Language {
    
    private Long languageId;
    
    private String name;
    
    private Date lastUpdate;

    public Long getLanguageId() {
        return languageId;
    }

    public Language setLanguageId(Long languageId) {
        this.languageId = languageId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Language setName(String name) {
        this.name = name;
        return this;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public Language setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

}
