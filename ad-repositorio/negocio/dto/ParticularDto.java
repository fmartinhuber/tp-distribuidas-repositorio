package dto;

import java.io.Serializable;

public class ParticularDto extends ClienteDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String apellido;
	private String nombre;
	private DireccionDto direccion;
	
	public ParticularDto(String tipoDocumento, String nroDocumento,
			String apellido, String nombre, DireccionDto direccion) {
		super(tipoDocumento, nroDocumento);
		this.apellido = apellido;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public ParticularDto() {

	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DireccionDto getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDto direccion) {
		this.direccion = direccion;
	}
	
}
