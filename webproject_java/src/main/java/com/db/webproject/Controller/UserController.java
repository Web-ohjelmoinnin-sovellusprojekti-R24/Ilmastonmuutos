package com.db.webproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.webproject.Data.Users;
import com.db.webproject.Service.UsersService;

@RestController
public class UserController {

    @Autowired
    UsersService serv;

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestParam String username, @RequestParam String password){
        Users u = serv.register(username, password);
        return new ResponseEntity<>(u.getUsername(),HttpStatus.OK);
    }

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){

        String token = serv.login(username, password);
        if(token == null){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
    
}
