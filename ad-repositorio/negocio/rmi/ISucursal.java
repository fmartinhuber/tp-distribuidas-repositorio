package rmi;

import java.rmi.Remote;
import java.util.List;

import dto.EmpleadoDto;
import dto.RemitoDto;
import dto.SolicitudDeCargaDto;
import dto.VehiculoDto;
import dto.ViajeDto;

public interface ISucursal extends Remote{

	/**
	 *  La nueva solicitud se realiza al momento que viene el cliente y solicita uuno nuevo.
	 */
	public void nuevaSolicitud();
	
	public List <ViajeDto> consultaSolicitudesSinViaje();
	
	public void designarEncargado(EmpleadoDto empleado);
	
	public void designarEncargadoDespacho(EmpleadoDto empleado);
	
	public void generarSolicitudCarga(SolicitudDeCargaDto solicitudDeCarga);
	
	/**
	 * La recepcion del pedido tiene que comparar el remito y la solicitud de carga.
	 * Cntrol de recepcion
	 * Cmparar la generacion con el envio. 
	 */
	public void recepcionPedido(RemitoDto remito);
	
	/**
	 * Devuelve los vehiculos que no tengan viajes asignados, no esten en taller. 
	 * @return Lista de vehiculos
	 */
	public List <VehiculoDto> obtenerVehiculosDisponibles();
}
