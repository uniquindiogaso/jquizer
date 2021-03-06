package uniquindio.estudiantes.bases.Model;

public class ResEstudiante {
	private int id;
	private int evaluacion_id;
	private int opc_pregunta_id;
	private int pre_eval_id;
	private boolean resBoolean;
	
			
	public ResEstudiante() {
		super();
	}

	public ResEstudiante(int evaluacion_id, int opc_pregunta_id, int pre_eval_id) {
		super();
		this.evaluacion_id = evaluacion_id;
		this.opc_pregunta_id = opc_pregunta_id;
		this.pre_eval_id = pre_eval_id;
	}
	
	

	public ResEstudiante(int evaluacion_id, int pre_eval_id, boolean resBoolean) {
		super();
		this.evaluacion_id = evaluacion_id;
		this.pre_eval_id = pre_eval_id;
		this.resBoolean = resBoolean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEvaluacion_id() {
		return evaluacion_id;
	}

	public void setEvaluacion_id(int evaluacion_id) {
		this.evaluacion_id = evaluacion_id;
	}

	public int getOpc_pregunta_id() {
		return opc_pregunta_id;
	}

	public void setOpc_pregunta_id(int opc_pregunta_id) {
		this.opc_pregunta_id = opc_pregunta_id;
	}

	public int getPre_eval_id() {
		return pre_eval_id;
	}

	public void setPre_eval_id(int pre_eval_id) {
		this.pre_eval_id = pre_eval_id;
	}

	public boolean isResBoolean() {
		return resBoolean;
	}

	public void setResBoolean(boolean resBoolean) {
		this.resBoolean = resBoolean;
	}

	
	public String imprimir() {
		return "ResEstudiante [id=" + id + ", evaluacion_id=" + evaluacion_id + ", opc_pregunta_id=" + opc_pregunta_id
				+ ", pre_eval_id=" + pre_eval_id + ", resBoolean=" + resBoolean + "]";
	}
	
	
	

	
	
}
