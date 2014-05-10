package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * SpnatoperId generated by hbm2java
 */
public class SpnatoperId implements java.io.Serializable {

	private String codigo;
	private String cst;

	public SpnatoperId() {
	}

	public SpnatoperId(String codigo, String cst) {
		this.codigo = codigo;
		this.cst = cst;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCst() {
		return this.cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SpnatoperId))
			return false;
		SpnatoperId castOther = (SpnatoperId) other;

		return ((this.getCodigo() == castOther.getCodigo()) || (this
				.getCodigo() != null && castOther.getCodigo() != null && this
				.getCodigo().equals(castOther.getCodigo())))
				&& ((this.getCst() == castOther.getCst()) || (this.getCst() != null
						&& castOther.getCst() != null && this.getCst().equals(
						castOther.getCst())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		result = 37 * result
				+ (getCst() == null ? 0 : this.getCst().hashCode());
		return result;
	}

}
