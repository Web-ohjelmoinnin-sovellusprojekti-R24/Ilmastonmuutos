package com.db.webproject.Data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V1Repository extends JpaRepository<Visualizations, Integer> {

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V3A' or time_type = 'V3M' or time_type = 'V4A'", nativeQuery = true)
    List<Visualizations> getV3andV4data();

    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V5'", nativeQuery = true)
    List<Visualizations> getV5Data();

   /* @Query(value="SELECT northernd FROM visualizations", nativeQuery = true)
    List<BigDecimal> getNothernData();
    */
    @Query(value="SELECT * FROM visualizations WHERE time_type = 'V1A' or time_type = 'V1M' or time_type = 'V2'", nativeQuery = true)
    List<Visualizations> getV1andV2data();
}