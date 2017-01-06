package com.ray.dto;

import java.sql.Date;

public class Film {

    private Long filmId;

    private String title;

    private String description;

    private Date releaseYear;

    private Language language;

    private Integer originalLanguageId;

    private Integer rentalDuration;

    private Float rentalRate;

    private Long length;

    private Float replacementCost;

    private String rating;

    private String specialFeatures;

    private Date lastUpdate;

    public Long getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public Language getLanguage() {
        return language;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public Float getRentalRate() {
        return rentalRate;
    }

    public Long getLength() {
        return length;
    }

    public Float getReplacementCost() {
        return replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public Film setFilmId(Long filmId) {
        this.filmId = filmId;
        return this;
    }

    public Film setTitle(String title) {
        this.title = title;
        return this;
    }

    public Film setDescription(String description) {
        this.description = description;
        return this;
    }

    public Film setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public Film setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public Film setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
        return this;
    }

    public Film setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }

    public Film setRentalRate(Float rentalRate) {
        this.rentalRate = rentalRate;
        return this;
    }

    public Film setLength(Long length) {
        this.length = length;
        return this;
    }

    public Film setReplacementCost(Float replacementCost) {
        this.replacementCost = replacementCost;
        return this;
    }

    public Film setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public Film setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
        return this;
    }

    public Film setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

}
