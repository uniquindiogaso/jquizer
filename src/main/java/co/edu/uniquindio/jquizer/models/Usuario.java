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
public class Usuario {

    private int id;
    private String username;
    private String password;
    private boolean activo;
    private int persona_id;
    private Persona persona;

    public Usuario() {
    }

    public Usuario(int id, String username, String password, boolean activo, int persona_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.activo = activo;
        this.persona_id = persona_id;
    }

    public Usuario(String username, String password, int persona_id) {
        this.username = username;
        this.password = password;
        this.persona_id = persona_id;
        this.activo = true;
    }

    public Usuario(String username, String password, boolean activo, Persona persona) {
        this.username = username;
        this.password = password;
        this.activo = activo;
        this.persona = persona;
    }

    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    


    
    
    
    
    
}
