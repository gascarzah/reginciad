package pe.gob.essalud.principal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "TEASEVERIDADES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoSeveridad extends Auditoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "csea")
	private long csea;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "dsea")
	private String dsea;

	
	@ManyToOne
	@JoinColumn(name = "CTEA", nullable = false, foreignKey = @ForeignKey(name = "FK_tipo_evento"))
	private TipoEventoAdverso teatipo;


	@OneToMany(mappedBy = "teaseveridade", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Ficha> tfichas;

}