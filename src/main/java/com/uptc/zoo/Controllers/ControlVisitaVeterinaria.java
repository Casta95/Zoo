package com.uptc.zoo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.zoo.Entities.VisitaVeterinaria;
import com.uptc.zoo.Services.ServiceVisitaVeterinaria;

@RestController
public class ControlVisitaVeterinaria {

    ServiceVisitaVeterinaria serviceVisitaVeterinaria;

    public ControlVisitaVeterinaria(ServiceVisitaVeterinaria serviceVisitaVeterinaria) {
        this.serviceVisitaVeterinaria = serviceVisitaVeterinaria;
    }

    @GetMapping("/visitas_veterinarias")
    public List<VisitaVeterinaria> getVisitaVeterinariaes() {
        return this.serviceVisitaVeterinaria.listarVisitasVeterinarias();
    }

    @GetMapping("/visitas_veterinarias/{id}")
    public VisitaVeterinaria getVisitaVeterinaria(Long id) {
        return this.serviceVisitaVeterinaria.buscarVisitaVeterinaria(id);
    }

    @PostMapping("/visitas_veterinaria")
    public VisitaVeterinaria crearVisitaVeterinaria(@RequestBody VisitaVeterinaria VisitaVeterinaria) {
        return this.serviceVisitaVeterinaria.crearVisitaVeterinaria(VisitaVeterinaria);
    }

    @PutMapping("/visitas_veterinarias/{id}")
    public void actualizarVisitaVeterinaria(@RequestBody VisitaVeterinaria VisitaVeterinaria, @PathVariable Long id) {
        this.serviceVisitaVeterinaria.actualizarVisitaVeterinaria(id, VisitaVeterinaria);
    }

    @DeleteMapping("/visitas_veterinarias/{id}")
    public void eliminarVisitaVeterinaria(@PathVariable Long id) {
        this.serviceVisitaVeterinaria.eliminarVisitaVeterinaria(id);
    }

}
