package com.example.BookMyShowSp.service;

import com.example.BookMyShowSp.model.Booking;
import com.example.BookMyShowSp.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookingService {
    private final BookingRepository repo;
    public BookingService(BookingRepository repo)
    {
        this.repo = repo;
    }
    public Booking book(Booking b) { return repo.save(b); }
    public List<Booking> listByUser(String uid) {
        return repo.findByUser_UserId(uid);
    }
}