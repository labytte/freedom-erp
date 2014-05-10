package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * CptabforId generated by hbm2java
 */
public class CptabforId implements java.io.Serializable {

	private String refprodtfor;
	private int codfor;
	private short codfilial;
	private int codemp;

	public CptabforId() {
	}

	public CptabforId(String refprodtfor, int codfor, short codfilial,
			int codemp) {
		this.refprodtfor = refprodtfor;
		this.codfor = codfor;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getRefprodtfor() {
		return this.refprodtfor;
	}

	public void setRefprodtfor(String refprodtfor) {
		this.refprodtfor = refprodtfor;
	}

	public int getCodfor() {
		return this.codfor;
	}

	public void setCodfor(int codfor) {
		this.codfor = codfor;
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
		if (!(other instanceof CptabforId))
			return false;
		CptabforId castOther = (CptabforId) other;

		return ((this.getRefprodtfor() == castOther.getRefprodtfor()) || (this
				.getRefprodtfor() != null && castOther.getRefprodtfor() != null && this
				.getRefprodtfor().equals(castOther.getRefprodtfor())))
				&& (this.getCodfor() == castOther.getCodfor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRefprodtfor() == null ? 0 : this.getRefprodtfor()
						.hashCode());
		result = 37 * result + this.getCodfor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
