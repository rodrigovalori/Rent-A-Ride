package br.com.fiap.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_locatario")
public class Locatario {

	@Id
	@SequenceGenerator(name = "locatario", sequenceName = "sq_tb_locatario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locatario")
	@Column(name = "id_locatario")
	private Integer id;

	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@OneToMany(mappedBy = "locatario")
	private Collection<Reserva> reserva;

	public Locatario() {
		super();
	}

	public Locatario(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
