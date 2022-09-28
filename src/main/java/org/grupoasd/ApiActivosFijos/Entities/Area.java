package org.grupoasd.ApiActivosFijos.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Area")
public class Area {
    @Id
    private String nombreArea;
    @Column
    private String ciudad;

    public Area(String nombreArea, String ciudad) {
        this.nombreArea = nombreArea;
        this.ciudad = ciudad;
    }

    public Area() {
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
