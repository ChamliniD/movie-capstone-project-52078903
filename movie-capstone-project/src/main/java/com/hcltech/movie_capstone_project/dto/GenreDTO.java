package com.hcltech.movie_capstone_project.dto;

public class GenreDTO {

    private int id;

    private String name;

    public GenreDTO() {
    }

    public GenreDTO(String name) {
        this.name = name;
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
}
