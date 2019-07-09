package uniquindio.estudiantes.bases.Model;

public class Pregunta {

	private int id;
	private String nombre;
	private String codinterno;
	private boolean activo;
	private boolean publica;
	private int tema_id;
	private int tipo_preg_id;
	private int parent_id;
	private int tiempo;
	private Float valor;
	
	
	public Pregunta() {
		super();
	}


	public Pregunta(int id, String nombre, String codinterno, boolean activo, boolean publica, int tema_id,
			int tipo_preg_id, int parent_id, int tiempo, Float valor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codinterno = codinterno;
		this.activo = activo;
		this.publica = publica;
		this.tema_id = tema_id;
		this.tipo_preg_id = tipo_preg_id;
		this.parent_id = parent_id;
		this.tiempo = tiempo;
		this.valor = valor;
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


	public String getCodinterno() {
		return codinterno;
	}


	public void setCodinterno(String codinterno) {
		this.codinterno = codinterno;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public boolean isPublica() {
		return publica;
	}


	public void setPublica(boolean publica) {
		this.publica = publica;
	}


	public int getTema_id() {
		return tema_id;
	}


	public void setTema_id(int tema_id) {
		this.tema_id = tema_id;
	}


	public int getTipo_preg_id() {
		return tipo_preg_id;
	}


	public void setTipo_preg_id(int tipo_preg_id) {
		this.tipo_preg_id = tipo_preg_id;
	}


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	public Float getValor() {
		return valor;
	}


	public void setValor(Float valor) {
		this.valor = valor;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
	
	
}
