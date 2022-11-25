package com.db.webproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.webproject.Data.V4;
import com.db.webproject.Data.V4Repository;

@Service
public class V4Service {
    @Autowired
    V4Repository v4Repository;

    public List<V4> getCO(){
        return v4Repository.findAll();
    }
}
