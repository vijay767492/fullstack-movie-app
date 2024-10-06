package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class movie1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moviename;
    private String moviegenre;
    private boolean hit;
    private String poster;
    private LocalDate releaseDate; 
    private Double rating;          
    private Integer duration;        
    private String heroName;        

    // Constructors
    public movie1() {
    }

    public movie1(String poster) {
        this.poster = poster;
    }

    public movie1(long id, String moviename, String moviegenre, boolean hit) {
        this.id = id;
        this.moviename = moviename;
        this.moviegenre = moviegenre;
        this.hit = hit;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviegenre() {
        return moviegenre;
    }

    public void setMoviegenre(String moviegenre) {
        this.moviegenre = moviegenre;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
