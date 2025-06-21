package com.example.BookMyShow_Spring.Service;

import com.example.BookMyShow_Spring.Model.Admin;
import com.example.BookMyShow_Spring.Repositorie.AdminRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class AdminService {
    @Autowired
     AdminRepo adminRepo;
    public Admin adminLogin(String admin_id , String admin_password)
    {
        return adminRepo.findByadmin_idAndadmin_Password(admin_id,admin_password).orElse(null);//why null means
    }

    public void createDefaultAdmin()
    {
        if(adminRepo.findById("admin123").isEmpty())
        {
            adminRepo.save(new Admin("admin123","12345678"));
        }
    }
}
