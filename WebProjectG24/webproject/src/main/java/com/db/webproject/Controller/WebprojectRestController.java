package com.db.webproject.Controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.webproject.Data.V1;
import com.db.webproject.Data.V1Repository;
import com.db.webproject.Service.WebprojectService;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;
@RestController
public class WebprojectRestController {
    
    @Autowired
    WebprojectService webprojectService;  

    @GetMapping("getalldata")
    public List<V1> getalldata(){
        return webprojectService.getAllData();
    }

}
