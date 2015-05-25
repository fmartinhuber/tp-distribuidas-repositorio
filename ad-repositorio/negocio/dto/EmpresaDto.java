package dto;
import java.io.Serializable;
import java.util.List;

public class EmpresaDto extends ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String razonSocial;
	private DireccionDto domicilioComercial;
	private String condici�nIVA;
	public List<DireccionDto> destinosHabilitados;
	
	public EmpresaDto(String tipoDocumento, String nroDocumento) {
		super(tipoDocumento, nroDocumento);
		// TODO Auto-generated constructor stub
	}
	
	public EmpresaDto() {
		
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

	public String getCondici�nIVA() {
		return condici�nIVA;
	}

	public void setCondici�nIVA(String condici�nIVA) {
		this.condici�nIVA = condici�nIVA;
	}

	public List<DireccionDto> getDestinosHabilitados() {
		return destinosHabilitados;
	}

	public void setDestinosHabilitados(List<DireccionDto> destinosHabilitados) {
		this.destinosHabilitados = destinosHabilitados;
	}
	
}
