package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * VdgruporcId generated by hbm2java
 */
public class VdgruporcId implements java.io.Serializable {

	private int codgo;
	private short codfilial;
	private int codemp;

	public VdgruporcId() {
	}

	public VdgruporcId(int codgo, short codfilial, int codemp) {
		this.codgo = codgo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodgo() {
		return this.codgo;
	}

	public void setCodgo(int codgo) {
		this.codgo = codgo;
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
		if (!(other instanceof VdgruporcId))
			return false;
		VdgruporcId castOther = (VdgruporcId) other;

		return (this.getCodgo() == castOther.getCodgo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodgo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
