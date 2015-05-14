package rmi;

import java.rmi.Remote;

import dto.CargaDto;
import dto.ClienteDto;
import dto.DireccionDto;

public interface ISolicitudDeCarga extends Remote{

	public void agregarCarga (CargaDto carga);

	public void nuevoDestino (DireccionDto domicilio);

	public ClienteDto buscarCliente (int cuit);
	
	public void actualizarEstado (String estado);	
	
}
