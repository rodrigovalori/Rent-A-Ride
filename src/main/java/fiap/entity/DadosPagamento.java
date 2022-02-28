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
	private int id;

}
