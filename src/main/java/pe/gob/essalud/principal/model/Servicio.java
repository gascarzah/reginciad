package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "DMARE10")
@NoArgsConstructor
@AllArgsConstructor
public class Servicio extends Auditoria {
	@EmbeddedId
	private ServicioPK id;
	@Column(name = "arehosdes")
	private String arehosdes;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	@Column(name = "servhosdes")
	private String servhosdes;

}