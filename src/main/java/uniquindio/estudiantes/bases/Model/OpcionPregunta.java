package uniquindio.estudiantes.bases.Model;

public class OpcionPregunta {
	
	private int id;
	private String descripcion;
	private boolean correcta;
	private String pista;
	private int pregunta_id;
	private String pareja;

	public OpcionPregunta() {
		super();
	}
	


	public OpcionPregunta(String descripcion, boolean correcta, String pista, String pareja) {
		super();
		this.descripcion = descripcion;
		this.correcta = correcta;
		this.pista = pista;
		this.pareja = pareja;
	}





	public OpcionPregunta(String descripcion, boolean correcta, String pista) {
		super();
		this.descripcion = descripcion;
		this.correcta = correcta;
		this.pista = pista;
	}

	


	public OpcionPregunta(String descripcion, String pareja) {
		super();
		this.descripcion = descripcion;
		this.pareja = pareja;
	}



	public OpcionPregunta(String descripcion, boolean correcta, String pista, int pregunta_id) {
		super();
		this.descripcion = descripcion;
		this.correcta = correcta;
		this.pista = pista;
		this.pregunta_id = pregunta_id;
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
	 * @return the correcta
	 */
	public boolean isCorrecta() {
		return correcta;
	}

	/**
	 * @param correcta the correcta to set
	 */
	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}

	/**
	 * @return the pista
	 */
	public String getPista() {
		return pista;
	}

	/**
	 * @param pista the pista to set
	 */
	public void setPista(String pista) {
		this.pista = pista;
	}

	/**
	 * @return the pregunta_id
	 */
	public int getPregunta_id() {
		return pregunta_id;
	}

	/**
	 * @param pregunta_id the pregunta_id to set
	 */
	public void setPregunta_id(int pregunta_id) {
		this.pregunta_id = pregunta_id;
	}



	/**
	 * @return the pareja
	 */
	public String getPareja() {
		return pareja;
	}



	/**
	 * @param pareja the pareja to set
	 */
	public void setPareja(String pareja) {
		this.pareja = pareja;
	}


	public String imprimir() {
		return "OpcionPregunta [id=" + id + ", descripcion=" + descripcion + ", correcta=" + correcta + ", pista="
				+ pista + ", pregunta_id=" + pregunta_id + ", pareja=" + pareja + "]";
	}
	
	
	
	
	
	

}
