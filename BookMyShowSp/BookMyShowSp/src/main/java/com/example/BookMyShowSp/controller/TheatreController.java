package com.example.BookMyShowSp.controller;

import com.example.BookMyShowSp.model.Theatre;
import com.example.BookMyShowSp.service.TheatreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theatres")
public class TheatreController {
    private final TheatreService svc;
    public TheatreController(TheatreService svc)
    {
        this.svc = svc;
    }
    @PostMapping
    public Theatre add(@RequestBody Theatre t) { return svc.add(t); }

    @GetMapping
    public List<Theatre> list() { return svc.list(); }
}