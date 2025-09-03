package com.example.BookMyShowSp.controller;

import com.example.BookMyShowSp.model.Movie;
import com.example.BookMyShowSp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")

public class MovieController {
    private final MovieService svc;
    public MovieController(MovieService svc)
    {
        this.svc = svc;
    }
    @PostMapping
    public Movie add(@RequestBody Movie m) { return svc.add(m); }

    @GetMapping
    public List<Movie> list() { return svc.list(); }
}