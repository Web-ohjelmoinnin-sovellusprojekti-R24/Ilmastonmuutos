package com.db.webproject.Service;

import java.util.Optional;

import com.db.webproject.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.UserRepository;

@Service
public class WebprojectService {
    @Autowired
    UserRepository userRepository;

    public String getuserid(Integer userid){
        Optional<User> opt = userRepository.findById(userid);

        if(opt.isPresent()){
        User u = opt.get();
        return u.getUsername();
        }   
        else 
        return "xd";
    }

    public String getusername(String username){
        return userRepository.findByUsername(username);
    }
}
