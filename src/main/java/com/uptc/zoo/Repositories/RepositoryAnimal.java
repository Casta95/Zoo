package com.uptc.zoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.zoo.Entities.Animal;

@Repository
public interface RepositoryAnimal extends JpaRepository<Animal, Long> {

}
