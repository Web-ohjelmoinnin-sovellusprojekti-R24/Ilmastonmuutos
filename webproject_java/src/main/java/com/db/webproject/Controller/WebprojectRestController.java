package com.db.webproject.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.webproject.Data.Users;
import com.db.webproject.Data.V1Repository;
import com.db.webproject.Data.Visualizations;
import com.db.webproject.Service.UserViewsService;
import com.db.webproject.Service.UsersService;
import com.db.webproject.Service.WebprojectService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class WebprojectRestController {
    
    @Autowired
    WebprojectService webprojectService;  

    @Autowired
    UsersService UserService;

    @Autowired
    UserViewsService UserViewservice;

    @GetMapping("getalldata")
    public List<Visualizations> getV1andV2data(){
        return webprojectService.getV1andV2Data();
    }
/*
 @GetMapping("getnortherndata")
    public List<BigDecimal> getnortherndata(){
        return webprojectService.getNorthernData();
    }
 */
    

    @GetMapping("getdata")
    public List<Users> getData(){
        return UserService.getData();
    }
    @GetMapping("getv3andv4data")
    public List<Visualizations> getV3andV4Data(){
        return webprojectService.getV3andV4Data();
    }

    @GetMapping("getv5data")
    public List<Visualizations> getV5Data(){
        return webprojectService.getV5Data();
    }



}
