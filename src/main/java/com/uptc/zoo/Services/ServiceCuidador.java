package com.uptc.zoo.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.uptc.zoo.Entities.Cuidador;
import com.uptc.zoo.Repositories.RepositoryCuidador;

@Service
public class ServiceCuidador {

    private RepositoryCuidador repositoryCuidador;

    public ServiceCuidador(RepositoryCuidador repositoryCuidador) {
        this.repositoryCuidador = repositoryCuidador;
    }

    public List<Cuidador> listarCuidadores() {
        return this.repositoryCuidador.findAll();
    }

    public Cuidador buscarCuidador(Long id) {
        return this.repositoryCuidador.findById(id).get();
    }

    public Cuidador crearCuidador(Cuidador cuidador) {
        return this.repositoryCuidador.save(cuidador);
    }

    public void actualizarCuidador(Long id, Cuidador cuidador) {
        Cuidador cuidadorActual = this.repositoryCuidador.findById(id).get();
        cuidadorActual.setNombre(cuidador.getNombre());
        cuidadorActual.setApellidos(cuidador.getApellidos());
        cuidadorActual.setFechaContratacion(cuidador.getFechaContratacion());
        cuidadorActual.setEspecialidad(cuidador.getEspecialidad());
        this.repositoryCuidador.save(cuidadorActual);
    }

    public void eliminarCuidador(Long id) {
        this.repositoryCuidador.deleteById(id);
    }

}
