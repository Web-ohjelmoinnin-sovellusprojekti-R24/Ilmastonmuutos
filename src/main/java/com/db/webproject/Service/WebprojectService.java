package com.db.webproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.V1Repository;


@Service
public class WebprojectService {
    @Autowired
    V1Repository v1Repository;

    public List<String> getAllData(){
        return v1Repository.getAllData();    

    }

    public List<Double> getNorthernData(){
        return v1Repository.getNothernData();
    }
}