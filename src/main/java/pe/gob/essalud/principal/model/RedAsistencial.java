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
 * The persistent class for the DMRAS10 database table.
 * 
 */
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "CMRAS10")
@NoArgsConstructor
@AllArgsConstructor
public class RedAsistencial extends Auditoria {
	@Id
	private String cras;
	@Column(name = "brasestareg")
	private String brasestareg;
	@Column(name = "cunocod")
	private String cunocod;
	@Column(name = "dras")
	private String dras;
	@Column(name = "drasmed")
	private String drasmed;

	// bi-directional many-to-one association to Dmcas10
	@OneToMany(mappedBy = "dmras10", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<CentroAsistencial> dmcas10s;

}