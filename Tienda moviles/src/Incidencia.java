public class Incidencia {
	private String nAveria, fechaInicio, diagnostico, resolucion, fechaCierre;
	private Movil movil;
	
	public Incidencia(String nAveria, String fechaInicio, Movil movil) {
		super();
		this.nAveria = nAveria;
		this.fechaInicio = fechaInicio;
		this.movil = movil;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getnAveria() {
		return nAveria;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public Movil getMonitor() {
		return movil;
	}
	
}

