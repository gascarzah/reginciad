package pe.gob.essalud.principal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the DBTDI10 database table.
 * 
 */
@Entity
@Table(name = "DBTDI10")
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumento extends Auditoria {
	@Id
	@Column(name = "ctdi")
	private String ctdi;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "dtdi")
	private String dtdi;

	@OneToMany(mappedBy = "dbtdi10", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Ficha> tfichas;

}