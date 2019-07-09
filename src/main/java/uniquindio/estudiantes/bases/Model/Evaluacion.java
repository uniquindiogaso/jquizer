package uniquindio.estudiantes.bases.Model;

import java.util.Date;

public class Evaluacion {
	
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private Date f_inicio;
	private Date f_fin;
	private int duracion;
	private boolean activo;
	private int docente_id;
	private Tema tema;
	
	public Evaluacion() {
		super();
	}

	public Evaluacion(String nombre, String descripcion, String tipo, Date f_inicio, Date f_fin, int duracion,
			int docente_id) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.f_inicio = f_inicio;
		this.f_fin = f_fin;
		this.duracion = duracion;
		this.docente_id = docente_id;
		this.activo = true;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the f_inicio
	 */
	public Date getF_inicio() {
		return f_inicio;
	}

	/**
	 * @param f_inicio the f_inicio to set
	 */
	public void setF_inicio(Date f_inicio) {
		this.f_inicio = f_inicio;
	}

	/**
	 * @return the f_fin
	 */
	public Date getF_fin() {
		return f_fin;
	}

	/**
	 * @param f_fin the f_fin to set
	 */
	public void setF_fin(Date f_fin) {
		this.f_fin = f_fin;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/**
	 * @return the docente_id
	 */
	public int getDocente_id() {
		return docente_id;
	}

	/**
	 * @param docente_id the docente_id to set
	 */
	public void setDocente_id(int docente_id) {
		this.docente_id = docente_id;
	}

	/**
	 * @return the tema
	 */
	public Tema getTema() {
		return tema;
	}

	/**
	 * @param tema the tema to set
	 */
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
	
	
	
	
	

}
