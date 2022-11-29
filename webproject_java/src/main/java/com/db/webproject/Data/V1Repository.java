package com.db.webproject.Data;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V1Repository extends JpaRepository<Visualizations, Integer> {

    @Query(value="SELECT * FROM visualizations", nativeQuery = true)
    List<Visualizations> getAllData();

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V3A' or time_type = 'V3M'", nativeQuery = true)
    List<Visualizations> getV3Data();

    @Query(value="SELECT northernd FROM visualizations", nativeQuery = true)
    List<BigDecimal> getNothernData();
   
}