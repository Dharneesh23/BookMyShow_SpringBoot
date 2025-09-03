package com.example.BookMyShowSp.service;



import com.example.BookMyShowSp.model.Admin;
import com.example.BookMyShowSp.repository.AdminRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository repo;


    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    @PostConstruct
    public void init() {
        if (!repo.existsById("admin")) {
            repo.save(new Admin("admin", "12345"));
        }
    }

    public Admin login(String id, String pwd) {
        return repo.findByAdminIdAndPassword(id, pwd);
    }
}
