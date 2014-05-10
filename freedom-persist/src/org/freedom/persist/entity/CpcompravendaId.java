package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * CpcompravendaId generated by hbm2java
 */
public class CpcompravendaId implements java.io.Serializable {

	private int coditcompra;
	private int codcompra;
	private int codfilial;
	private int codemp;

	public CpcompravendaId() {
	}

	public CpcompravendaId(int coditcompra, int codcompra, int codfilial,
			int codemp) {
		this.coditcompra = coditcompra;
		this.codcompra = codcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
	}

	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof CpcompravendaId))
			return false;
		CpcompravendaId castOther = (CpcompravendaId) other;

		return (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
