package com.db.webproject.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V1Repository extends JpaRepository<V1, Integer> {

    @Query(value="SELECT Date FROM monthly", nativeQuery = true)
    List<String> getAllDates();

    @Query(value="SELECT Date, Anomaly_deg_C_Global_NH_SH_2_Monthly FROM monthly", nativeQuery = true)
    LinkedList getAllData();
   
}