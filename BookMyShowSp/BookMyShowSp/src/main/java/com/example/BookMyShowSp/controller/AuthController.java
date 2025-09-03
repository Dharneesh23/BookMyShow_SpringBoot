package com.example.BookMyShowSp.controller;


import com.example.BookMyShowSp.model.Admin;
import com.example.BookMyShowSp.model.User;
import com.example.BookMyShowSp.service.AdminService;
import com.example.BookMyShowSp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/auth")
public class AuthController {

    private final AdminService adminSvc;
    private final UserService userSvc;

    //  Manual constructor to inject dependencies
    public AuthController(AdminService adminSvc, UserService userSvc) {
        this.adminSvc = adminSvc;
        this.userSvc = userSvc;
    }
    @GetMapping("/api/test")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    @PostMapping("/admin/login")
    public ResponseEntity<?> adminLogin(@RequestBody Admin a) {
        return adminSvc.login(a.getAdminId(), a.getPassword()) != null ?
                ResponseEntity.ok("Admin login success") :
                ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid admin");
    }

    @PostMapping("/user/register")
    public ResponseEntity<?> userRegister(@RequestBody User u) {
        if (userSvc.login(u.getUserId(), u.getPassword()) != null)
            return ResponseEntity.badRequest().body("Exists");
        return ResponseEntity.ok(userSvc.register(u));
    }

    @PostMapping("/user/login")
    public ResponseEntity<?> userLogin(@RequestBody User u) {
        return userSvc.login(u.getUserId(), u.getPassword()) != null ?
                ResponseEntity.ok("User login success") :
                ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid user");
    }
}
