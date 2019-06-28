/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.jquizer.models;

/**
 *
 * @author gusta
 */
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String tipo;
    private Ciudad Ciudad;
    private int ciudad_id;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo, String telefono, String tipo, int ciudad_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo = tipo;
        this.ciudad_id = ciudad_id;
    }

    public Persona(String nombre, String apellido, String correo, String telefono, String tipo, Ciudad Ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo = tipo;
        this.Ciudad = Ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ciudad getCiudad_id() {
        return Ciudad;
    }

    public void setCiudad_id(Ciudad ciudad_id) {
        this.Ciudad = ciudad_id;
    }

}
