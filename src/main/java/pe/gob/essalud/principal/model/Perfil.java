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
@Table(name="TPERFILES")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Perfil extends Auditoria {
	@Id
	@Column(name = "cperfil")
	private String cperfil;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	
	@Column(name = "dperfil")
	private String dperfil;

	@OneToMany(mappedBy="tperfile", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Usuario> tusuarios;

}