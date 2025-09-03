package com.example.BookMyShowSp.repository;

import com.example.BookMyShowSp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}