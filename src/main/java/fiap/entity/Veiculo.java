package fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

	@Id
	@SequenceGenerator(name = "veiculo", sequenceName = "sq_tb_veiculo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo")
	@Column(name = "id_veiculo")
	private int id;

}
