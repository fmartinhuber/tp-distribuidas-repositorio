package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ProveedorDto;
import dto.ServicioDto;
import dto.SucursalDto;
import dto.VehiculoDto;
import dto.ViajeDto;

public interface IAdministradorViaje extends Remote{

	public List <ViajeDto> listarSolicitudesDeViajePorSucursal(SucursalDto sucursal) throws RemoteException;

	public void generarViaje() throws RemoteException;
		
	public ProveedorDto buscarProveedor(String cuit) throws RemoteException;
	
	public List <ServicioDto> solicitarServicios() throws RemoteException;
	
	public List <ServicioDto> solicitarServiciosAdicionales() throws RemoteException;
	
	public void asignarVehiculo (ViajeDto viaje, VehiculoDto vehiculo) throws RemoteException;
	
	public void creacionRemito() throws RemoteException;
	
	public float calcularPrecio (ViajeDto viaje) throws RemoteException;
	
	public List <ProveedorDto> obtenerProveedores () throws RemoteException;
	
	public List <SucursalDto> obtenerSurcusales() throws RemoteException;
	
	public List <VehiculoDto> obtenerVehiculos() throws RemoteException;
	
}
