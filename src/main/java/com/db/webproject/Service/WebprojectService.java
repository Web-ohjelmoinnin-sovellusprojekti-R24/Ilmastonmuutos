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

    public List getAllDates(){
        return v1Repository.getAllDates();
    }

    public LinkedList getAllData(){
        //return v1Repository.findAll();
        return v1Repository.getAllData();
    }
}