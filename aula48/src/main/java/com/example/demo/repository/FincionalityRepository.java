package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Functionality;

@Repository
public interface FincionalityRepository extends JpaRepository<Functionality, Long> {

}
