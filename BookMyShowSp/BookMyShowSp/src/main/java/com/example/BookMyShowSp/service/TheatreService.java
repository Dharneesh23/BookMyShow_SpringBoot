package com.example.BookMyShowSp.service;

import com.example.BookMyShowSp.model.Theatre;
import com.example.BookMyShowSp.repository.TheatreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {
    private final TheatreRepository repo;
    public TheatreService (TheatreRepository repo)
    {
        this.repo = repo;
    }
    public Theatre add(Theatre t) { return repo.save(t); }
    public List<Theatre> list() { return repo.findAll(); }
}
