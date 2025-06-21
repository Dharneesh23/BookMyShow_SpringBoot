package com.example.BookMyShow_Spring.Repositorie;

import com.example.BookMyShow_Spring.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface UserRepo extends JpaRepository<User,String> {
    Optional<User>findByuser_idAnduser_password(String user_id, String  user_password);
}
