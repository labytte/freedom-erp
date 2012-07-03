/**
 * @version 25/09/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.tmk <BR>
 * Classe: @(#)FSuporte.java <BR>
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
 * Coment�rios sobre a classe...
 * 
 */

package org.freedom.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.JarURLConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import org.freedom.componentes.JLabelPad;
import javax.swing.JOptionPane;
import org.freedom.componentes.JPanelPad;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;

import org.freedom.acao.Processo;
import org.freedom.bmps.Icone;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ProcessoSec;
import org.freedom.funcoes.Funcoes;
import org.freedom.modulos.tmk.FPrefere;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FPrincipal;

/**
 * @author robson
 * 
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class FSuporte extends FFDialogo implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtArqMen = new JTextFieldPad(JTextFieldPad.TP_STRING,30,0);
	private JTextFieldPad txtAssunto = new JTextFieldPad(JTextFieldPad.TP_STRING,40,0);
//	private JTextFieldPad txtEmail = new JTextFieldPad(JTextFieldPad.TP_STRING,60,0);
	private JTextFieldPad txtDe = new JTextFieldPad(JTextFieldPad.TP_STRING,40,0);
	private JButton btBuscaArq = new JButton(Icone.novo("btAbrirPeq.gif"));
	private JButton btEnviar = new JButton(Icone.novo("btEnviarMail.gif"));
	private JTextAreaPad txaMen = new JTextAreaPad();
	private JScrollPane spnMen = new JScrollPane(txaMen);
//	private JPanelPad pinGeral = new JPanelPad(0, 135);
	private JPanelPad pinArq = new JPanelPad(0, 50);
	private JPanelPad pinRod = new JPanelPad(0, 0);
	private JPanelPad pnCenter = new JPanelPad(JPanelPad.TP_JPANEL,	new BorderLayout());
	private JProgressBar pbAnd = new JProgressBar();
	private JLabelPad lbStatus = new JLabelPad("Pronto.");
	String sSMTP = null;
	String sUser = null;
	String sPass = null;
	File fArq = null;
	boolean bEnvia = false;

	public FSuporte() {
		setTitulo("Envio de pedido de suporte");
		setAtribos(100, 100, 375, 430);
		pnBordRodape.setVisible(false);
		lbStatus.setPreferredSize(new Dimension(0, 20));
		lbStatus.setForeground(Color.BLUE);
		pinRod.tiraBorda();

		txaMen.setVlrString("Descreva aqui seu problema, d�vida ou sugest�o...");
		Vector<String> vVals = new Vector<String>();
		vVals.add("A");
		vVals.add("C");
		Vector<String> vLabs = new Vector<String>();
		vLabs.add("Arquivo no anexo.");
		vLabs.add("Arquivo no corpo.");

		lbStatus.setBorder(BorderFactory.createEtchedBorder());
		
		c.setLayout(new BorderLayout());
//		c.add(pinGeral, BorderLayout.NORTH);
		c.add(pnCenter, BorderLayout.CENTER);
		c.add(pinRod, BorderLayout.SOUTH);

		adicBotaoSair().add(pinRod, BorderLayout.CENTER);

		pnCenter.add(pinArq, BorderLayout.NORTH);
		pnCenter.add(spnMen, BorderLayout.CENTER);
		pnCenter.add(lbStatus, BorderLayout.SOUTH);

		txtAssunto.setVlrString("Pedido de suporte - "+Aplicativo.sNomeFilial.trim()+" - "+Aplicativo.strUsuario);
		pinArq.adic(new JLabelPad("Anexe um arquivo, caso necess�rio."), 7, 0, 250, 20);
		pinArq.adic(txtArqMen, 7, 20, 313, 20);
		pinArq.adic(btBuscaArq, 320, 20, 20, 20);

		pinRod.adic(btEnviar, 7, 0, 30, 30);
		pinRod.adic(pbAnd, 45, 5, 205, 20);

		pbAnd.setStringPainted(true);
		pbAnd.setMinimum(0);

		btBuscaArq.addActionListener(this);
		btEnviar.addActionListener(this);
	}
	public void setMensagem(String sMensagem){
		txaMen.setVlrString(sMensagem);
	}
	private String buscaEmailFilial(){
	    String sRet = "";
	    ResultSet rs = null;
	    PreparedStatement ps = null;
	    String sSQL = "SELECT EMAILFILIAL FROM SGFILIAL FL WHERE CODEMP=? AND CODFILIAL=?";
	    try {
			ps = con.prepareStatement(sSQL);
			ps.setInt(1, Aplicativo.iCodEmp);
			ps.setInt(2, Aplicativo.iCodFilial);
			rs = ps.executeQuery();			
		    while(rs.next()){
		        sRet = rs.getString(1);
		    }
	    }
	    catch(SQLException e){
	        e.printStackTrace();
	    }
	    
	    return sRet;
	}
	private String buscaArq() {
		String sRetorno = "";
		JFileChooser fcImagem = new JFileChooser();
		if (fcImagem.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			sRetorno = fcImagem.getSelectedFile().getPath();
		}
		return sRetorno;
	}

	private void abrePrefere() {
		if (cPai instanceof FPrincipal)
			if (!((FPrincipal) cPai).temTela("Pref. Gerais")) {
				FPrefere tela = new FPrefere();
				((FPrincipal) cPai).criatela("Pref. Gerais", tela, con);
			}
	}

	private boolean verifSmtp() {
		boolean bRet = false;
		String sSQL = "SELECT SMTPMAIL,USERMAIL,PASSMAIL FROM SGPREFERE3 WHERE CODEMP=? AND CODFILIAL=?";
		try {
			PreparedStatement ps = con.prepareStatement(sSQL);
			ps.setInt(1, Aplicativo.iCodEmp);
			ps.setInt(2, Aplicativo.iCodFilial);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				sSMTP = rs.getString("SMTPMail") != null ? rs.getString(
						"SMTPMail").trim() : null;
				sUser = rs.getString("UserMail") != null ? rs.getString(
						"UserMail").trim() : null;
				sPass = rs.getString("PassMail") != null ? rs.getString(
						"PassMail").trim() : null;
			}
			if (sSMTP == null) {
				if (Funcoes
						.mensagemConfirma(this,
								"N�o foi cadastrado o servidor de SMTP, gostaria de cadastrar agora?") == JOptionPane.YES_OPTION)
					abrePrefere();
			} else
				bRet = true;
		} catch (SQLException err) {
			Funcoes.mensagemErro(this,
					"Erro ao buscar o as informa��es de SMTP!\n"
							+ err.getMessage());
			err.printStackTrace();
		}
		return bRet;
	}

	private boolean verifCab() {
		boolean bRet = false;
/*		if (txtEmail == null) {
			Funcoes.mensagemInforma(this,
					"N�o foi preenchido o campo 'E-Mail:'!");
		}
*/
		if (txtDe == null) {
			Funcoes.mensagemInforma(this, "N�o foi preenchido o campo 'De:'!");
		} else if (txtAssunto == null) {
			Funcoes.mensagemInforma(this,
					"N�o foi preenchido o campo 'Assunto:'!");
		} else
			bRet = true;
		return bRet;
	}

	private boolean verifCorpo() {
		boolean bRet = false;
		if (txaMen.getVlrString().equals("")
				&& txtArqMen.getVlrString().equals(""))
			Funcoes.mensagemInforma(this, "Nada a ser enviado!");
		else
			bRet = true;
		return bRet;
	}

	private void enviar() {
		int iConta = 0;
		if (!verifSmtp())
			return;
		else if (!verifCab())
			return;
		else if (!verifCorpo())
			return;
		Properties pp = new Properties();
		pp.put("mail.smtp.host", sSMTP);
		Session se = Session.getDefaultInstance(pp);

		pbAnd.setMaximum(1);
		pbAnd.setValue(iConta = 0);

		fArq = null;
		if (!txtArqMen.getVlrString().equals("")) {
			fArq = new File(txtArqMen.getVlrString());
			if (!fArq.exists()) {
				Funcoes.mensagemErro(this, "Arquivo n�o foi encotrado!");
				return;
			}
		}

		bEnvia = true;
		String sEmail = Aplicativo.sMailSuporte;
		if (!bEnvia)
			return;
		if (sEmail != null) {
			sEmail = sEmail.trim();
		}
		mandaMail(sEmail, se);
		pbAnd.setValue(++iConta);
	}

	private void mandaMail(String sTo, Session se) {
		state("Preparando envio para: '" + sTo + "'");
		try {
			MimeMessage mes = new MimeMessage(se);
			txtDe.setVlrString(buscaEmailFilial());
			if(txtDe.getVlrString()==null) {
			    new Exception("N�o foi poss�vel enviar mensagem!\nCadestre um email v�lido para a filial.");
			}
			mes.setFrom(new InternetAddress(txtDe.getVlrString()));
			mes.setSubject(txtAssunto.getVlrString());
			mes.setSentDate(new Date());
			try {
				mes.addRecipient(RecipientType.TO, new InternetAddress(sTo,"suporte"));
			}
			catch(UnsupportedEncodingException e){
				e.printStackTrace();
			}
			BodyPart parte = new MimeBodyPart();
			
			String sTextoAdic = "Novo pedido de suporte da empresa:"+Aplicativo.sNomeFilial+"\n"; 
			sTextoAdic += "Usu�rio:"+Aplicativo.strUsuario+"\n";
			sTextoAdic += "Sistema:"+Aplicativo.sNomeSis+"\n";
			sTextoAdic += "M�dulo:"+Aplicativo.sNomeModulo+"\n";
		    try {
			    URL uPath = getClass().getResource("FSuporte.class");
		        JarURLConnection juc = (JarURLConnection)uPath.openConnection();
		        sTextoAdic += "Vers�o:"+Funcoes.dateToStrDataHora(new Date(juc.getJarEntry().getTime()))+"\n";
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
		    sTextoAdic += "\nMensagem:\n"+txaMen.getVlrString();
			parte.setText(sTextoAdic);

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(parte);

			if (fArq != null) {
				parte = new MimeBodyPart(); 
				FileDataSource orig = new FileDataSource(fArq);
				parte.setDataHandler(new DataHandler(orig));
				parte.setFileName(fArq.getName());
				parte.setDisposition(Part.ATTACHMENT);
				multipart.addBodyPart(parte);
			}
			mes.setContent(multipart);
			state("Enviando dados...");
			Transport.send(mes);
			state("Envio OK...");
		} catch (MessagingException err) {
			Funcoes.mensagemErro(this, "Erro ao enviar mensagem para: " + sTo
					+ "\n" + err.getMessage());
			err.getStackTrace();
			state("Aguardando reenvio.");
		}
	}

	public void actionPerformed(ActionEvent evt) {
		String sArq = "";
		if (evt.getSource() == btBuscaArq) {
			sArq = buscaArq();
			if (!sArq.equals("")) {
				txtArqMen.setText(sArq);
			}
		} else if (evt.getSource() == btEnviar) {
			ProcessoSec pSec = new ProcessoSec(500, new Processo() {
				public void run() {
					lbStatus.updateUI();
					pbAnd.updateUI();
				}
			}, new Processo() {
				public void run() {
					enviar();
				}
			});
			pSec.iniciar();
		}
	}

	public void state(String sStatus) {
		lbStatus.setText(sStatus);
	}
}