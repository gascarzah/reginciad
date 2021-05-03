package pe.gob.essalud.principal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "TEATIPOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoEventoAdverso extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ctea")
	private long ctea;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "dtea")
	private String dtea;

	@OneToMany(mappedBy = "teatipo", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<TipoSeveridad> teaseveridades;

	@OneToMany(mappedBy = "teatipo", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Ficha> tfichas;

}