package com.example.BookMyShow_Spring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class User {


    @Id
    private String user_id;



    private String user_password;

    public String getUser_id() {
        return user_id;
    }
    public String getUser_password() {
        return user_password;
    }
}
