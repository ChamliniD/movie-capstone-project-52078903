package com.hcltech.movie_capstone_project.service;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;

import java.util.List;

public interface ActorService {

    List<ActorDTO> getAll();

    ActorDTO getOneById(int id);

    ActorDTO create(ActorDTO actorDTO);

    ActorDTO update(ActorDTO actorDTO);

    void delete(int id);
}
