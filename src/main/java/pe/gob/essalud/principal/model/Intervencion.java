package pe.gob.essalud.principal.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TINTERVENCIONES")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Intervencion extends Auditoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cintervencion")
	private long cintervencion;
	@Column(name = "bestadoreg")
	private String bestadoreg;
	@Column(name = "bverificacion")
	private String bverificacion;
	@Column(name = "cficha")
	private BigDecimal cficha;
	@Column(name = "dcausa")
	private String dcausa;
	@Column(name = "dhacer")
	private String dhacer;
	@Column(name = "dquien")
	private String dquien;
	@Column(name = "fintervencion")
	@Temporal(TemporalType.DATE)
	private Date fintervencion;
	@Column(name = "fverificacion")

	private Date fverificacion;

}