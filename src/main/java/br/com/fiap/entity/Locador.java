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
@Table(name = "tb_locador")
public class Locador {

	@Id
	@SequenceGenerator(name = "locador", sequenceName = "sq_tb_locador", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locador")
	@Column(name = "id_locador")
	private Integer id;

	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@OneToMany(mappedBy = "locador")
	private Collection<Veiculo> veiculo;

	public Locador() {
		super();
	}

	public Locador(Integer id) {
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
