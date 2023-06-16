package domain.models;

import java.util.Date;

public class Tarjeta implements ProductosBancarios{
    private  String id;
    private String nombre;
    private  String descripcion;
    private Date fechaCaducidad;
    private String numTarjeta;

    public String getId() {
        return id;
    }

    @Override
    public String getdescripcion() {
        return null;
    }

    @Override
    public String getnombre() {
        return null;
    }

    @Override
    public String getduraciion() {
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
}
