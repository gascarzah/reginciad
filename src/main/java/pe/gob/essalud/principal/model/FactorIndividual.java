package pe.gob.essalud.principal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TFACINDS")
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactorIndividual extends Auditoria {

	@Id
	@Column(name = "cfacind")
	private String cfacind;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	@Column(name = "dfacind")
	private String dfacind;

	@OneToMany(mappedBy = "tfacind", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<FactorComplementario> tfaccoms;

	@ManyToOne
	@JoinColumn(name = "CFACCON", nullable = false, foreignKey = @ForeignKey(name = "FK_individual_contribuyente"))
	private FactorContribuyente tfaccon;

	@OneToMany(mappedBy = "tfacind", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Factor> tfactores;

}