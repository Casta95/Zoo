package com.uptc.zoo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.zoo.Entities.Alimentacion;
import com.uptc.zoo.Services.ServiceAlimentacion;

@RestController
public class ControlAlimentacion {

    ServiceAlimentacion serviceAlimentacion;

    public ControlAlimentacion(ServiceAlimentacion serviceAlimentacion) {
        this.serviceAlimentacion = serviceAlimentacion;
    }

    @GetMapping("/alimentaciones")
    public List<Alimentacion> getAlimentaciones() {
        return this.serviceAlimentacion.listarAlimentaciones();
    }

    @GetMapping("/alimentaciones/{id}")
    public Alimentacion getAlimentacion(Long id) {
        return this.serviceAlimentacion.buscarAlimentacion(id);
    }

    @PostMapping("/alimentaciones")
    public Alimentacion crearAlimentacion(@RequestBody Alimentacion Alimentacion) {
        return this.serviceAlimentacion.crearAlimentacion(Alimentacion);
    }

    @PutMapping("/alimentaciones/{id}")
    public void actualizarAlimentacion(@RequestBody Alimentacion Alimentacion, @PathVariable Long id) {
        this.serviceAlimentacion.actualizarAlimentacion(id, Alimentacion);
    }

    @DeleteMapping("/alimentaciones/{id}")
    public void eliminarAlimentacion(@PathVariable Long id) {
        this.serviceAlimentacion.eliminarAlimentacion(id);
    }

}
