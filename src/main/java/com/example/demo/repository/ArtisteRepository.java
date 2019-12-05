package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Artiste;

@Repository
public interface ArtisteRepository extends JpaRepositoryImplementation<Artiste, Integer>{

}
