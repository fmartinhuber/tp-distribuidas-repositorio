package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.ClienteDto;
import dto.DireccionDto;
import dto.EmpleadoDto;
import dto.SucursalDto;

public interface IAdministradorVarios extends Remote{

	public void altaCliente(ClienteDto cliente) throws RemoteException;
	
	public ClienteDto obtenerCliente(String dni) throws RemoteException;
	
	public void altaDireccion (DireccionDto direccion) throws RemoteException;
	
	public void altaSucursal (SucursalDto sucursal) throws RemoteException;
	
	public void altaEmpleado (EmpleadoDto empleado) throws RemoteException;
	
	
	
}
