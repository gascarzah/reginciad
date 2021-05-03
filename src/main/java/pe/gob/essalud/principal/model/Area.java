package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "AREA")
@NoArgsConstructor
@AllArgsConstructor
public class Area extends Auditoria {
	@Column(name = "enlarehoscod")
	private String enlarehoscod;
	@Column(name = "arehosdes")
	private String arehosdes;
	@Column(name = "bestadoreg")
	private String bestadoreg;


}