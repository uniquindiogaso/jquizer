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
public class Depto {    
    private int id;
    private String codInterno;
    private String nombre;    

    public Depto() {
    }

    public Depto(String codInterno, String nombre) {
        this.codInterno = codInterno;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
