package com.db.webproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.UserViewRepository;

@Service
public class UserViewsService {

    @Autowired
    UserViewRepository userViewRepository;
    
}
