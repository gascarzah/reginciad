package pe.gob.essalud.principal.model;

import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TFICHAS")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Ficha extends Auditoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cficha")
	private long cficha;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	@Column(name = "bnotifica")
	private String bnotifica;
	@Column(name = "carearep")
	private String carearep;
	@Column(name = "cea")
	private BigDecimal cea;
	@Column(name = "cfichacas")
	private String cfichacas;
	@Column(name = "cgea")
	private BigDecimal cgea;
	@Column(name = "clugarea")
	private String clugarea;
	@Column(name = "codgrp")
	private String codgrp;
	@Column(name = "cserviciorep")
	private String cserviciorep;
	@Column(name = "csexo")
	private String csexo;
	@Column(name = "dapematpac")
	private String dapematpac;
	@Column(name = "dapepatpac")
	private String dapepatpac;
	@Column(name = "dcargorep")
	private String dcargorep;
	@Column(name = "ddescrip")
	private String ddescrip;
	@Column(name = "ddireccion")
	private String ddireccion;
	@Column(name = "dedad")
	private BigDecimal dedad;
	@Column(name = "dhistclini")
	private String dhistclini;
	@Column(name = "dhoraea")
	private String dhoraea;
	@Column(name = "djefearea")
	private String djefearea;
	@Column(name = "dlugarea")
	private String dlugarea;
	@Column(name = "dnompac")
	private String dnompac;
	@Column(name = "dnrocama")
	private String dnrocama;
	@Column(name = "dnrodoc")
	private String dnrodoc;
	@Column(name = "drangoea")
	private String drangoea;
	@Column(name = "droficina")
	private String droficina;
	@Column(name = "dtelefono")
	private String dtelefono;
	@Column(name = "enlarehoscod")
	private String enlarehoscod;
	@Column(name = "enlservhoscod")
	private String enlservhoscod;

	@Temporal(TemporalType.DATE)
	private Date feveadv;

	@Temporal(TemporalType.DATE)
	private Date fnaci;

	@Temporal(TemporalType.DATE)
	private Date fverifica;

	@OneToMany(mappedBy = "tficha", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Factor> tfactores;

	@ManyToOne
	@JoinColumn(name = "DIAGCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_ficha_diagnostico"))
	private Diagnostico cmdia10;

	@ManyToOne
	@JoinColumn(name = "CTIPODOC", nullable = false, foreignKey = @ForeignKey(name = "FK_ficha_tipodoc"))
	private TipoDocumento dbtdi10;

	@ManyToOne
	@JoinColumn(name = "CCAS", nullable = false, foreignKey = @ForeignKey(name = "FK_ficha_cas"))
	private CentroAsistencial dmcas10;

	@ManyToOne
	@JoinColumn(name = "CSEA", nullable = false, foreignKey = @ForeignKey(name = "FK_ficha_severidad"))
	private TipoSeveridad teaseveridade;

	@ManyToOne
	@JoinColumn(name = "CTEA", nullable = false, foreignKey = @ForeignKey(name = "FK_ficha_tipo"))
	private TipoEventoAdverso teatipo;

}