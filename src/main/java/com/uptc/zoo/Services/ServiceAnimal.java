package com.uptc.zoo.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.uptc.zoo.Entities.Animal;
import com.uptc.zoo.Repositories.RepositoryAnimal;

@Service
public class ServiceAnimal {

    private RepositoryAnimal repositoryAnimal;

    public ServiceAnimal(RepositoryAnimal repositoryAnimal) {
        this.repositoryAnimal = repositoryAnimal;
    }

    public List<Animal> listarAnimales() {
        return this.repositoryAnimal.findAll();
    }

    public Animal buscarAnimal(Long id) {
        return this.repositoryAnimal.findById(id).get();
    }

    public Animal crearAnimal(Animal animal) {
        return this.repositoryAnimal.save(animal);
    }

    public void actualizarAnimal(Long id, Animal animal) {
        Animal animalActual = this.repositoryAnimal.findById(id).get();
        animalActual.setNombre(animal.getNombre());
        animalActual.setEspecie(animal.getEspecie());
        animalActual.setFechaNacimiento(animal.getFechaNacimiento());
        animalActual.setSexo(animal.getSexo());
        this.repositoryAnimal.save(animalActual);
    }

    public void eliminarAnimal(Long id) {
        this.repositoryAnimal.deleteById(id);
    }
}
