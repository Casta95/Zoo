package com.uptc.zoo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "alimentacion")
public class Alimentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int alimentacionID;
    @Transient
    private Cuidador cuidador;
    @Transient
    private Animal animal;
    @Column(name = "fecha_alimentacion")
    private String fechaAlimentacion;
    @Column(name = "tipo_alimento")
    private String tipoAlimento;
    @Column(name = "cantidad")
    private double cantidad;

    public Alimentacion() {
    }

    public Alimentacion(int alimentacionID, Cuidador cuidador, Animal animal, String fechaAlimentacion,
            String tipoAlimento, double cantidad) {
        this.alimentacionID = alimentacionID;
        this.cuidador = cuidador;
        this.animal = animal;
        this.fechaAlimentacion = fechaAlimentacion;
        this.tipoAlimento = tipoAlimento;
        this.cantidad = cantidad;
    }

    public int getAlimentacionID() {
        return alimentacionID;
    }

    public void setAlimentacionID(int alimentacionID) {
        this.alimentacionID = alimentacionID;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getFechaAlimentacion() {
        return fechaAlimentacion;
    }

    public void setFechaAlimentacion(String fechaAlimentacion) {
        this.fechaAlimentacion = fechaAlimentacion;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Alimentacion: " + alimentacionID + " - " + animal.getNombre() + " - " + cuidador.getNombre() + " - "
                + fechaAlimentacion + " - " + tipoAlimento + " - " + cantidad;
    }

}
