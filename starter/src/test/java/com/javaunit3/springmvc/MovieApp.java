package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MovieApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieApp.class);

        BestMovieService BestMovieService = applicationContext.getBean("BestMovieService" , BestMovieService.class);

        Movie bestMovie = BestMovieService.getBestMovie();

        System.out.println("Title: " + bestMovie.getTitle());
        System.out.println("Maturity Rating: " + bestMovie.getMaturityRating());
        System.out.println("Genre: " + bestMovie.getGenre());

    }

}
