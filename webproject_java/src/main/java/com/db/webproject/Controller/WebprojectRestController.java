package com.db.webproject.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.webproject.Data.Users;
import com.db.webproject.Data.Visualizations;
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

    @GetMapping("/getalldata")
    public List<Visualizations> getalldata(){
        return webprojectService.getAllData();
    }

    @GetMapping("/getv3data")
    public List<Visualizations> getV3Data(){
        return webprojectService.getV3Data();
    }

    @GetMapping("/getnortherndata")
    public List<BigDecimal> getnortherndata(){
        return webprojectService.getNorthernData();
    }

    @GetMapping("/getdata")
    public List<Users> getData(){
        return UserService.getData();

    }


    @GetMapping("/getv3andv4data")
    public List<Visualizations> getV3andV4Data(){
        return webprojectService.getV3andV4Data();
    }

    @GetMapping("/getv5data")
    public List<Visualizations> getV5Data(){
        return webprojectService.getV5Data();
    }

    @GetMapping("/getv6data")
    public List<Visualizations> getV6Data(){
        return webprojectService.getV6Data();
    }

    @GetMapping("/getv7data")
    public List<Visualizations> getV7Data(){
        return webprojectService.getV7Data();
    }

    @GetMapping("/getv1v2data")
    public List<Visualizations> getv1v2Data(){
        return webprojectService.getV1V2Data();
    }

    @GetMapping("/getv9data")
    public List<Visualizations> getv9Data(){
        return webprojectService.getV9Data();
    }
}
