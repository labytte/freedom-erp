package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pvcaixa generated by hbm2java
 */
public class Pvcaixa implements java.io.Serializable {

	private PvcaixaId id;
	private Sgestacao sgestacao;
	private String desccaixa;
	private Integer seqini;
	private Integer seqmax;
	private char ecfcaixa;
	private Character tefcaixa;
	private char orccaixa;
	private char mododemo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqprodacessos = new HashSet(0);
	private Pvsequencia pvsequencia;
	private Set vdvendas = new HashSet(0);
	private Set sglogs = new HashSet(0);
	private Set pvcaixaimps = new HashSet(0);

	public Pvcaixa() {
	}

	public Pvcaixa(PvcaixaId id, Sgestacao sgestacao, String desccaixa,
			char ecfcaixa, char orccaixa, char mododemo, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgestacao = sgestacao;
		this.desccaixa = desccaixa;
		this.ecfcaixa = ecfcaixa;
		this.orccaixa = orccaixa;
		this.mododemo = mododemo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pvcaixa(PvcaixaId id, Sgestacao sgestacao, String desccaixa,
			Integer seqini, Integer seqmax, char ecfcaixa, Character tefcaixa,
			char orccaixa, char mododemo, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqprodacessos, Pvsequencia pvsequencia, Set vdvendas,
			Set sglogs, Set pvcaixaimps) {
		this.id = id;
		this.sgestacao = sgestacao;
		this.desccaixa = desccaixa;
		this.seqini = seqini;
		this.seqmax = seqmax;
		this.ecfcaixa = ecfcaixa;
		this.tefcaixa = tefcaixa;
		this.orccaixa = orccaixa;
		this.mododemo = mododemo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqprodacessos = eqprodacessos;
		this.pvsequencia = pvsequencia;
		this.vdvendas = vdvendas;
		this.sglogs = sglogs;
		this.pvcaixaimps = pvcaixaimps;
	}

	public PvcaixaId getId() {
		return this.id;
	}

	public void setId(PvcaixaId id) {
		this.id = id;
	}

	public Sgestacao getSgestacao() {
		return this.sgestacao;
	}

	public void setSgestacao(Sgestacao sgestacao) {
		this.sgestacao = sgestacao;
	}

	public String getDesccaixa() {
		return this.desccaixa;
	}

	public void setDesccaixa(String desccaixa) {
		this.desccaixa = desccaixa;
	}

	public Integer getSeqini() {
		return this.seqini;
	}

	public void setSeqini(Integer seqini) {
		this.seqini = seqini;
	}

	public Integer getSeqmax() {
		return this.seqmax;
	}

	public void setSeqmax(Integer seqmax) {
		this.seqmax = seqmax;
	}

	public char getEcfcaixa() {
		return this.ecfcaixa;
	}

	public void setEcfcaixa(char ecfcaixa) {
		this.ecfcaixa = ecfcaixa;
	}

	public Character getTefcaixa() {
		return this.tefcaixa;
	}

	public void setTefcaixa(Character tefcaixa) {
		this.tefcaixa = tefcaixa;
	}

	public char getOrccaixa() {
		return this.orccaixa;
	}

	public void setOrccaixa(char orccaixa) {
		this.orccaixa = orccaixa;
	}

	public char getMododemo() {
		return this.mododemo;
	}

	public void setMododemo(char mododemo) {
		this.mododemo = mododemo;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getEqprodacessos() {
		return this.eqprodacessos;
	}

	public void setEqprodacessos(Set eqprodacessos) {
		this.eqprodacessos = eqprodacessos;
	}

	public Pvsequencia getPvsequencia() {
		return this.pvsequencia;
	}

	public void setPvsequencia(Pvsequencia pvsequencia) {
		this.pvsequencia = pvsequencia;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getSglogs() {
		return this.sglogs;
	}

	public void setSglogs(Set sglogs) {
		this.sglogs = sglogs;
	}

	public Set getPvcaixaimps() {
		return this.pvcaixaimps;
	}

	public void setPvcaixaimps(Set pvcaixaimps) {
		this.pvcaixaimps = pvcaixaimps;
	}

}
