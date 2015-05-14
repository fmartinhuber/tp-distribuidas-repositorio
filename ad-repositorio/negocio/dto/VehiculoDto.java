package dto;

import java.io.Serializable;
import java.util.Date;



public class VehiculoDto implements Serializable{
	private String dominio;
	private String marca;
	private String modelo;
	private int anio;
	private int cedulaVerde;
	private Date vencimientoCedulaVerde;
	private float peso;
	private float tara;
	private float volumenDeCarga;
	private String caracteristicas;
	private PlanMantenimientoDto plan;
	private float disponibilidadVolumen;
	private float disponibilidadTara;
	private float capacidadDisponible;
	private boolean enMantenimiento;
	private boolean enViaje;
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getCedulaVerde() {
		return cedulaVerde;
	}
	public void setCedulaVerde(int cedulaVerde) {
		this.cedulaVerde = cedulaVerde;
	}
	public Date getVencimientoCedulaVerde() {
		return vencimientoCedulaVerde;
	}
	public void setVencimientoCedulaVerde(Date vencimientoCedulaVerde) {
		this.vencimientoCedulaVerde = vencimientoCedulaVerde;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getTara() {
		return tara;
	}
	public void setTara(float tara) {
		this.tara = tara;
	}
	public float getVolumenDeCarga() {
		return volumenDeCarga;
	}
	public void setVolumenDeCarga(float volumenDeCarga) {
		this.volumenDeCarga = volumenDeCarga;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public PlanMantenimientoDto getPlan() {
		return plan;
	}
	public void setPlan(PlanMantenimientoDto plan) {
		this.plan = plan;
	}
	public float getDisponibilidadVolumen() {
		return disponibilidadVolumen;
	}
	public void setDisponibilidadVolumen(float disponibilidadVolumen) {
		this.disponibilidadVolumen = disponibilidadVolumen;
	}
	public float getDisponibilidadTara() {
		return disponibilidadTara;
	}
	public void setDisponibilidadTara(float disponibilidadTara) {
		this.disponibilidadTara = disponibilidadTara;
	}
	public float getCapacidadDisponible() {
		return capacidadDisponible;
	}
	public void setCapacidadDisponible(float capacidadDisponible) {
		this.capacidadDisponible = capacidadDisponible;
	}
	public boolean isEnMantenimiento() {
		return enMantenimiento;
	}
	public void setEnMantenimiento(boolean enMantenimiento) {
		this.enMantenimiento = enMantenimiento;
	}
	public boolean isEnViaje() {
		return enViaje;
	}
	public void setEnViaje(boolean enViaje) {
		this.enViaje = enViaje;
	}
	public VehiculoDto(String dominio, String marca, String modelo, int anio,
			int cedulaVerde, Date vencimientoCedulaVerde, float peso,
			float tara, float volumenDeCarga, String caracteristicas,
			PlanMantenimientoDto plan, float disponibilidadVolumen,
			float disponibilidadTara, float capacidadDisponible,
			boolean enMantenimiento, boolean enViaje) {
		super();
		this.dominio = dominio;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cedulaVerde = cedulaVerde;
		this.vencimientoCedulaVerde = vencimientoCedulaVerde;
		this.peso = peso;
		this.tara = tara;
		this.volumenDeCarga = volumenDeCarga;
		this.caracteristicas = caracteristicas;
		this.plan = plan;
		this.disponibilidadVolumen = disponibilidadVolumen;
		this.disponibilidadTara = disponibilidadTara;
		this.capacidadDisponible = capacidadDisponible;
		this.enMantenimiento = enMantenimiento;
		this.enViaje = enViaje;
	}
}
