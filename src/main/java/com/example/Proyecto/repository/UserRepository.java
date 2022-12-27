package com.example.Proyecto.repository;

import com.example.Proyecto.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u from User u where u.email=?1")
    Optional<User> findByUserEmail(String email);

    @Query("SELECT u from User u where u.name like ?1%")
    List<User>findAndSort(String name, Sort sort);

    List<User>findByName(String name);

}
