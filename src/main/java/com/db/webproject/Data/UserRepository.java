package com.db.webproject.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value="SELECT username FROM user WHERE username=?1", nativeQuery = true)
    String findByUsername(String userName);
}
