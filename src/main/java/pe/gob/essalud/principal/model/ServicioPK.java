package pe.gob.essalud.principal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The primary key class for the DMARE10 database table.
 * 
 */
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicioPK implements Serializable {

	private static final long serialVersionUID = 2126520724841582645L;
	@Column(name = "enlarehoscod")
	private String enlarehoscod;
	@Column(name = "enlservhoscod")
	private String enlservhoscod;

}