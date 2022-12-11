package com.db.webproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.webproject.Data.Users;
import com.db.webproject.Service.UsersService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("views")
    public ResponseEntity<String> getViews(@RequestHeader("Authorization") String bearer){
        if(bearer.startsWith("Bearer")){
            String token = bearer.split(" ")[1];
            String username = serv.ValidateJWT(token);
            if(username!=null){
                return new ResponseEntity<>("Views for "+username, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
    @DeleteMapping(value = "/delete/{username}/{password}")
    public ResponseEntity <String> deleteUser(@PathVariable String username, @PathVariable String password) {
        serv.delete(username, password);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
