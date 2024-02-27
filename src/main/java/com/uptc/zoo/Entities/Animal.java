package com.uptc.zoo.Entities;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalID;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "especie")
    private String especie;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name = "sexo")
    private String sexo;
    @JsonIgnoreProperties("cuidadores")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "alimentacion", joinColumns = @JoinColumn(name = "animalID"), inverseJoinColumns = @JoinColumn(name = "cuidadorId"))
    private Collection<Cuidador> cuidadores;

    public Animal() {
    }

    public Animal(int animalID, String nombre, String especie, String fechaNacimiento, String sexo) {
        this.animalID = animalID;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
