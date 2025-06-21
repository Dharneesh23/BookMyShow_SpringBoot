package com.example.BookMyShow_Spring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity

public class Admin {

    @Id
    private String admin_id;
    private String admin_password;
    public String getAdmin_password() {
        return admin_password;
    }

    public String getAdmin_id() {
        return admin_id;
    }
    public Admin() {} // no-args
    public Admin(String admin_id, String admin_password) {
        this.admin_id = admin_id;
        this.admin_password = admin_password;
    }

}
