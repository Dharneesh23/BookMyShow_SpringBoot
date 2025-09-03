package com.example.BookMyShowSp.service;


import com.example.BookMyShowSp.model.Show;
import com.example.BookMyShowSp.repository.ShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class ShowService {
    private final ShowRepository repo;
    public ShowService(ShowRepository repo)
    {
        this.repo = repo;
    }
    public Show add(Show s) { return repo.save(s); }
    public List<Show> list() { return repo.findAll(); }
}
