package com.uce.edu.demo.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="compra_pasaje")
public class CompraPasaje {
	@Id
	@Column(name="comp_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comp_id_seq")
	@SequenceGenerator(name = "comp_id_seq", sequenceName = "comp_id_seq", allocationSize = 1) 
	private Integer id;
	@Column(name="comp_numero")
	private String numero;
	@Column(name="comp_fecha_compra")
	private LocalDateTime fechaCompra;
	@Column(name="comp_cantidad_asientos_disponibles")
	private Integer cantidadAsientosComprados;
	@Column(name="comp_estado")
	private String estado;
	@ManyToOne
	@JoinColumn(name="comp_id_vuelo")
	private Vuelo vuelo;
	@ManyToOne
	@JoinColumn(name="comp_id_cliente")
	private Cliente cliente;
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Integer getCantidadAsientosComprados() {
		return cantidadAsientosComprados;
	}
	public void setCantidadAsientosComprados(Integer cantidadAsientosComprados) {
		this.cantidadAsientosComprados = cantidadAsientosComprados;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
