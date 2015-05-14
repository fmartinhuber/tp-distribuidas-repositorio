package dto;

import java.util.List;


public class ProveedorDto {
	
	public ProveedorDto(String tipoDocumento, int numeroDocumento,
			String razonSocial, DireccionDto domicilioComercial,
			List<ServicioDto> serviciosProvistos) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.razonSocial = razonSocial;
		this.domicilioComercial = domicilioComercial;
		this.serviciosProvistos = serviciosProvistos;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public DireccionDto getDomicilioComercial() {
		return domicilioComercial;
	}
	public void setDomicilioComercial(DireccionDto domicilioComercial) {
		this.domicilioComercial = domicilioComercial;
	}
	public List<ServicioDto> getServiciosProvistos() {
		return serviciosProvistos;
	}
	public void setServiciosProvistos(List<ServicioDto> serviciosProvistos) {
		this.serviciosProvistos = serviciosProvistos;
	}
	private String tipoDocumento;
	private int numeroDocumento;
	private String razonSocial;
	private DireccionDto domicilioComercial;
	private List<ServicioDto> serviciosProvistos;
}
