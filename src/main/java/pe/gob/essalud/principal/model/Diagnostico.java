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
@Table(name = "CMDIA10")
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Diagnostico extends Auditoria {

	@Id
	private String diagcod;

	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "diagdes")
	private String diagdes;

	@OneToMany(mappedBy = "cmdia10", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Ficha> tfichas;

}