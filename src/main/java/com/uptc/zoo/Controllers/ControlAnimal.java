package com.uptc.zoo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.zoo.Entities.Animal;
import com.uptc.zoo.Services.ServiceAnimal;

@RestController
public class ControlAnimal {

    ServiceAnimal serviceAnimal;

    public ControlAnimal(ServiceAnimal serviceAnimal) {
        this.serviceAnimal = serviceAnimal;
    }

    @GetMapping("/animales")
    public List<Animal> getAnimales() {
        return this.serviceAnimal.listarAnimales();
    }

    @GetMapping("/animales/{id}")
    public Animal getAnimal(Long id) {
        return this.serviceAnimal.buscarAnimal(id);
    }

    @PostMapping("/animales")
    public Animal crearAnimal(@RequestBody Animal animal) {
        return this.serviceAnimal.crearAnimal(animal);
    }

    @PutMapping("/animales/{id}")
    public void actualizarAnimal(@RequestBody Animal animal, @PathVariable Long id) {
        this.serviceAnimal.actualizarAnimal(id, animal);
    }

    @DeleteMapping("/animales/{id}")
    public void eliminarAnimal(@PathVariable Long id) {
        this.serviceAnimal.eliminarAnimal(id);
    }

}
