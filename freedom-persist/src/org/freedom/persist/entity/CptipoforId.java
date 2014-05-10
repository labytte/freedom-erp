package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * CptipoforId generated by hbm2java
 */
public class CptipoforId implements java.io.Serializable {

	private int codtipofor;
	private short codfilial;
	private int codemp;

	public CptipoforId() {
	}

	public CptipoforId(int codtipofor, short codfilial, int codemp) {
		this.codtipofor = codtipofor;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtipofor() {
		return this.codtipofor;
	}

	public void setCodtipofor(int codtipofor) {
		this.codtipofor = codtipofor;
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
		if (!(other instanceof CptipoforId))
			return false;
		CptipoforId castOther = (CptipoforId) other;

		return (this.getCodtipofor() == castOther.getCodtipofor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipofor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
