package com.uptc.zoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.zoo.Entities.VisitaVeterinaria;

@Repository
public interface RepositoryVisitaVeterinaria extends JpaRepository<VisitaVeterinaria, Long> {

}
