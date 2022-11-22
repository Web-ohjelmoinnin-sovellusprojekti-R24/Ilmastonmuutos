<<<<<<< HEAD:webproject_java/src/main/java/com/db/webproject/Service/WebprojectService.java
package com.db.webproject.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.V1;
import com.db.webproject.Data.V1Repository;


@Service
public class WebprojectService {
    @Autowired
    V1Repository v1Repository;

    public List<V1> getAllData(){
        return v1Repository.findAll();    

    }
=======
package com.db.webproject.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.V1Repository;
import com.db.webproject.Data.Visualizations;


@Service
public class WebprojectService {
    @Autowired
    V1Repository v1Repository;

    public List<Visualizations> getAllData(){
        return v1Repository.findAll();    

    }

    public List<BigDecimal> getNorthernData(){
        return v1Repository.getNothernData();
    }
>>>>>>> origin/JavaDevelopment:src/main/java/com/db/webproject/Service/WebprojectService.java
}