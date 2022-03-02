package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

	@Id
	@SequenceGenerator(name = "reserva", sequenceName = "sq_tb_reserva", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserva")
	@Column(name = "id_reserva")
	private Integer id;

	@Column(name = "dt_inicio", nullable = false)
	private Calendar dataInicio;

	@Column(name = "dt_termino", nullable = false)
	private Calendar dataTermino;

	@Column(name = "vl_total", nullable = false)
	private double valorTotalReserva;

	@Column(name = "ds_condicoes")
	private String condicoes;

	public Reserva() {
		super();
	}

	public Reserva(Integer id, Calendar dataInicio, Calendar dataTermino, double valorTotalReserva, String condicoes) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorTotalReserva = valorTotalReserva;
		this.condicoes = condicoes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getValorTotalReserva() {
		return valorTotalReserva;
	}

	public void setValorTotalReserva(double valorTotalReserva) {
		this.valorTotalReserva = valorTotalReserva;
	}

	public String getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}

}
