package com.example.BookMyShowSp.service;

import com.example.BookMyShowSp.model.Movie;
import com.example.BookMyShowSp.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repo;
    public MovieService(MovieRepository repo)
    {
        this.repo = repo;
    }
    public Movie add(Movie m) { return repo.save(m); }
    public List<Movie> list() { return repo.findAll(); }
}
