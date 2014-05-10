package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdtransp generated by hbm2java
 */
public class Vdtransp implements java.io.Serializable {

	private VdtranspId id;
	private Sgfilial sgfilial;
	private Cpforneced cpforneced;
	private Sgunifcod sgunifcod;
	private Sgmunicipio sgmunicipio;
	private Rhcodgps rhcodgps;
	private String raztran;
	private String nometran;
	private String cnpjtran;
	private String cpftran;
	private String insctran;
	private String endtran;
	private Integer numtran;
	private String compltran;
	private String bairtran;
	private String cidtran;
	private String ceptran;
	private String fonetran;
	private String faxtran;
	private String uftran;
	private Character tipotran;
	private String celtran;
	private String conttran;
	private String dddfonetran;
	private String dddfaxtran;
	private String dddceltran;
	private String conjugetran;
	private Integer codempbo;
	private Short codfilialbo;
	private String codbanco;
	private String agenciatran;
	private String numcontatran;
	private String placatran;
	private Short nrodependtran;
	private String rgtran;
	private String ssptran;
	private String nropistran;
	private String obstran;
	private String emailtran;
	private String emailnfetran;
	private String rntctran;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdveiculos = new HashSet(0);
	private Set sgprefere1s = new HashSet(0);
	private Set eqrecmercs = new HashSet(0);
	private Set lffretes = new HashSet(0);
	private Set vdfretevds = new HashSet(0);
	private Set vdromaneios = new HashSet(0);
	private Set vdmotoristas = new HashSet(0);
	private Set eqtipomovs = new HashSet(0);
	private Set vdveiculos_1 = new HashSet(0);
	private Set vdmotoristas_1 = new HashSet(0);
	private Set cpfretecps = new HashSet(0);
	private Set sgprefere8s = new HashSet(0);
	private Set vdorcamentos = new HashSet(0);
	private Set eqexpedicaos = new HashSet(0);
	private Set vdclientes = new HashSet(0);
	private Set cpcompras = new HashSet(0);

	public Vdtransp() {
	}

	public Vdtransp(VdtranspId id, Sgfilial sgfilial, String raztran,
			String nometran, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.raztran = raztran;
		this.nometran = nometran;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdtransp(VdtranspId id, Sgfilial sgfilial, Cpforneced cpforneced,
			Sgunifcod sgunifcod, Sgmunicipio sgmunicipio, Rhcodgps rhcodgps,
			String raztran, String nometran, String cnpjtran, String cpftran,
			String insctran, String endtran, Integer numtran, String compltran,
			String bairtran, String cidtran, String ceptran, String fonetran,
			String faxtran, String uftran, Character tipotran, String celtran,
			String conttran, String dddfonetran, String dddfaxtran,
			String dddceltran, String conjugetran, Integer codempbo,
			Short codfilialbo, String codbanco, String agenciatran,
			String numcontatran, String placatran, Short nrodependtran,
			String rgtran, String ssptran, String nropistran, String obstran,
			String emailtran, String emailnfetran, String rntctran, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdveiculos, Set sgprefere1s, Set eqrecmercs, Set lffretes,
			Set vdfretevds, Set vdromaneios, Set vdmotoristas, Set eqtipomovs,
			Set vdveiculos_1, Set vdmotoristas_1, Set cpfretecps,
			Set sgprefere8s, Set vdorcamentos, Set eqexpedicaos,
			Set vdclientes, Set cpcompras) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.sgunifcod = sgunifcod;
		this.sgmunicipio = sgmunicipio;
		this.rhcodgps = rhcodgps;
		this.raztran = raztran;
		this.nometran = nometran;
		this.cnpjtran = cnpjtran;
		this.cpftran = cpftran;
		this.insctran = insctran;
		this.endtran = endtran;
		this.numtran = numtran;
		this.compltran = compltran;
		this.bairtran = bairtran;
		this.cidtran = cidtran;
		this.ceptran = ceptran;
		this.fonetran = fonetran;
		this.faxtran = faxtran;
		this.uftran = uftran;
		this.tipotran = tipotran;
		this.celtran = celtran;
		this.conttran = conttran;
		this.dddfonetran = dddfonetran;
		this.dddfaxtran = dddfaxtran;
		this.dddceltran = dddceltran;
		this.conjugetran = conjugetran;
		this.codempbo = codempbo;
		this.codfilialbo = codfilialbo;
		this.codbanco = codbanco;
		this.agenciatran = agenciatran;
		this.numcontatran = numcontatran;
		this.placatran = placatran;
		this.nrodependtran = nrodependtran;
		this.rgtran = rgtran;
		this.ssptran = ssptran;
		this.nropistran = nropistran;
		this.obstran = obstran;
		this.emailtran = emailtran;
		this.emailnfetran = emailnfetran;
		this.rntctran = rntctran;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdveiculos = vdveiculos;
		this.sgprefere1s = sgprefere1s;
		this.eqrecmercs = eqrecmercs;
		this.lffretes = lffretes;
		this.vdfretevds = vdfretevds;
		this.vdromaneios = vdromaneios;
		this.vdmotoristas = vdmotoristas;
		this.eqtipomovs = eqtipomovs;
		this.vdveiculos_1 = vdveiculos_1;
		this.vdmotoristas_1 = vdmotoristas_1;
		this.cpfretecps = cpfretecps;
		this.sgprefere8s = sgprefere8s;
		this.vdorcamentos = vdorcamentos;
		this.eqexpedicaos = eqexpedicaos;
		this.vdclientes = vdclientes;
		this.cpcompras = cpcompras;
	}

	public VdtranspId getId() {
		return this.id;
	}

	public void setId(VdtranspId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public Sgunifcod getSgunifcod() {
		return this.sgunifcod;
	}

	public void setSgunifcod(Sgunifcod sgunifcod) {
		this.sgunifcod = sgunifcod;
	}

	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	public Rhcodgps getRhcodgps() {
		return this.rhcodgps;
	}

	public void setRhcodgps(Rhcodgps rhcodgps) {
		this.rhcodgps = rhcodgps;
	}

	public String getRaztran() {
		return this.raztran;
	}

	public void setRaztran(String raztran) {
		this.raztran = raztran;
	}

	public String getNometran() {
		return this.nometran;
	}

	public void setNometran(String nometran) {
		this.nometran = nometran;
	}

	public String getCnpjtran() {
		return this.cnpjtran;
	}

	public void setCnpjtran(String cnpjtran) {
		this.cnpjtran = cnpjtran;
	}

	public String getCpftran() {
		return this.cpftran;
	}

	public void setCpftran(String cpftran) {
		this.cpftran = cpftran;
	}

	public String getInsctran() {
		return this.insctran;
	}

	public void setInsctran(String insctran) {
		this.insctran = insctran;
	}

	public String getEndtran() {
		return this.endtran;
	}

	public void setEndtran(String endtran) {
		this.endtran = endtran;
	}

	public Integer getNumtran() {
		return this.numtran;
	}

	public void setNumtran(Integer numtran) {
		this.numtran = numtran;
	}

	public String getCompltran() {
		return this.compltran;
	}

	public void setCompltran(String compltran) {
		this.compltran = compltran;
	}

	public String getBairtran() {
		return this.bairtran;
	}

	public void setBairtran(String bairtran) {
		this.bairtran = bairtran;
	}

	public String getCidtran() {
		return this.cidtran;
	}

	public void setCidtran(String cidtran) {
		this.cidtran = cidtran;
	}

	public String getCeptran() {
		return this.ceptran;
	}

	public void setCeptran(String ceptran) {
		this.ceptran = ceptran;
	}

	public String getFonetran() {
		return this.fonetran;
	}

	public void setFonetran(String fonetran) {
		this.fonetran = fonetran;
	}

	public String getFaxtran() {
		return this.faxtran;
	}

	public void setFaxtran(String faxtran) {
		this.faxtran = faxtran;
	}

	public String getUftran() {
		return this.uftran;
	}

	public void setUftran(String uftran) {
		this.uftran = uftran;
	}

	public Character getTipotran() {
		return this.tipotran;
	}

	public void setTipotran(Character tipotran) {
		this.tipotran = tipotran;
	}

	public String getCeltran() {
		return this.celtran;
	}

	public void setCeltran(String celtran) {
		this.celtran = celtran;
	}

	public String getConttran() {
		return this.conttran;
	}

	public void setConttran(String conttran) {
		this.conttran = conttran;
	}

	public String getDddfonetran() {
		return this.dddfonetran;
	}

	public void setDddfonetran(String dddfonetran) {
		this.dddfonetran = dddfonetran;
	}

	public String getDddfaxtran() {
		return this.dddfaxtran;
	}

	public void setDddfaxtran(String dddfaxtran) {
		this.dddfaxtran = dddfaxtran;
	}

	public String getDddceltran() {
		return this.dddceltran;
	}

	public void setDddceltran(String dddceltran) {
		this.dddceltran = dddceltran;
	}

	public String getConjugetran() {
		return this.conjugetran;
	}

	public void setConjugetran(String conjugetran) {
		this.conjugetran = conjugetran;
	}

	public Integer getCodempbo() {
		return this.codempbo;
	}

	public void setCodempbo(Integer codempbo) {
		this.codempbo = codempbo;
	}

	public Short getCodfilialbo() {
		return this.codfilialbo;
	}

	public void setCodfilialbo(Short codfilialbo) {
		this.codfilialbo = codfilialbo;
	}

	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	public String getAgenciatran() {
		return this.agenciatran;
	}

	public void setAgenciatran(String agenciatran) {
		this.agenciatran = agenciatran;
	}

	public String getNumcontatran() {
		return this.numcontatran;
	}

	public void setNumcontatran(String numcontatran) {
		this.numcontatran = numcontatran;
	}

	public String getPlacatran() {
		return this.placatran;
	}

	public void setPlacatran(String placatran) {
		this.placatran = placatran;
	}

	public Short getNrodependtran() {
		return this.nrodependtran;
	}

	public void setNrodependtran(Short nrodependtran) {
		this.nrodependtran = nrodependtran;
	}

	public String getRgtran() {
		return this.rgtran;
	}

	public void setRgtran(String rgtran) {
		this.rgtran = rgtran;
	}

	public String getSsptran() {
		return this.ssptran;
	}

	public void setSsptran(String ssptran) {
		this.ssptran = ssptran;
	}

	public String getNropistran() {
		return this.nropistran;
	}

	public void setNropistran(String nropistran) {
		this.nropistran = nropistran;
	}

	public String getObstran() {
		return this.obstran;
	}

	public void setObstran(String obstran) {
		this.obstran = obstran;
	}

	public String getEmailtran() {
		return this.emailtran;
	}

	public void setEmailtran(String emailtran) {
		this.emailtran = emailtran;
	}

	public String getEmailnfetran() {
		return this.emailnfetran;
	}

	public void setEmailnfetran(String emailnfetran) {
		this.emailnfetran = emailnfetran;
	}

	public String getRntctran() {
		return this.rntctran;
	}

	public void setRntctran(String rntctran) {
		this.rntctran = rntctran;
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

	public Set getVdveiculos() {
		return this.vdveiculos;
	}

	public void setVdveiculos(Set vdveiculos) {
		this.vdveiculos = vdveiculos;
	}

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	public Set getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	public Set getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set lffretes) {
		this.lffretes = lffretes;
	}

	public Set getVdfretevds() {
		return this.vdfretevds;
	}

	public void setVdfretevds(Set vdfretevds) {
		this.vdfretevds = vdfretevds;
	}

	public Set getVdromaneios() {
		return this.vdromaneios;
	}

	public void setVdromaneios(Set vdromaneios) {
		this.vdromaneios = vdromaneios;
	}

	public Set getVdmotoristas() {
		return this.vdmotoristas;
	}

	public void setVdmotoristas(Set vdmotoristas) {
		this.vdmotoristas = vdmotoristas;
	}

	public Set getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

	public Set getVdveiculos_1() {
		return this.vdveiculos_1;
	}

	public void setVdveiculos_1(Set vdveiculos_1) {
		this.vdveiculos_1 = vdveiculos_1;
	}

	public Set getVdmotoristas_1() {
		return this.vdmotoristas_1;
	}

	public void setVdmotoristas_1(Set vdmotoristas_1) {
		this.vdmotoristas_1 = vdmotoristas_1;
	}

	public Set getCpfretecps() {
		return this.cpfretecps;
	}

	public void setCpfretecps(Set cpfretecps) {
		this.cpfretecps = cpfretecps;
	}

	public Set getSgprefere8s() {
		return this.sgprefere8s;
	}

	public void setSgprefere8s(Set sgprefere8s) {
		this.sgprefere8s = sgprefere8s;
	}

	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

	public Set getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

}
