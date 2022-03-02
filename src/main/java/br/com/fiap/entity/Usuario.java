package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@SequenceGenerator(name = "usuario", sequenceName = "sq_tb_usuario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	@Column(name = "id_usuario")
	private Integer id;

	@Column(name = "nm_nome", nullable = false)
	private String nome;

	@Column(name = "nm_sobrenome", nullable = false)
	private String sobrenome;

	@Column(name = "ds_email", nullable = false)
	private String email;

	@Column(name = "dt_nascimento", nullable = false)
	private Calendar dataNascimento;

	@Column(name = "nr_telefone", nullable = false)
	private Integer telefone;

	@Column(name = "nr_cnh", nullable = false)
	private Integer numeroCNH;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String nome, String sobrenome, String email, Calendar dataNascimento, Integer telefone,
			Integer numeroCNH) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.numeroCNH = numeroCNH;
	}
	
	public Usuario(String nome, String sobrenome, String email, Calendar dataNascimento, Integer telefone,
			Integer numeroCNH) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.numeroCNH = numeroCNH;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(Integer numeroCNH) {
		this.numeroCNH = numeroCNH;
	}

}
