package dto;

import java.util.List;

public class PlanMantenimientoDto {
	private List<String> operaciones;
	private float cumplimiento;
	public List<String> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(List<String> operaciones) {
		this.operaciones = operaciones;
	}
	public float getCumplimiento() {
		return cumplimiento;
	}
	public void setCumplimiento(float cumplimiento) {
		this.cumplimiento = cumplimiento;
	}
	public PlanMantenimientoDto(List<String> operaciones, float cumplimiento) {
		super();
		this.operaciones = operaciones;
		this.cumplimiento = cumplimiento;
	}
}
