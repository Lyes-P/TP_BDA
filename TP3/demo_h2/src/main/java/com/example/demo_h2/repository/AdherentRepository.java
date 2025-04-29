package com.example.demo_h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_h2.entities.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {

}
