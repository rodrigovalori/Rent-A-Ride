package fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dados_pagamento")
public class DadosPagamento {

	@Id
	@SequenceGenerator(name = "dados_pagamento", sequenceName = "sq_tb_dados_pagamento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dados_pagamento")
	@Column(name = "id_dados_pagamento")
	private Integer id;

	@Column(name = "nr_cartao", nullable = false)
	private Integer numeroCartao;

	@Column(name = "nm_titular", nullable = false)
	private String nomeTitular;

	@Column(name = "cd_seguranca", nullable = false)
	private Integer codigoSeguranca;

	@Column(name = "nr_cpf", nullable = false)
	private Integer cpf;

	public DadosPagamento() {
		super();
	}

	public DadosPagamento(Integer id, Integer numeroCartao, String nomeTitular, Integer codigoSeguranca, Integer cpf) {
		super();
		this.id = id;
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.codigoSeguranca = codigoSeguranca;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(Integer codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

}
