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
@EqualsAndHashCode(callSuper = true)
@Table(name = "TFACCOMS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactorComplementario extends Auditoria {

	@Id
	@Column(name = "ccomp")
	private String ccomp;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "dcomp")
	private String dcomp;

	@ManyToOne
	@JoinColumn(name = "CFACIND", nullable = false, foreignKey = @ForeignKey(name = "FK_componente_individual"))
	private FactorIndividual tfacind;

	@OneToMany(mappedBy = "tfaccom", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Factor> tfactores;

}