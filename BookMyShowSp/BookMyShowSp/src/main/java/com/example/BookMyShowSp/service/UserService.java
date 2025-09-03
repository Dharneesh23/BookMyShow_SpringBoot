package com.example.BookMyShowSp.service;

import com.example.BookMyShowSp.model.User;
import com.example.BookMyShowSp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;

    public User login(String id, String pwd) {
        return repo.findByUserIdAndPassword(id, pwd);
    }
    public UserService(UserRepository repo)
    {
        this.repo = repo;
    }
    public User register(User user) {
        return repo.save(user);
    }
}
