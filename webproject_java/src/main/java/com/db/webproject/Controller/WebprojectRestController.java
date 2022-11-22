<<<<<<< HEAD:webproject_java/src/main/java/com/db/webproject/Controller/WebprojectRestController.java
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
=======
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
@CrossOrigin(origins = "http://localhost:3000")
public class WebprojectRestController {
    
    @Autowired
    WebprojectService webprojectService;  

    @Autowired
    UsersService UserService;

    @Autowired
    UserViewsService UserViewservice;

    @GetMapping("getalldata")
    public List<Visualizations> getalldata(){
        return webprojectService.getAllData();
    }

    @GetMapping("getnortherndata")
    public List<BigDecimal> getnortherndata(){
        return webprojectService.getNorthernData();
    }

    @GetMapping("getdata")
    public List<Users> getData(){
        return UserService.getData();
    }


}
>>>>>>> origin/JavaDevelopment:src/main/java/com/db/webproject/Controller/WebprojectRestController.java
