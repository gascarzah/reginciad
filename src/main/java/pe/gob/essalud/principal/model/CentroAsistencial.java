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
@Table(name = "CMCAS10")
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CentroAsistencial extends Auditoria {

	@Id
	@Column(name = "ccas")
	private String ccas;
	@Column(name = "bcasestareg")
	private String bcasestareg;
	@Column(name = "ccasori")
	private String ccasori;
	@Column(name = "cunocod")
	private String cunocod;

	@Column(name = "dcas")
	private String dcas;
	@Column(name = "dcascor")
	private String dcascor;
	@Column(name = "dcasdir")
	private String dcasdir;

	@ManyToOne
	@JoinColumn(name = "CRAS", nullable = false, foreignKey = @ForeignKey(name = "FK_red_cas"))
	private RedAsistencial dmras10;

	@OneToMany(mappedBy = "dmcas10", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Ficha> tfichas;

}