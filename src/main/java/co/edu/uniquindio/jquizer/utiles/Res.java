/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.jquizer.utiles;

/**
 *
 * @author gusta
 */
public class Res {

    private int codigo;
    private String titulo;
    private String msj;

    public Res(int codigo, String titulo, String msj) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.msj = msj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

}
