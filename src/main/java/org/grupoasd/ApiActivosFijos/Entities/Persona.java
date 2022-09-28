package org.grupoasd.ApiActivosFijos.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persona")
public class Persona {
    @Column
    private String nombrePersona;
    @Id
    private int numeroCedula;
    @Column
    private String cargo;

    public Persona(String nombrePersona, int numeroCedula, String cargo) {
        this.nombrePersona = nombrePersona;
        this.numeroCedula = numeroCedula;
        this.cargo = cargo;
    }

    public Persona() {
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
