package com.db.webproject.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserViewRepository extends JpaRepository<UserViews, Integer>{
    
}
