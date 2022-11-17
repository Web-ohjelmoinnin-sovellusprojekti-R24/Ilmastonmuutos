package com.db.webproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.UsersRepository;

@Service
public class UsersService {

    @Autowired
    UsersRepository UserRepository;
    
}
