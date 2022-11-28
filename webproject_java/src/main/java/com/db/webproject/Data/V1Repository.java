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

    @Query(value="SELECT northernd FROM visualizations", nativeQuery = true)
    List<BigDecimal> getNothernData();

    

   
}