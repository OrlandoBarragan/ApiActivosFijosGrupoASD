package org.grupoasd.ApiActivosFijos.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ActivosFijos")
public class ActivosFijos {
    @Id
    private String nombreActivo;
    @Column
    private String descripcionActivo;
    @Column
    private String tipoActivo;
    @Column
    private int serialActivo;
    @Column
    private int numeroInternoInventario;
    @Column
    private int peso;
    @Column
    private int alto;
    @Column
    private int ancho;
    @Column
    private int largo;
    @Column
    private double valorCompra;
    @Column
    private String fechaCompra;

    public ActivosFijos(String nombreActivo, String descripcionActivo, String tipoActivo, int serialActivo, int numeroInternoInventario, int peso, int alto, int ancho, int largo, double valorCompra, String fechaCompra) {
        this.nombreActivo = nombreActivo;
        this.descripcionActivo = descripcionActivo;
        this.tipoActivo = tipoActivo;
        this.serialActivo = serialActivo;
        this.numeroInternoInventario = numeroInternoInventario;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.valorCompra = valorCompra;
        this.fechaCompra = fechaCompra;
    }

    public ActivosFijos() {
    }

    public String getNombreActivo() {
        return nombreActivo;
    }

    public void setNombreActivo(String nombreActivo) {
        this.nombreActivo = nombreActivo;
    }

    public String getDescripcionActivo() {
        return descripcionActivo;
    }

    public void setDescripcionActivo(String descripcionActivo) {
        this.descripcionActivo = descripcionActivo;
    }

    public String getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(String tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    public int getSerialActivo() {
        return serialActivo;
    }

    public void setSerialActivo(int serialActivo) {
        this.serialActivo = serialActivo;
    }

    public int getNumeroInternoInventario() {
        return numeroInternoInventario;
    }

    public void setNumeroInternoInventario(int numeroInternoInventario) {
        this.numeroInternoInventario = numeroInternoInventario;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
