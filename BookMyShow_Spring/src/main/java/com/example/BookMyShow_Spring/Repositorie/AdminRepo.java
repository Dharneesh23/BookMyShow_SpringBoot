package com.example.BookMyShow_Spring.Repositorie;

import com.example.BookMyShow_Spring.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface AdminRepo extends JpaRepository<Admin,String> {
    Optional<Admin> findByadmin_idAndadmin_Password(String admin_id, String admin_password);
}
