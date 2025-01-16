package com.hcltech.movie_capstone_project.service.impl;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;
import com.hcltech.movie_capstone_project.dto.ReviewDTO;
import com.hcltech.movie_capstone_project.model.Actor;
import com.hcltech.movie_capstone_project.model.Genre;
import com.hcltech.movie_capstone_project.model.Movie;
import com.hcltech.movie_capstone_project.model.Review;
import com.hcltech.movie_capstone_project.service.MapperService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MapperServiceImpl implements MapperService {
    @Override
    public Movie toEntityMovie(MovieDTO dto) {
        if(dto == null){
           return null;
        }

        Movie movie = new Movie();

        movie.setId(dto.getId());
        movie.setTitle(dto.getTitle());
        movie.setStatus(dto.getStatus());
        movie.setTagline(dto.getTagline());
        movie.setOverview(dto.getOverview());
        movie.setRevenue(dto.getRevenue());

        final Set<GenreDTO> genreDTOS = dto.getGenres();
        if(genreDTOS != null && !genreDTOS.isEmpty()) {
            final Set<Genre> genres = new HashSet<>(toEntityGenre(new ArrayList<>(genreDTOS)));
            movie.setGenres(genres);
            genres.forEach(genre -> genre.setMovie(movie));
        }

        final Set<ActorDTO> actorDTOS = dto.getActors();
        if(actorDTOS != null && !actorDTOS.isEmpty()) {
            final Set<Actor> actors = new HashSet<>(toEntityActor(new ArrayList<>(actorDTOS)));
            movie.setActors(actors);
            actors.forEach(actor -> actor.setMovie(movie));
        }

        final Set<ReviewDTO> reviewDTOS = dto.getReviews();
        if(reviewDTOS != null && !reviewDTOS.isEmpty()) {
            final Set<Review> reviews = new HashSet<>(toEntityReview(new ArrayList<>(reviewDTOS)));
            movie.setReviews(reviews);
            reviews.forEach(review -> review.setMovie(movie));
        }

        return movie;
    }

    @Override
    public MovieDTO toDTOMovie(Movie movie) {
        if(movie == null){
            return null;
        }

        MovieDTO dto = new MovieDTO();

        dto.setId(movie.getId());
        dto.setTitle(movie.getTitle());
        dto.setStatus(movie.getStatus());
        dto.setTagline(movie.getTagline());
        dto.setOverview(movie.getOverview());
        dto.setRevenue(movie.getRevenue());

        final Set<Genre> genres = movie.getGenres();
        if(genres != null && !genres.isEmpty()) {
            final Set<GenreDTO> genreDTOS = new HashSet<>(toDTOGenre(new ArrayList<>(genres)));
            dto.setGenres(genreDTOS);
        }

        final Set<Actor> actors = movie.getActors();
        if(actors != null && !actors.isEmpty()) {
            final Set<ActorDTO> actorDTOS = new HashSet<>(toDTOActor(new ArrayList<>(actors)));
            dto.setActors(actorDTOS);
        }

        final Set<Review> reviews = movie.getReviews();
        if(reviews != null && !reviews.isEmpty()) {
            final Set<ReviewDTO> reviewDTOS = new HashSet<>(toDTOReview(new ArrayList<>(reviews)));
            dto.setReviews(reviewDTOS);
        }

        return dto;
    }

    @Override
    public List<MovieDTO> toDTOMovie(List<Movie> movies) {
        return movies.stream().map(movie -> toDTOMovie(movie)).collect(Collectors.toList());
    }

    @Override
    public List<Movie> toEntityMovie(List<MovieDTO> dtos) {
        return dtos.stream().map(dto -> toEntityMovie(dto)).collect(Collectors.toList());
    }

    @Override
    public Genre toEntityGenre(GenreDTO dto) {
        if(dto == null){
            return null;
        }

        Genre genre = new Genre();
        genre.setId(dto.getId());
        genre.setName(dto.getName());
        return genre;
    }

    @Override
    public GenreDTO toDTOGenre(Genre genre) {
        if(genre == null){
            return null;
        }

        GenreDTO dto = new GenreDTO();
        dto.setId(genre.getId());
        dto.setName(genre.getName());
        return dto;
    }

    @Override
    public List<GenreDTO> toDTOGenre(List<Genre> genres) {
        return genres.stream().map(genre -> toDTOGenre(genre)).collect(Collectors.toList());
    }

    @Override
    public List<Genre> toEntityGenre(List<GenreDTO> dtos) {
        return dtos.stream().map(dto -> toEntityGenre(dto)).collect(Collectors.toList());
    }

    @Override
    public Actor toEntityActor(ActorDTO dto) {
        if(dto == null){
            return null;
        }

        Actor actor = new Actor();
        actor.setId(dto.getId());
        actor.setName(dto.getName());
        actor.setGender(dto.getGender());
        actor.setPopularity(dto.getPopularity());
        return actor;
    }

    @Override
    public ActorDTO toDTOActor(Actor actor) {
        if(actor == null){
            return null;
        }

        ActorDTO dto = new ActorDTO();
        dto.setId(actor.getId());
        dto.setName(actor.getName());
        dto.setGender(actor.getGender());
        dto.setPopularity(actor.getPopularity());
        return dto;
    }

    @Override
    public List<ActorDTO> toDTOActor(List<Actor> actors) {
        return actors.stream().map(actor -> toDTOActor(actor)).collect(Collectors.toList());
    }

    @Override
    public List<Actor> toEntityActor(List<ActorDTO> dtos) {
        return dtos.stream().map(dto -> toEntityActor(dto)).collect(Collectors.toList());
    }

    @Override
    public Review toEntityReview(ReviewDTO dto) {
        if(dto == null){
            return null;
        }

        Review review = new Review();
        review.setId(dto.getId());
        review.setTitle(dto.getTitle());
        review.setAuthor(dto.getAuthor());
        review.setContent(dto.getContent());
        return review;
    }

    @Override
    public ReviewDTO toDTOReview(Review review) {
        if(review == null){
            return null;
        }

        ReviewDTO dto = new ReviewDTO();
        dto.setId(review.getId());
        dto.setTitle(review.getTitle());
        dto.setAuthor(review.getAuthor());
        dto.setContent(review.getContent());
        dto.setCreatedAt(review.getCreatedAt());
        dto.setUpdatedAt(review.getUpdatedAt());
        return dto;
    }

    @Override
    public List<ReviewDTO> toDTOReview(List<Review> reviews) {
        return reviews.stream().map(review -> toDTOReview(review)).collect(Collectors.toList());
    }

    @Override
    public List<Review> toEntityReview(List<ReviewDTO> dtos) {
        return dtos.stream().map(dto -> toEntityReview(dto)).collect(Collectors.toList());
    }
}
