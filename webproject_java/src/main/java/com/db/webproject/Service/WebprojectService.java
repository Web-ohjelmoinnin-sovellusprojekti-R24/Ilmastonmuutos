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
        return v1Repository.getAllData();    
    }
    
    public List<Visualizations> getV3Data(){
        return v1Repository.getV3Data();    
    }

    public List<BigDecimal> getNorthernData(){
        return v1Repository.getNothernData();
    }

    public List<Visualizations> getV5Data(){
        return v1Repository.getV5Data();
      }
      public List<Visualizations> getV3andV4Data(){
        return v1Repository.getV3andV4data();
      }
}