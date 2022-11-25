package com.db.webproject.Data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface V4Repository extends JpaRepository<V4, Integer> {
    @Query(value = "SELECT * FROM v4", nativeQuery = true)
    List<String> getCO();
   
}
