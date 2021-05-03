package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TGRUPOMAIL")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class GrupoMail extends Auditoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idgrupo")
	private long idgrupo;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	@Column(name = "csea")
	private String csea;
	@Column(name = "ctea")
	private String ctea;
	@Column(name = "dgrupo")
	private String dgrupo;
	@Column(name = "dmail")
	private String dmail;

}