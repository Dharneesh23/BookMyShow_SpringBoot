package com.example.BookMyShowSp.controller;

import com.example.BookMyShowSp.model.Show;
import com.example.BookMyShowSp.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {
    private final ShowService svc;
    public ShowController(ShowService svc)
    {
        this.svc = svc;
    }
    @PostMapping
    public Show add(@RequestBody Show s) { return svc.add(s); }

    @GetMapping
    public List<Show> list() { return svc.list(); }
}
