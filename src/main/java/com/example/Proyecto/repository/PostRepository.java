package com.example.Proyecto.repository;

import com.example.Proyecto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<User,Long> {
}
