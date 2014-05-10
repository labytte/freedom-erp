package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * LftrattribId generated by hbm2java
 */
public class LftrattribId implements java.io.Serializable {

	private String codtrattrib;
	private short codfilial;
	private int codemp;

	public LftrattribId() {
	}

	public LftrattribId(String codtrattrib, short codfilial, int codemp) {
		this.codtrattrib = codtrattrib;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodtrattrib() {
		return this.codtrattrib;
	}

	public void setCodtrattrib(String codtrattrib) {
		this.codtrattrib = codtrattrib;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LftrattribId))
			return false;
		LftrattribId castOther = (LftrattribId) other;

		return ((this.getCodtrattrib() == castOther.getCodtrattrib()) || (this
				.getCodtrattrib() != null && castOther.getCodtrattrib() != null && this
				.getCodtrattrib().equals(castOther.getCodtrattrib())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodtrattrib() == null ? 0 : this.getCodtrattrib()
						.hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
