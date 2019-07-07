package uniquindio.estudiantes.bases.Model;

public class BancoPreguntas {
	
	private int pregunta_id;
	private String codigo;
	private String nombre;
	private String tipopregunta;
	
	public BancoPreguntas() {
		
	}
	
	public BancoPreguntas(int pregunta_id, String codigo, String nombre, String tipopregunta) {
		super();
		this.pregunta_id = pregunta_id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipopregunta = tipopregunta;
	}

	public int getPregunta_id() {
		return pregunta_id;
	}

	public void setPregunta_id(int pregunta_id) {
		this.pregunta_id = pregunta_id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipopregunta() {
		return tipopregunta;
	}

	public void setTipopregunta(String tipopregunta) {
		this.tipopregunta = tipopregunta;
	}
}
