package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "TEVENTOSADVERSOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoAdverso extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cea")
	private long cea;
	@Column(name = "bestadoreg")
	private String bestadoreg;

	@Column(name = "dea")
	private String dea;

	@ManyToOne
	@JoinColumn(name = "CGEA", nullable = false, foreignKey = @ForeignKey(name = "FK_grupo_evento"))
	private GrupoEventoAdverso tgrupoeventosadverso;

}