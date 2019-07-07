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
public class TipoPregunta {
    
    private int id;
    private String codinterno;
    private String nombre;
    private boolean activo;
    
    
	public TipoPregunta() {
		super();
	}

	public TipoPregunta(int id, String codinterno, String nombre, boolean activo) {
		super();
		this.id = id;
		this.codinterno = codinterno;
		this.nombre = nombre;
		this.activo = activo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodinterno() {
		return codinterno;
	}
	public void setCodinterno(String codinterno) {
		this.codinterno = codinterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
    
    
    

    
}
