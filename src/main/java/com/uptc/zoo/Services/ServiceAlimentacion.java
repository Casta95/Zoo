package com.uptc.zoo.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.uptc.zoo.Entities.Alimentacion;
import com.uptc.zoo.Repositories.RepositoryAlimentacion;

@Service
public class ServiceAlimentacion {

    private RepositoryAlimentacion repositoryAlimentacion;

    public ServiceAlimentacion(RepositoryAlimentacion repositoryAlimentacion) {
        this.repositoryAlimentacion = repositoryAlimentacion;
    }

    public List<Alimentacion> listarAlimentaciones() {
        return this.repositoryAlimentacion.findAll();
    }

    public Alimentacion buscarAlimentacion(Long id) {
        return this.repositoryAlimentacion.findById(id).get();
    }

    public Alimentacion crearAlimentacion(Alimentacion alimentacion) {
        return this.repositoryAlimentacion.save(alimentacion);
    }

    public void actualizarAlimentacion(Long id, Alimentacion alimentacion) {
        Alimentacion alimentacionActual = this.repositoryAlimentacion.findById(id).get();
        alimentacionActual.setCuidador(alimentacion.getCuidador());
        alimentacionActual.setAnimal(alimentacion.getAnimal());
        alimentacionActual.setFechaAlimentacion(alimentacion.getFechaAlimentacion());
        alimentacionActual.setTipoAlimento(alimentacion.getTipoAlimento());
        alimentacionActual.setCantidad(alimentacion.getCantidad());
        this.repositoryAlimentacion.save(alimentacionActual);
    }

    public void eliminarAlimentacion(Long id) {
        this.repositoryAlimentacion.deleteById(id);
    }

}
