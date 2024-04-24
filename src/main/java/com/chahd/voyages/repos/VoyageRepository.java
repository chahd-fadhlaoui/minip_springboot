package com.chahd.voyages.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chahd.voyages.entities.Voyage;

public interface VoyageRepository extends JpaRepository<Voyage, Long> {

}
