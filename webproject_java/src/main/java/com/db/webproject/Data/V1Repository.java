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

    @Query(value="SELECT id,date,time_type,globald,northernd,southernd,globalc FROM visualizations WHERE time_type='V1A' OR time_type='V1M'", nativeQuery = true)
    List<Visualizations> getAllData2();

    @Query(value="SELECT northernd FROM visualizations", nativeQuery = true)
    List<BigDecimal> getNothernData();
   
}