package com.uptc.zoo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitat")
public class Habitat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int habitatID;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "clima")
    private String clima;
    @Column(name = "vegetacion")
    private String vegetacion;
    @Column(name = "superficie")
    private double superficie;

    public Habitat(int habitatID, String nombre, String clima, String vegetacion, double superficie) {
        this.habitatID = habitatID;
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.superficie = superficie;
    }

    public int getHabitatID() {
        return habitatID;
    }

    public void setHabitatID(int habitatID) {
        this.habitatID = habitatID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

}
