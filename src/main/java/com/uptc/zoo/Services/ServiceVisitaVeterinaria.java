package com.uptc.zoo.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.uptc.zoo.Entities.VisitaVeterinaria;
import com.uptc.zoo.Repositories.RepositoryVisitaVeterinaria;

@Service
public class ServiceVisitaVeterinaria {

    private RepositoryVisitaVeterinaria repositoryVisitaVeterinaria;

    public ServiceVisitaVeterinaria(RepositoryVisitaVeterinaria repositoryVisitaVeterinaria) {
        this.repositoryVisitaVeterinaria = repositoryVisitaVeterinaria;
    }

    public List<VisitaVeterinaria> listarVisitasVeterinarias() {
        return this.repositoryVisitaVeterinaria.findAll();
    }

    public VisitaVeterinaria buscarVisitaVeterinaria(Long id) {
        return this.repositoryVisitaVeterinaria.findById(id).get();
    }

    public VisitaVeterinaria crearVisitaVeterinaria(VisitaVeterinaria visitaVeterinaria) {
        return this.repositoryVisitaVeterinaria.save(visitaVeterinaria);
    }

    public void actualizarVisitaVeterinaria(Long id, VisitaVeterinaria visitaVeterinaria) {
        VisitaVeterinaria visitaVeterinariaActual = this.repositoryVisitaVeterinaria.findById(id).get();
        visitaVeterinariaActual.setAnimal(visitaVeterinaria.getAnimal());
        visitaVeterinariaActual.setFechaVisita(visitaVeterinaria.getFechaVisita());
        visitaVeterinariaActual.setMotivo(visitaVeterinaria.getMotivo());
        visitaVeterinariaActual.setResultado(visitaVeterinaria.getResultado());
        this.repositoryVisitaVeterinaria.save(visitaVeterinariaActual);
    }

    public void eliminarVisitaVeterinaria(Long id) {
        this.repositoryVisitaVeterinaria.deleteById(id);
    }

}
