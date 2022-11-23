package com.db.webproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.V5;
import com.db.webproject.Data.V5Repository;



@Service
public class V5Service {
    @Autowired
    V5Repository v5Repository;

    public List<V5> getCO(){
        return v5Repository.findAll();
    }
}
