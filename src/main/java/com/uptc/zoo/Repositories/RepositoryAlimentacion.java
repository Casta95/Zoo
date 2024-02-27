package com.uptc.zoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.zoo.Entities.Alimentacion;

@Repository
public interface RepositoryAlimentacion extends JpaRepository<Alimentacion, Long> {

}
