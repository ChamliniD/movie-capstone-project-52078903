package com.hcltech.movie_capstone_project.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 50)
    private String title;

    private String status;

    private String tagline;

    private String overview;

    private double revenue;

    @OneToMany(mappedBy = "movie", cascade =  CascadeType.ALL, orphanRemoval = true)
    private Set<Genre> genres;

    @OneToMany(mappedBy = "movie", cascade =  CascadeType.ALL, orphanRemoval = true)
    private Set<Actor> actors;

    @OneToMany(mappedBy = "movie", cascade =  CascadeType.ALL, orphanRemoval = true)
    private Set<Review> reviews;

    public Movie() {
    }

    public Movie(int id, String title, String status, String tagline, String overview, double revenue, Set<Genre> genres, Set<Actor> actors, Set<Review> reviews) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.tagline = tagline;
        this.overview = overview;
        this.revenue = revenue;
        this.genres = genres;
        this.actors = actors;
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}
