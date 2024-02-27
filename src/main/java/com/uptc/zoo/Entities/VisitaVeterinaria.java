package com.uptc.zoo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "visita_veterinaria")
public class VisitaVeterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int visitaID;
    @OneToOne
    @JoinColumn(name = "animalID")
    private Animal animal;
    @Column(name = "fecha_visita")
    private String fechaVisita;
    @Column(name = "motivo")
    private String motivo;
    @Column(name = "resultado")
    private String resultado;

    public VisitaVeterinaria() {
    }

    public VisitaVeterinaria(int visitaID, Animal animal, String fechaVisita, String motivo, String resultado) {
        this.visitaID = visitaID;
        this.animal = animal;
        this.fechaVisita = fechaVisita;
        this.motivo = motivo;
        this.resultado = resultado;
    }

    public int getVisitaID() {
        return visitaID;
    }

    public void setVisitaID(int visitaID) {
        this.visitaID = visitaID;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String toString() {
        return "Visita Veterinaria: " + visitaID + " - " + animal.getNombre() + " - " + fechaVisita + " - " + motivo
                + " - " + resultado;
    }

}