package com.hcltech.movie_capstone_project.service;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;
import com.hcltech.movie_capstone_project.dto.ReviewDTO;
import com.hcltech.movie_capstone_project.model.Actor;
import com.hcltech.movie_capstone_project.model.Genre;
import com.hcltech.movie_capstone_project.model.Movie;
import com.hcltech.movie_capstone_project.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MapperService {

    Movie toEntityMovie(MovieDTO dto);

    MovieDTO toDTOMovie(Movie movie);

    List<MovieDTO> toDTOMovie(List<Movie> movies);

    List<Movie> toEntityMovie(List<MovieDTO> dtos);

    Genre toEntityGenre(GenreDTO dto);

    GenreDTO toDTOGenre(Genre genre);

    List<GenreDTO> toDTOGenre(List<Genre> genres);

    List<Genre> toEntityGenre(List<GenreDTO> dtos);

    Actor toEntityActor(ActorDTO dto);

    ActorDTO toDTOActor(Actor actor);

    List<ActorDTO> toDTOActor(List<Actor> actors);

    List<Actor> toEntityActor(List<ActorDTO> dtos);

    Review toEntityReview(ReviewDTO dto);

    ReviewDTO toDTOReview(Review review);

    List<ReviewDTO> toDTOReview(List<Review> reviews);

    List<Review> toEntityReview(List<ReviewDTO> dtos);


}
