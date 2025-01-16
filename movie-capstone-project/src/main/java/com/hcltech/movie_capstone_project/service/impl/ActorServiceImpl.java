package com.hcltech.movie_capstone_project.service.impl;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.repository.ActorRepository;
import com.hcltech.movie_capstone_project.service.ActorService;
import com.hcltech.movie_capstone_project.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private MapperService mapper;

    @Override
    public List<ActorDTO> getAll() {
        return mapper.toDTOActor(actorRepository.findAll());
    }

    @Override
    public ActorDTO getOneById(int id) {
        return mapper.toDTOActor(actorRepository.findById(id).orElse(null));
    }

    @Override
    public ActorDTO create(ActorDTO actorDTO) {
        return mapper.toDTOActor(actorRepository.save(mapper.toEntityActor(actorDTO)));
    }

    @Override
    public ActorDTO update(ActorDTO actorDTO) {
        return mapper.toDTOActor(actorRepository.save(mapper.toEntityActor(actorDTO)));
    }

    @Override
    public void delete(int id) {
        actorRepository.deleteById(id);
    }

}
