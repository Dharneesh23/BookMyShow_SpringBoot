package com.example.BookMyShowSp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Show show;
    @ManyToOne
    private User user;
    @ElementCollection
    private List<String> seatNumbers;//to store seperated value  without creating a new entity  using @ElementCollection
    private LocalDateTime bookingTime = LocalDateTime.now();
}
