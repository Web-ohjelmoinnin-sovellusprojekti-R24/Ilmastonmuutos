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

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V1A' or time_type = 'V1M' or time_type = 'V2'", nativeQuery = true)
    List<Visualizations> getV1andV2data();

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V3A' or time_type = 'V3M'", nativeQuery = true)
    List<Visualizations> getV3Data();

    @Query(value="SELECT northernd FROM visualizations", nativeQuery = true)
    List<BigDecimal> getNothernData();

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V3A' or time_type = 'V3M' or time_type = 'V4A'", nativeQuery = true)
    List<Visualizations> getV3andV4data();

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V5'", nativeQuery = true)
    List<Visualizations> getV5Data();

    @Query(value="SELECT * FROM visualizations where time_type='V7' OR time_type='V6'", nativeQuery = true)
    List<Visualizations> getV7Data();
   
    @Query(value="SELECT * FROM visualizations where time_type='V6'", nativeQuery = true)
    List<Visualizations> getV6Data();
    @Query(value="SELECT * FROM visualizations where time_type='V9' OR time_type='V9SS'", nativeQuery = true)
    List<Visualizations> getV9Data();
}