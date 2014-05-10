package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * SgitfluxoId generated by hbm2java
 */
public class SgitfluxoId implements java.io.Serializable {

	private int codfluxo;
	private short seqitfluxo;
	private short codfilial;
	private int codemp;

	public SgitfluxoId() {
	}

	public SgitfluxoId(int codfluxo, short seqitfluxo, short codfilial,
			int codemp) {
		this.codfluxo = codfluxo;
		this.seqitfluxo = seqitfluxo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodfluxo() {
		return this.codfluxo;
	}

	public void setCodfluxo(int codfluxo) {
		this.codfluxo = codfluxo;
	}

	public short getSeqitfluxo() {
		return this.seqitfluxo;
	}

	public void setSeqitfluxo(short seqitfluxo) {
		this.seqitfluxo = seqitfluxo;
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
		if (!(other instanceof SgitfluxoId))
			return false;
		SgitfluxoId castOther = (SgitfluxoId) other;

		return (this.getCodfluxo() == castOther.getCodfluxo())
				&& (this.getSeqitfluxo() == castOther.getSeqitfluxo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfluxo();
		result = 37 * result + this.getSeqitfluxo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
