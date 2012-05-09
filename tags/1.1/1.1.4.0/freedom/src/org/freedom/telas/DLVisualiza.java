/**
 * @version 05/06/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.telas <BR>
 * Classe: @(#)DLVisualiza.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios da classe.....
 */

package org.freedom.telas;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

import org.freedom.bmps.Icone;
import org.freedom.componentes.ImprimeOS;

public class DLVisualiza extends FFDialogo implements ActionListener, CaretListener {private static final long serialVersionUID = 1L;
	
	private JPanelPad pnCab = new JPanelPad(JPanelPad.TP_JPANEL,new FlowLayout(FlowLayout.CENTER, 0, 0));  
	private JPanelPad pnCli = new JPanelPad(JPanelPad.TP_JPANEL,new GridLayout(1,1));
	private JTextArea txa = new JTextArea();
	private JScrollPane spn = new JScrollPane(txa);
	private JButton btSair = new JButton("Sair",Icone.novo("btSair.gif"));
	private JButton btImp = new JButton("Imprimir",Icone.novo("btImprime.gif"));
	private JButton btProx = new JButton(Icone.novo("btProx.gif"));
	private JButton btAnt = new JButton(Icone.novo("btAnt.gif"));
	private JButton btPrim = new JButton(Icone.novo("btPrim.gif"));
	private JButton btUlt = new JButton(Icone.novo("btUlt.gif"));
	private JLabelPad lbPag = new JLabelPad();
	private JLabelPad lbImp = new JLabelPad("Impressora: "); 
	private JPanelPad pinCab = new JPanelPad(81,45);
	private JButton btMais = new JButton(Icone.novo("btZoomMais.gif"));
	private JButton btMenos = new JButton(Icone.novo("btZoomMenos.gif"));  
	private JPanelPad pinTools = new JPanelPad(81,45);
	private JButton btTxt = new JButton(Icone.novo("btTXT.gif"));
	private JButton btPdf = new JButton(Icone.novo("btPdf.gif"));  
	public  ImprimeOS imp = null;
	public  String strTemp = ""; 
	boolean bVisualiza = false;
	boolean bProcessaPos = true;
	  
	public DLVisualiza(ImprimeOS impOS, JInternalFrame pai) {
		super(pai);
		//Prepara arquivo temp:
		imp = impOS;
		//monta a area de visualiza��o:
		setTitulo("Visualizar Impress�o");
		txa.setFont(new Font("Courier",Font.BOLD,12));
		txa.setEditable(false);      
		pnCli.add(spn);      
		
		Container c = getContentPane();
		c.removeAll(); //Removido todos os componentes da classe mae.
		
		c.add(pnCab,BorderLayout.NORTH);
		btSair.setPreferredSize(new Dimension(80,30));
		pnCab.add(pinCab);
		pinCab.adic(btMais,7,5,30,30);
		pinCab.adic(btMenos,40,5,30,30);
		
		pinTools.adic(btTxt,7,5,30,30);
		pinTools.adic(btPdf,40,5,30,30);
		btTxt.setToolTipText("Exporta para arquivo TXT");
		btPdf.setToolTipText("Exporta para formato PDF");
		pnCab.add(pinTools);
		
		
		c.add(pnCli, BorderLayout.CENTER);
		
		JPanelPad pnRod = new JPanelPad(JPanelPad.TP_JPANEL,new BorderLayout());
		JPanelPad pnFCenter = new JPanelPad(JPanelPad.TP_JPANEL,new FlowLayout(FlowLayout.CENTER,0,0));
		
		JPanelPad pnDir = new JPanelPad(JPanelPad.TP_JPANEL,new GridLayout(1,2));
		pnDir.add(btImp);
		pnDir.add(btSair);
		pnRod.add(pnDir,BorderLayout.EAST);
		pnRod.add(lbImp,BorderLayout.WEST);
		
		JPanelPad pnCenter = new JPanelPad(JPanelPad.TP_JPANEL,new GridLayout(1,5));
		pnFCenter.add(pnCenter);
		
		pnCenter.add(btPrim);
		pnCenter.add(btAnt);
		pnCenter.add(lbPag);
		pnCenter.add(btProx);
		pnCenter.add(btUlt);
		pnRod.add(pnFCenter,BorderLayout.CENTER);
		  
		c.add(pnRod, BorderLayout.SOUTH);
		  
		//Configura os Listeners e Componentes      
		
		lbPag.setHorizontalAlignment(SwingConstants.CENTER);
		btSair.addActionListener(this);
		btImp.addActionListener(this);
		btProx.addActionListener(this);
		btAnt.addActionListener(this);
		btPrim.addActionListener(this);
		btUlt.addActionListener(this);
		btPdf.addActionListener(this);
		btTxt.addActionListener(this);
		btMais.addActionListener(this);
		btMenos.addActionListener(this);
		txa.addCaretListener(this);
		txa.setText(imp.lePagina(1));
		upContaPag(imp.getPagAtual(),imp.getNumPags());
	
	}
	  
	public void actionPerformed(ActionEvent evt) {
		String sConteudo = "";
		if (evt.getSource() == btSair)
			dispose();
		else if (evt.getSource() == btImp) 
			imp.print();
		else if (evt.getSource() == btAnt) 
			sConteudo = imp.lePagina(imp.getPagAtual()-1);
		else if (evt.getSource() == btProx)
			sConteudo = imp.lePagina(imp.getPagAtual()+1);
		else if (evt.getSource() == btPrim)
			sConteudo = imp.lePagina(1);
		else if (evt.getSource() == btUlt)
			sConteudo = imp.lePagina(imp.getNumPags());
		else if (evt.getSource() == btTxt)
			imp.exportaTXT(this);
		else if (evt.getSource() == btPdf)
			imp.exportaPDF(this);
		else if (evt.getSource() == btMais)
			zoomMais();
		else if (evt.getSource() == btMenos)
			zoomMenos();
		if( sConteudo.trim().length() != 0 ) {
			txa.setText(sConteudo);
			upContaPag(imp.getPagAtual(),imp.getNumPags());
			txa.select(0,1);
		}
	}
	
	public void zoomMais() {
		Font fAtual = txa.getFont();
		txa.setFont(new Font(fAtual.getName(),fAtual.getStyle(),fAtual.getSize()+1));
		txa.updateUI();
	}
	
	public void zoomMenos() {
		Font fAtual = txa.getFont();
		txa.setFont(new Font(fAtual.getName(),fAtual.getStyle(),fAtual.getSize()-1));
		txa.updateUI();
	}
	
	public void upContaPag(int Atual, int Num) {
		lbPag.setText(Atual+" de "+Num);
		lbPag.updateUI();
	}
	
	public void setNomeImp(String sNome) {
		lbImp.setText(" Impressora:  "+sNome);
	}
	
	public void caretUpdate(CaretEvent cevt) {
		int iLinha = 0;
		int iIni = 0;
		int iFim = 0;
		if (cevt.getSource() == txa && bProcessaPos) {
			bProcessaPos = false;
			try {
				iLinha = txa.getLineOfOffset(cevt.getDot());
				iIni = txa.getLineStartOffset(iLinha);
				iFim = txa.getLineEndOffset(iLinha);
				if (iIni+1 != txa.getSelectionStart() && iFim != txa.getSelectionEnd())
					txa.select(iIni+1,iFim);
			} catch(BadLocationException err) { }
			bProcessaPos = true;
		}
	}
}