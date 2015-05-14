package dto;

import java.io.Serializable;
import java.util.List;

public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipoDocumento;
	private int nroDocumento;
	
	public ClienteDto(String tipoDocumento, int nroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
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
	
	
}
