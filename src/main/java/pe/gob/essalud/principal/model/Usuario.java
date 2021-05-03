package pe.gob.essalud.principal.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TUSUARIOS")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Usuario extends Auditoria {

	@Id
	@Column(name = "cusuario")
	private String cusuario;
	@Column(name = "bconec")
	private String bconec;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	@Column(name = "ccas")
	private String ccas;

	@Column(name = "dapemat")
	private String dapemat;
	@Column(name = "dapepat")
	private String dapepat;
	@Column(name = "dclave")
	private String dclave;
	@Column(name = "dmail")
	private String dmail;
	@Column(name = "dnombres")
	private String dnombres;
	@Column(name = "ncont")
	private BigDecimal ncont;
	@Column(name = "nintentos")
	private BigDecimal nintentos;

	
	@ManyToOne
	@JoinColumn(name="CPERFIL", nullable = false, foreignKey = @ForeignKey(name = "FK_usuario_perfil"))
	private Perfil tperfile;


}