package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TFACTORES")
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factor extends Auditoria {

	@EmbeddedId
	private FactorPK id;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@ManyToOne
	@JoinColumn(name = "CCOMP", insertable=false, updatable=false, nullable = false, foreignKey = @ForeignKey(name = "FK_comple"))
	private FactorComplementario tfaccom;

	@ManyToOne
	@JoinColumn(name = "CFACCON",insertable=false, updatable=false, nullable = false, foreignKey = @ForeignKey(name = "FK_faccontr"))
	private FactorContribuyente tfaccon;

	@ManyToOne
	@JoinColumn(name = "CFACIND",insertable=false, updatable=false, nullable = false, foreignKey = @ForeignKey(name = "FK_individual"))
	private FactorIndividual tfacind;

	@ManyToOne
	@JoinColumn(name = "CFICHA",insertable=false, updatable=false, nullable = false, foreignKey = @ForeignKey(name = "FK_fichafactor"))
	private Ficha tficha;

}