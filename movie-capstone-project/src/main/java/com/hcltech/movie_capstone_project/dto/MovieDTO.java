package com.hcltech.movie_capstone_project.dto;

import java.util.Set;

public class MovieDTO {

    private int id;

    private String title;

    private String status;

    private String tagline;

    private String overview;

    private double revenue;

    private Set<GenreDTO> genres;

    private Set<ActorDTO> actors;

    private Set<ReviewDTO> reviews;

    public MovieDTO() {
    }

    public MovieDTO(String title, String status, String tagline, String overview, double revenue, Set<GenreDTO> genres, Set<ActorDTO> actors, Set<ReviewDTO> reviews) {
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

    public Set<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(Set<GenreDTO> genres) {
        this.genres = genres;
    }

    public Set<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDTO> actors) {
        this.actors = actors;
    }

    public Set<ReviewDTO> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ReviewDTO> reviews) {
        this.reviews = reviews;
    }
}
