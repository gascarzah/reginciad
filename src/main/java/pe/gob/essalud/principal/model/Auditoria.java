package pe.gob.essalud.principal.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class Auditoria {

	private BigDecimal cusucrea;

	private BigDecimal cusumodi;

	private Date fusucrea;

	private Date fusumodi;
}
