package com.hcltech.movie_capstone_project.repository;

import com.hcltech.movie_capstone_project.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
