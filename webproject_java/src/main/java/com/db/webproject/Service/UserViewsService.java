package com.db.webproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.UserViewRepository;
import com.db.webproject.Data.UserViews;

@Service
public class UserViewsService {

    @Autowired
    UserViewRepository userViewRepository;

    public UserViews create(int layout, boolean v1, boolean v3, boolean v5, boolean v6, boolean v7){

        UserViews u = new UserViews(layout, v1, v3, v5, v6, v7);
        userViewRepository.save(u);
        return u;
    }

    public void delete(int layout, boolean v1, boolean v3, boolean v5, boolean v6, boolean v7){
        userViewRepository.deleteAll();
    }
    
}
