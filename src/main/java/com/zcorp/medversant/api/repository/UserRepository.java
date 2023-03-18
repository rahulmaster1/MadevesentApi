package com.zcorp.medversant.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zcorp.medversant.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    @Query("Select u from User u where u.username =:username")
    User findByUsername(@Param("username") String username);
    User findByEmail(String email);
}
