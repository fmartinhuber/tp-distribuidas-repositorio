package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SolicitudDeCargaDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ClienteDto cliente;
	private List<CargaDto> cargas;
	private String habilitados;
	private DireccionDto direccion;
	private Date fechaEntregaProbable;
	private Date fechaEntregaMaxima;
	private String manifiesto;
	private String estadoSolcitud;
	private String dniCliente;
	
	public SolicitudDeCargaDto(ClienteDto cliente, List<CargaDto> cargas, String habilitados, 
			DireccionDto direccion, Date fechaEntregaProbable, Date fechaEntregaMaxima, String manifiesto, 
			String estadoSolcitud) {

		this.cliente = cliente;
		this.cargas = cargas;
		this.habilitados = habilitados;
		this.direccion = direccion;
		this.fechaEntregaProbable = fechaEntregaProbable;
		this.fechaEntregaMaxima = fechaEntregaMaxima;
		this.manifiesto = manifiesto;
		this.estadoSolcitud = estadoSolcitud;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public List<CargaDto> getCargas() {
		return cargas;
	}

	public void setCargas(List<CargaDto> cargas) {
		this.cargas = cargas;
	}

	public String getHabilitados() {
		return habilitados;
	}

	public void setHabilitados(String habilitados) {
		this.habilitados = habilitados;
	}

	public DireccionDto getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDto direccion) {
		this.direccion = direccion;
	}

	public Date getFechaEntregaProbable() {
		return fechaEntregaProbable;
	}

	public void setFechaEntregaProbable(Date fechaEntregaProbable) {
		this.fechaEntregaProbable = fechaEntregaProbable;
	}

	public Date getFechaEntregaMaxima() {
		return fechaEntregaMaxima;
	}

	public void setFechaEntregaMaxima(Date fechaEntregaMaxima) {
		this.fechaEntregaMaxima = fechaEntregaMaxima;
	}

	public String getManifiesto() {
		return manifiesto;
	}

	public void setManifiesto(String manifiesto) {
		this.manifiesto = manifiesto;
	}

	public String getEstadoSolcitud() {
		return estadoSolcitud;
	}

	public void setEstadoSolcitud(String estadoSolcitud) {
		this.estadoSolcitud = estadoSolcitud;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

}
