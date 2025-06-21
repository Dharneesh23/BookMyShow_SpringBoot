package com.example.BookMyShow_Spring.Controller;

import com.example.BookMyShow_Spring.Model.Admin;
import com.example.BookMyShow_Spring.Model.User;
import com.example.BookMyShow_Spring.Service.AdminService;
import com.example.BookMyShow_Spring.Service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class LoginController {
  @Autowired
     AdminService adminService;
    UserService userService;

    @PostConstruct
    public void init() {
        adminService.createDefaultAdmin();
    }

    @PostMapping("/admin/login")
    public ResponseEntity<?> adminLogin(@RequestBody Admin admin) {
        Admin found = adminService.adminLogin(admin.getAdmin_id(), admin.getAdmin_password());
        if (found != null) {
            return ResponseEntity.ok("Admin login successfully");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid admin");
    }

    @PostMapping("/user/login")
    public ResponseEntity<?> userLogin(@RequestBody User user) {
        User found = userService.userLogin(user.getUser_id(), user.getUser_password());
        if (found != null) {
            return ResponseEntity.ok("User login successfully");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid user");
    }

    @PostMapping("/user/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        if (userService.userLogin(user.getUser_id(), user.getUser_password()) != null) {
            return ResponseEntity.badRequest().body("User already exists!");
        }
        return ResponseEntity.ok(userService.userRegister(user));
    }
}
