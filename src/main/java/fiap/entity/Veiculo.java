package fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import fiap.entity.enums.Cores;
import fiap.entity.enums.Opcionais;
import fiap.entity.enums.TipoCombustivel;
import fiap.entity.enums.TipoTransmissao;
import fiap.entity.enums.TipoVeiculo;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

	@Id
	@SequenceGenerator(name = "veiculo", sequenceName = "sq_tb_veiculo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo")
	@Column(name = "id_veiculo")
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "tp_veiculo", nullable = false)
	private TipoVeiculo tipoVeiculo;

	@Column(name = "nm_marca", nullable = false)
	private String marca;

	@Column(name = "nm_modelo", nullable = false)
	private String modelo;

	@Column(name = "dt_ano_modelo", nullable = false)
	private Integer anoModelo;

	@Column(name = "dt_ano_fabricacao", nullable = false)
	private Integer anoFabricacao;

	@Column(name = "nr_cilindradas", nullable = false)
	private Integer cilindradas;

	@Enumerated(EnumType.STRING)
	@Column(name = "tp_combustivel", nullable = false)
	private TipoCombustivel tipoCombustivel;

	@Column(name = "nr_quilometragem", nullable = false)
	private Integer quilometragem;

	@Enumerated(EnumType.STRING)
	@Column(name = "tp_transmissao", nullable = false)
	private TipoTransmissao tipoTransmissao;

	@Column(name = "ds_descricao")
	private String descricao;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_opcionais", nullable = false)
	private Opcionais opcionais;

	@Column(name = "ds_placa", nullable = false)
	private String placa;

	@Column(name = "tp_cores", nullable = false)
	private Cores cores;

	public Veiculo() {
		super();
	}

	public Veiculo(Integer id, TipoVeiculo tipoVeiculo, String marca, String modelo, Integer anoModelo,
			Integer anoFabricacao, Integer cilindradas, TipoCombustivel tipoCombustivel, Integer quilometragem,
			TipoTransmissao tipoTransmissao, String descricao, Opcionais opcionais, String placa, Cores cores) {
		super();
		this.id = id;
		this.tipoVeiculo = tipoVeiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.cilindradas = cilindradas;
		this.tipoCombustivel = tipoCombustivel;
		this.quilometragem = quilometragem;
		this.tipoTransmissao = tipoTransmissao;
		this.descricao = descricao;
		this.opcionais = opcionais;
		this.placa = placa;
		this.cores = cores;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
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

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public TipoTransmissao getTipoTransmissao() {
		return tipoTransmissao;
	}

	public void setTipoTransmissao(TipoTransmissao tipoTransmissao) {
		this.tipoTransmissao = tipoTransmissao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Opcionais getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(Opcionais opcionais) {
		this.opcionais = opcionais;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cores getCores() {
		return cores;
	}

	public void setCores(Cores cores) {
		this.cores = cores;
	}

}
