package dto;

import java.io.Serializable;

public class HabilitadoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipoDocumento;
	private int nroDocumento;
	private String apellidoNombre;
	
	public HabilitadoDto (String tipoDocumento, int nroDocumento, String apellidoNombre) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.apellidoNombre = apellidoNombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getApellidoNombre() {
		return apellidoNombre;
	}

	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}	
	
}
