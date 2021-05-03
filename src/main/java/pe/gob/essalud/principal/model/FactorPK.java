package pe.gob.essalud.principal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The primary key class for the TFACTORES database table.
 * 
 */
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FactorPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long cficha;

	@Column(insertable=false, updatable=false)
	private String cfaccon;

	@Column(insertable=false, updatable=false)
	private String cfacind;

	@Column(insertable=false, updatable=false)
	private String ccomp;

	
}