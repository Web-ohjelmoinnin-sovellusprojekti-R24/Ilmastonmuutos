<<<<<<< HEAD:webproject_java/src/main/java/com/db/webproject/Data/V1Repository.java
package com.db.webproject.Data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V1Repository extends JpaRepository<V1, Integer> {

   /*  @Query(value="SELECT Date, Anomaly_deg_C_Global_NH_SH_2_Monthly,Anomaly_deg_C_Northern_hemisphere, Anomaly_deg_C_Southern_hemisphere FROM monthly", nativeQuery = true)
    List<V1> getAllData();*/
   
=======
package com.db.webproject.Data;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface V1Repository extends JpaRepository<Visualizations, Integer> {

    @Query(value="SELECT date FROM visualizations", nativeQuery = true)
    List<String> getAllData();

    @Query(value="SELECT northernd FROM visualizations", nativeQuery = true)
    List<BigDecimal> getNothernData();
   
>>>>>>> origin/JavaDevelopment:src/main/java/com/db/webproject/Data/V1Repository.java
}