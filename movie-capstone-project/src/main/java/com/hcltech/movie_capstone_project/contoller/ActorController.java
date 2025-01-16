package com.hcltech.movie_capstone_project.contoller;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<ActorDTO> getAll(){
        return actorService.getAll();
    }

    @GetMapping("/{id}")
    public ActorDTO getOneById(@PathVariable int id){
        return actorService.getOneById(id);
    }

    @PostMapping("/add")
    public ActorDTO create(@RequestBody ActorDTO actorDTO){
        return actorService.create(actorDTO);
    }

    @PutMapping("/update")
    public ActorDTO update(@RequestBody ActorDTO actorDTO){
        return actorService.update(actorDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        actorService.delete(id);
    }
}
