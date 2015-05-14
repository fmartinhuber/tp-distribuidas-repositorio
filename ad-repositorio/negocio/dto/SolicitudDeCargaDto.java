package dto;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SolicitudDeCargaDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ClienteDto cliente;
	private List<CargaDto> cargas;
	private List<HabilitadoDto> habilitados;
	private DireccionDto direccion;
	private Date fechaEntregaProbable;
	private Date fechaEntregaMaxima;
	private File manifiesto; //Daro: Como pensamos manejar esto?. No es mas facil hacer un String?
	private String estadoSolcitud;
	
	public SolicitudDeCargaDto(ClienteDto cliente, List<CargaDto> cargas, List<HabilitadoDto> habilitados, 
			DireccionDto direccion, Date fechaEntregaProbable, Date fechaEntregaMaxima, File manifiesto, 
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

	public List<HabilitadoDto> getHabilitados() {
		return habilitados;
	}

	public void setHabilitados(List<HabilitadoDto> habilitados) {
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

	public File getManifiesto() {
		return manifiesto;
	}

	public void setManifiesto(File manifiesto) {
		this.manifiesto = manifiesto;
	}

	public String getEstadoSolcitud() {
		return estadoSolcitud;
	}

	public void setEstadoSolcitud(String estadoSolcitud) {
		this.estadoSolcitud = estadoSolcitud;
	}

}
