/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquindio.estudiantes.bases.Model;

/**
 *
 * @author gusta
 */
public class Tema {

    private int id;
    private String codInterno;
    private String descripcion;
    private boolean activo;
    private String nombre;

    public Tema() {
    }

    public Tema(String codInterno, String descripcion, String nombre) {
        this.codInterno = codInterno;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.activo = true;
    }

    public Tema(String codInterno, String nombre) {
        this.codInterno = codInterno;
        this.nombre = nombre;
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(String codInterno) {
        this.codInterno = codInterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    @Override
//    public String toString() {
//        return "Temas{" + "id=" + id + ", codInterno=" + codInterno + ", descripcion=" + descripcion + ", activo=" + activo + ", nombre=" + nombre + '}';
//    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    

}
