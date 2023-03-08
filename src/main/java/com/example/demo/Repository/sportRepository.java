package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Sport;

@Repository
public interface sportRepository extends JpaRepository<Sport,Integer>{

}
