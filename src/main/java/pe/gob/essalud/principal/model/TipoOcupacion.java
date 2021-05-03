package pe.gob.essalud.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name="TOCUPACION")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class TipoOcupacion extends Auditoria {
	
	@Column(name = "codgrp")
	@Id
	private String codgrp;

	
	@Column(name = "descgrp")
	private String descgrp;
	@Column(name = "estdgrp")
	private String estdgrp;


}