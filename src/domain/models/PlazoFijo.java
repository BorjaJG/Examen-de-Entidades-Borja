package domain.models;


import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PlazoFijo implements ProductosBancarios{

  private  String Id;
  private String nombre;
  private String descripcion;
  private Date duracion;
  private Integer interese;


    @Override
    public String getId() {
        return Id;
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
        Id = id;
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

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public Integer getInterese() {
        return interese;
    }

    public void setInterese(Integer interese) {
        this.interese = interese;
    }
}





