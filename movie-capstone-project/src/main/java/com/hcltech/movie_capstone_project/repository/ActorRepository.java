package com.hcltech.movie_capstone_project.repository;

import com.hcltech.movie_capstone_project.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
