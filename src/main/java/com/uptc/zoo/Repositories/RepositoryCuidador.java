package com.uptc.zoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.zoo.Entities.Cuidador;

@Repository
public interface RepositoryCuidador extends JpaRepository<Cuidador, Long> {

}
