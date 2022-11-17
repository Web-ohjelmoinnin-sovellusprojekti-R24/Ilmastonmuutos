package com.db.webproject.Data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V1Repository extends JpaRepository<V1, Integer> {

    @Query(value="SELECT Date FROM visualizations", nativeQuery = true)
    List<String> getAllData();

    @Query(value="SELECT Anomaly_deg_C_Northern_hemisphere FROM visualizations", nativeQuery = true)
    List<Double> getNothernData();
   
}