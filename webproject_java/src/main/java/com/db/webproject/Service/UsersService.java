package com.db.webproject.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.db.webproject.Data.Users;
import com.db.webproject.Data.UsersRepository;

@Service
public class UsersService {

    @Autowired
    UsersRepository UserRepository;

    @Value("${jwt.secret}")
    private String JWTk;

    public List<Users> getData(){
        return UserRepository.findAll();
    }

    public Users register(String username, String password){
        BCryptPasswordEncoder enco = new BCryptPasswordEncoder();
        Users u = new Users(username, enco.encode(password));
        UserRepository.save(u);
        return u;
    }

    public String login(String username, String password){
        BCryptPasswordEncoder enco = new BCryptPasswordEncoder();
        Users u = UserRepository.findById(username).orElse(null);

        if(u == null || !enco.matches(password, u.getPassword())){
            return null;
        }
        Algorithm alg = Algorithm.HMAC256(JWTk);
        return JWT.create().withSubject(u.getUsername()).sign(alg);
    }
    
}
