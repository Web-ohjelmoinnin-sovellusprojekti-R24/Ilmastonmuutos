package com.db.webproject.Data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V5Repository extends JpaRepository<V5, Integer> {
    @Query(value = "SELECT * FROM v5", nativeQuery = true)
    List<String> getCO();
}
