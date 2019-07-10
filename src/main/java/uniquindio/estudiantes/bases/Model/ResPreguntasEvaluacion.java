package uniquindio.estudiantes.bases.Model;

import java.util.ArrayList;
import java.util.List;

public class ResPreguntasEvaluacion {

	private int id;
	private String nombre;
	private String codinterno;
	private boolean activo;
	private boolean publica;
	private int tiempo;
	private Float valor;
	private List<OpcionPregunta> opcionPregunta;
	private Tema tema;
	private TipoPregunta tipoPregunta;
	
	private int temas_id;
	private int tipo_preg_id;
	
	private int t_defecto;

	public ResPreguntasEvaluacion() {
		super();
		this.opcionPregunta = new ArrayList<OpcionPregunta>();
		this.tema = new Tema();
		this.tipoPregunta = new TipoPregunta();
	}

	public ResPreguntasEvaluacion(int id, String nombre, String codinterno, boolean activo, boolean publica, int tiempo,
			Float valor, List<OpcionPregunta> opcionPregunta, Tema tema, TipoPregunta tipoPregunta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codinterno = codinterno;
		this.activo = activo;
		this.publica = publica;
		this.tiempo = tiempo;
		this.valor = valor;
		this.opcionPregunta = opcionPregunta;
		this.tema = tema;
		this.tipoPregunta = tipoPregunta;
	}

	public ResPreguntasEvaluacion(String nombre, String codinterno, boolean activo, boolean publica, int tiempo,
			Float valor, List<OpcionPregunta> opcionPregunta, Tema tema, TipoPregunta tipoPregunta) {
		super();
		this.nombre = nombre;
		this.codinterno = codinterno;
		this.activo = activo;
		this.publica = publica;
		this.tiempo = tiempo;
		this.valor = valor;
		this.opcionPregunta = opcionPregunta;
		this.tema = tema;
		this.tipoPregunta = tipoPregunta;
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

	public List<OpcionPregunta> getOpcionPregunta() {
		return opcionPregunta;
	}

	public void setOpcionPregunta(List<OpcionPregunta> opcionPregunta) {
		this.opcionPregunta = opcionPregunta;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public TipoPregunta getTipoPregunta() {
		return tipoPregunta;
	}

	public void setTipoPregunta(TipoPregunta tipoPregunta) {
		this.tipoPregunta = tipoPregunta;
	}

	public int getTemas_id() {
		return temas_id;
	}

	public void setTemas_id(int temas_id) {
		this.temas_id = temas_id;
	}

	public int getTipo_preg_id() {
		return tipo_preg_id;
	}

	public void setTipo_preg_id(int tipo_preg_id) {
		this.tipo_preg_id = tipo_preg_id;
	}
	
	public int getT_defecto() {
		return t_defecto;
	}

	public void setT_defecto(int t_defecto) {
		this.t_defecto = t_defecto;
	}

	public String imprimir() {
		return "ResPreguntasEvaluacion [id=" + id + ", nombre=" + nombre + ", codinterno=" + codinterno + ", activo="
				+ activo + ", publica=" + publica + ", tiempo=" + tiempo + ", valor=" + valor + ", opcionPregunta="
				+ opcionPregunta.size() + ", tema=" + tema + ", tipoPregunta=" + tipoPregunta + ", temas_id=" + temas_id
				+ ", tipo_preg_id=" + tipo_preg_id + "]";
	}

	
	
	
}
