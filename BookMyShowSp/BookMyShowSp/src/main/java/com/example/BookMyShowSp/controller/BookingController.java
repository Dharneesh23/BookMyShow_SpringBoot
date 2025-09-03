package com.example.BookMyShowSp.controller;

import com.example.BookMyShowSp.model.Booking;
import com.example.BookMyShowSp.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")

public class BookingController {
    private final BookingService svc;
    public BookingController(BookingService svc)
    {
        this.svc = svc;
    }

    @PostMapping
    public Booking book(@RequestBody Booking b) { return svc.book(b); }

    @GetMapping("/user/{userId}")
    public List<Booking> list(@PathVariable String userId) {
        return svc.listByUser(userId);
    }
}