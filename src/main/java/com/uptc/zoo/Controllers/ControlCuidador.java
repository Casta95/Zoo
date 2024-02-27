package com.uptc.zoo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.zoo.Entities.Cuidador;
import com.uptc.zoo.Services.ServiceCuidador;

@RestController
public class ControlCuidador {

    ServiceCuidador serviceCuidador;

    public ControlCuidador(ServiceCuidador serviceCuidador) {
        this.serviceCuidador = serviceCuidador;
    }

    @GetMapping("/cuidadores")
    public List<Cuidador> getCuidadores() {
        return this.serviceCuidador.listarCuidadores();
    }

    @GetMapping("/cuidadores/{id}")
    public Cuidador getCuidador(Long id) {
        return this.serviceCuidador.buscarCuidador(id);
    }

    @PostMapping("/Cuidadores")
    public Cuidador crearCuidador(@RequestBody Cuidador Cuidador) {
        return this.serviceCuidador.crearCuidador(Cuidador);
    }

    @PutMapping("/Cuidadores/{id}")
    public void actualizarCuidador(@RequestBody Cuidador Cuidador, @PathVariable Long id) {
        this.serviceCuidador.actualizarCuidador(id, Cuidador);
    }

    @DeleteMapping("/Cuidadores/{id}")
    public void eliminarCuidador(@PathVariable Long id) {
        this.serviceCuidador.eliminarCuidador(id);
    }

}
