package com.example.BookMyShowSp.repository;

import com.example.BookMyShowSp.model.Admin;
import com.example.BookMyShowSp.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {
    Admin findByAdminIdAndPassword(String adminId, String password);
}
