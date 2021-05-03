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

@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "TFACCONS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactorContribuyente extends Auditoria {

	@Id
	@Column(name = "cfaccon")
	private String cfaccon;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "dfaccon")
	private String dfaccon;

	@OneToMany(mappedBy = "tfaccon", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<FactorIndividual> tfacinds;

	@OneToMany(mappedBy = "tfaccon", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Factor> tfactores;

}