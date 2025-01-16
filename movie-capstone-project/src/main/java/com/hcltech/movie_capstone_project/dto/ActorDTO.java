package com.hcltech.movie_capstone_project.dto;

public class ActorDTO {

    private int id;

    private String name;

    private char gender;

    private int popularity;

    public ActorDTO() {
    }

    public ActorDTO(String name, char gender, int popularity) {
        this.name = name;
        this.gender = gender;
        this.popularity = popularity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
}
