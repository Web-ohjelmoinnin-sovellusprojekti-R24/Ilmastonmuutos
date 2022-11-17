package com.db.webproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.webproject.Data.Users;
import com.db.webproject.Service.UserViewsService;
import com.db.webproject.Service.UsersService;
import com.db.webproject.Service.WebprojectService;

@RestController
public class WebprojectRestController {
    
    @Autowired
    WebprojectService webprojectService;  

    @Autowired
    UsersService UserService;

    @Autowired
    UserViewsService UserViewservice;

    @GetMapping("getalldata")
    public List<String> getalldata(){
        return webprojectService.getAllData();
    }

    @GetMapping("getnortherndata")
    public List<Double> getnortherndata(){
        return webprojectService.getNorthernData();
    }

    @GetMapping("getdata")
    public List<Users> getData(){
        return UserService.getData();
    }


}
