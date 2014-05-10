package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * SgestacaoimpId generated by hbm2java
 */
public class SgestacaoimpId implements java.io.Serializable {

	private int codest;
	private short nroimp;
	private short codfilial;
	private int codemp;

	public SgestacaoimpId() {
	}

	public SgestacaoimpId(int codest, short nroimp, short codfilial, int codemp) {
		this.codest = codest;
		this.nroimp = nroimp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodest() {
		return this.codest;
	}

	public void setCodest(int codest) {
		this.codest = codest;
	}

	public short getNroimp() {
		return this.nroimp;
	}

	public void setNroimp(short nroimp) {
		this.nroimp = nroimp;
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
		if (!(other instanceof SgestacaoimpId))
			return false;
		SgestacaoimpId castOther = (SgestacaoimpId) other;

		return (this.getCodest() == castOther.getCodest())
				&& (this.getNroimp() == castOther.getNroimp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodest();
		result = 37 * result + this.getNroimp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
