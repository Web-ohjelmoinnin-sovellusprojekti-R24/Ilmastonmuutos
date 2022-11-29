package com.db.webproject.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.Users;
import com.db.webproject.Data.UsersRepository;

@Service
public class UsersService {

    @Autowired
    UsersRepository UserRepository;

    public List<Users> getData(){
        return UserRepository.findAll();
    }
    
}
