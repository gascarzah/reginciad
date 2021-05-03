package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the TFICHACASNOMEN database table.
 * 
 */
@Entity
@Table(name = "TFICHACASNOMEN")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class NomenclaturaFicha extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ccas")
	private String ccas;
	@Column(name = "bestareg")
	private String bestareg;
	@Column(name = "nomen")
	private String nomen;

}