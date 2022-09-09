package com.uce.edu.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="vuelo")
@NamedQuery(name = "Vuelo.buscarConDatos", query = "SELECT v FROM Vuelo v WHERE v.origen = :origen AND v.destino = :destino AND v.fechaVuelo = :fecha")
public class Vuelo {
	@Id
	@Column(name="vuel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vuel_id_seq")
	@SequenceGenerator(name = "vuel_id_seq", sequenceName = "vuel_id_seq", allocationSize = 1) 
	private Integer id;
	@Column(name="vuel_numero")
	private String numero;
	@Column(name="vuel_fecha_vuelo")
	private String fechaVuelo;
	@Column(name="vuel_asientos_disponibles")
	private Integer asientosDisponibles;
	@Column(name="vuel_valor_asientos")
	private BigDecimal valorAsientos;
	@Column(name="vuel_estado")
	private String estado;
	@ManyToOne
	@JoinColumn(name="vuel_id_avion")
	private Avion avion;
	@OneToMany(mappedBy = "vuelo")
	private List<CompraPasaje> compras;
	
	//para primera funcionalidad se agrega estos atributos
	@Column(name="vuel_origen")
	private String origen;
	@Column(name="vuel_destino")
	private String destino;
	
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
	
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}
	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}
	public BigDecimal getValorAsientos() {
		return valorAsientos;
	}
	public void setValorAsientos(BigDecimal valorAsientos) {
		this.valorAsientos = valorAsientos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public List<CompraPasaje> getCompras() {
		return compras;
	}
	public void setCompras(List<CompraPasaje> compras) {
		this.compras = compras;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	

}
