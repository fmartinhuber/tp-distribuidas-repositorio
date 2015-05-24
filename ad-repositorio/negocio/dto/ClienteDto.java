package dto;

import java.io.Serializable;
import java.util.List;

public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipoDocumento;
	private String nroDocumento;
	
	public ClienteDto(String tipoDocumento, String nroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	
}
