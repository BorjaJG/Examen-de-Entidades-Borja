package domain.models;


import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PlazoFijo {

    private  String id;
    private  String nombre;
    private String descripcion;
    private Date duraciion;
    private Integer interes;


    public String getId() {
        return id;
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

    public Date getDuraciion() {
        return duraciion;
    }

    public void setDuraciion(Date duraciion) {
        this.duraciion = duraciion;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }


    }





