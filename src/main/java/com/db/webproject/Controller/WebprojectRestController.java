package com.db.webproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.db.webproject.Service.WebprojectService;
@RestController
public class WebprojectRestController {
    
    @Autowired
    WebprojectService webprojectService;  

    @GetMapping("getuserid")
    public String getuserid(@RequestParam Integer userid) {
        return webprojectService.getuserid(userid);
    }

    @GetMapping("getusername")
    public String getusername(@RequestParam String username) {
        return webprojectService.getusername(username);
    }
}
