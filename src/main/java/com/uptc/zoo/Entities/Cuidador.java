package com.uptc.zoo.Entities;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuidador")
public class Cuidador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cuidadorID;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fecha_contratacion")
    private String fechaContratacion;
    @Column(name = "especialidad")
    private String especialidad;
    @JsonIgnoreProperties("animales")
    @ManyToMany(mappedBy = "cuidadores")
    private Collection<Animal> animales;

    public Cuidador() {
    }

    public Cuidador(int cuidadorID, String nombre, String apellidos, String fechaContratacion, String especialidad) {
        this.cuidadorID = cuidadorID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaContratacion = fechaContratacion;
        this.especialidad = especialidad;
    }

    public int getCuidadorID() {
        return cuidadorID;
    }

    public void setCuidadorID(int cuidadorID) {
        this.cuidadorID = cuidadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
