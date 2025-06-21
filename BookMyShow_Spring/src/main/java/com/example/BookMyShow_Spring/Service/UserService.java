package com.example.BookMyShow_Spring.Service;

import com.example.BookMyShow_Spring.Model.User;
import com.example.BookMyShow_Spring.Repositorie.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
     UserRepo userRepo;
    public User userLogin(String user_id,String user_password)
    {
        return userRepo.findByuser_idAnduser_password(user_id,user_password).orElse(null);
    }
    public User userRegister(User user)
    {
        return userRepo.save(user);
    }

}
