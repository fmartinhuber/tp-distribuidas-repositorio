package rmi;

import java.rmi.Remote;
import java.util.List;

import dto.ProveedorDto;
import dto.ServicioDto;
import dto.SucursalDto;
import dto.VehiculoDto;
import dto.ViajeDto;

public interface IAdministradorViaje extends Remote{

	public List <ViajeDto> listarSolicitudesDeViajePorSucursal(SucursalDto sucursal);

	public void generarViaje();
		
	public ProveedorDto buscarProveedor(String cuit);
	
	public List <ServicioDto> solicitarServicios();
	
	public List <ServicioDto> solicitarServiciosAdicionales();
	
	public void asignarVehiculo (ViajeDto viaje, VehiculoDto vehiculo);
	
	public void creacionRemito();
	
	public float calcularPrecio (ViajeDto viaje);
	
	public List <ProveedorDto> obtenerProveedores ();
	
	public List <SucursalDto> obtenerSurcusales();
	
	public List <VehiculoDto> obtenerVehiculos();
	
}
