package com.hcltech.movie_capstone_project.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovieNotFoundException extends RuntimeException{
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieNotFoundException.class);

    public MovieNotFoundException(String message, Exception exception) {
        super(message, exception);
        LOGGER.error(message);
    }

    public MovieNotFoundException(String message) {
        super(message);
        LOGGER.error(message);
    }
}
