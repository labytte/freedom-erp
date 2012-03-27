/**
 * @version 10/06/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.pdv <BR>
 * Classe:
 * @(#)FreedomPDV.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Tela principal do m�dulo ponto de venda.
 * 
 */

package org.freedom.modulos.pdv;

import org.freedom.componentes.JButtonPad;
import org.freedom.funcoes.Funcoes;
import org.freedom.modulos.std.FAlmox;
import org.freedom.modulos.std.FBanco;
import org.freedom.modulos.std.FCLFiscal;
import org.freedom.modulos.std.FClasCli;
import org.freedom.modulos.std.FCliente;
import org.freedom.modulos.std.FCpProd;
import org.freedom.modulos.std.FCredCli;
import org.freedom.modulos.std.FGrade;
import org.freedom.modulos.std.FGrupo;
import org.freedom.modulos.std.FManutPreco;
import org.freedom.modulos.std.FMarca;
import org.freedom.modulos.std.FModGrade;
import org.freedom.modulos.std.FMoeda;
import org.freedom.modulos.std.FPlanoPag;
import org.freedom.modulos.std.FProduto;
import org.freedom.modulos.std.FRListaPreco;
import org.freedom.modulos.std.FSimilar;
import org.freedom.modulos.std.FTabPreco;
import org.freedom.modulos.std.FTipoCli;
import org.freedom.modulos.std.FTipoFiscCli;
import org.freedom.modulos.std.FTratTrib;
import org.freedom.modulos.std.FUnidade;
import org.freedom.modulos.std.FVariantes;
import org.freedom.telas.AplicativoPDV;

public class FreedomPDV extends AplicativoPDV {

	protected JButtonPad btVenda = null;

	public FreedomPDV() {

		super( "iconConfiguracao32.gif", "splashPDV.jpg", 1, "Freedom", 3, "Ponto de Venda", null );
		
		addOpcao( -1, TP_OPCAO_MENU, "Arquivo", "", 'A', 100000000, 0, false, null );
			addOpcao( 100000000, TP_OPCAO_MENU, "Tabelas", "", 'T', 100100000, 1, false, null );
				addOpcao( 100100000, TP_OPCAO_MENU, "Cliente", "", 'C', 100101000, 2, false, null );
					addOpcao( 100101000, TP_OPCAO_ITEM, "Tipo de cliente...", "TipoCli", 'T', 100101010, 3, true, FTipoCli.class );
					addOpcao( 100101000, TP_OPCAO_ITEM, "Classifica��o de cliente...", "Classifi��o de Clientes", 'f', 100101020, 3, true, FClasCli.class );
					addOpcao( 100101000, TP_OPCAO_ITEM, "Cliente...", "Clientes", 'C', 100101030, 3, true, FCliente.class );
					addOpcao( 100101000, TP_OPCAO_ITEM, "Tipo fiscal de cliente...", "Tipo Fiscal de Cliente", 'p', 100101040, 3, true, FTipoFiscCli.class );
					addOpcao( 100101000, TP_OPCAO_ITEM, "Cr�dito por cliente...", "Cr�dito por cliente", 'r', 100101050, 3, true, FCredCli.class );		
				addSeparador( 100100000 );
				addOpcao( 100100000, TP_OPCAO_ITEM, "Moeda", "Moeda", 'M', 100102000, 2, true, FMoeda.class );
				addOpcao( 100100000, TP_OPCAO_ITEM, "Banco", "Banco", 'B', 100103000, 2, true, FBanco.class );
				addOpcao( 100100000, TP_OPCAO_ITEM, "Plano de pagamento", "PlanoPag", 's', 100115000, 2, true, FPlanoPag.class );		
				addSeparador( 100100000 );
				addOpcao( 100100000, TP_OPCAO_MENU, "Produto", "", 'u', 100104000, 2, false, null );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Tratamento tribut�rio", "Tratamento Tribut�rio", 't', 100104010, 3, true, FTratTrib.class );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Classifica��o fiscal", "Classifica��es", 'l', 100104020, 3, true, FCLFiscal.class );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Almoxarifado", "Almoxarifado", 'x', 100104030, 3, true, FAlmox.class );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Grupo", "Grupos", 'r', 100104040, 3, true, FGrupo.class );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Marca", "Marcas", 'c', 100104050, 3, true, FMarca.class );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Unidade", "Unidades", 'U', 100104060, 3, true, FUnidade.class );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Produto", "Produtos", 'P', 100104070, 3, true, FProduto.class );
					addSeparador( 100104000 );
					addOpcao( 100104000, TP_OPCAO_ITEM, "Similaridade", "Similar", 'S', 100104080, 3, true, FSimilar.class );
					addOpcao( 100104000, TP_OPCAO_MENU, "Grade de produtos", "", 'G', 100104090, 3, false, null );
						addOpcao( 100104090, TP_OPCAO_ITEM, "Variantes", "Variantes", 'V', 100104091, 4, true, FVariantes.class );
						addOpcao( 100104090, TP_OPCAO_ITEM, "Modelo", "Modelo de Grade", 'M', 100104092, 4, true, FModGrade.class );
						addOpcao( 100104090, TP_OPCAO_ITEM, "Grade", "Grade", 'r', 100104093, 4, true, FGrade.class );
				addSeparador( 100100000 );
				addOpcao( 100100000, TP_OPCAO_MENU, "Pre�o", "", '�', 100105000, 2, false, null );
					addOpcao( 100105000, TP_OPCAO_ITEM, "Manuten��o de Pre�os", "Manuten��o de Pre�os", 'M', 100105010, 3, true, FManutPreco.class );
					addOpcao( 100105000, TP_OPCAO_ITEM, "Copia pre�o", "Copia Precos", 'i', 100105020, 3, true, FCpProd.class );
					addOpcao( 100105000, TP_OPCAO_ITEM, "Tabela de pre�o", "Tabelas de Pre�os", 'a', 100105030, 3, true, FTabPreco.class );
					addOpcao( 100105000, TP_OPCAO_ITEM, "Lista de pre�o", "Lista de Pre�os", 'l', 100105040, 3, true, FRListaPreco.class );
	
			addOpcao( 100000000, TP_OPCAO_MENU, "Prefer�ncias", "", 'P', 100200000, 1, false, null );
				addOpcao( 100200000, TP_OPCAO_ITEM, "Prefer�ncias gerais", "Prefere Geral", 'g', 100201000, 2, true, FPreferePDV.class );
				addOpcao( 100200000, TP_OPCAO_ITEM, "Fun��es Administrativas TEF", "Admin TEF", 'A', 100202000, 2, true, FAdmTef.class );

		addOpcao( -1, TP_OPCAO_MENU, "PDV", "", 'P', 200000000, 1, false, null );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Venda", "Venda", 'V', 200100000, 2, true, FVenda.class );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Cancela venda", "Cancela Venda", 'C', 200200000, 2, true, DLCancCupom.class );
			addSeparador( 200000000 );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Suprimento", "Suprimento de caixa", 'S', 200300000, 2, true, FSuprimento.class );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Sangria", "Sangria", 'G', 200400000, 2, true, FSangria.class );
			addSeparador( 200000000 );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Aliquota", "Inserir Aliquota", 'Q', 200500000, 2, true, FAliquota.class );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Ajusta moeda", "Grava Moeda", 'J', 200600000, 2, true, FGravaMoeda.class );
			addSeparador( 200000000 );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Ler mem�ria fiscal", "Le Fiscal", 'L', 200700000, 2, true, FLeFiscal.class );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Leitura X", "Impress�o de leitura X", 'i', 110800000, 2, true, FLeituraX.class );
			addSeparador( 200000000 );
			addOpcao( 200000000, TP_OPCAO_ITEM, "Fechamento de Caixa", "Efetua um fechamento de caixa", 'f', 110800001, 2, true, DLFechaDia.class );

		btVenda = addBotao( "barraVenda.gif", "Venda", "Venda", 200100000, FVenda.class );
		addBotao( "btExcluir.gif", "Cancela venda", "Cancela Venda", 200200000, DLCancCupom.class );
		addBotao( "barraFornecedor.gif", "Suprimento", "Suprimento de caixa", 200300000, FSuprimento.class );
		addBotao( "btPdvSangria.gif", "Sangria", "Sangria", 200400000, FSangria.class );
		addBotao( "btPdvAliquota.gif", "Aliquota", "Inserir Aliquota", 200500000, FAliquota.class );
		addBotao( "btPdvGravaMoeda.gif", "Ajusta moeda", "Grava Moeda", 200600000, FGravaMoeda.class );
		addBotao( "btPdvLeituraXPq.gif", "Ler mem�ria fiscal", "Le Fiscal", 200700000, FLeFiscal.class );

		ajustaMenu();
		sNomeModulo = "Ponto de Venda";
		sMailSuporte = "suporte@stpinf.com";
		sNomeSis = "Freedom";
		sEmpSis = "Setpoint Inform�tica Ltda.";
		vEquipeSis.add( "Robson Sanchez - Supervis�o / Analise" );
		vEquipeSis.add( "Anderson Sanchez - Supervis�o / Programa��o" );
		vEquipeSis.add( "Alex Rodrigues - Programa��o" );
		vEquipeSis.add( "Alexandre Marcondes - Programa��o" );
		vEquipeSis.add( "Fernando Oliveira - Programa��o" );
		vEquipeSis.add( "Moyzes Braz - Arte gr�fica" );
		vEquipeSis.add( "Reginaldo Garcia - Testes / Suporte" );

	}

	public static void main( String sParams[] ) {

		try {
			AplicativoPDV.setLookAndFeel( "freedom.ini" );
			FreedomPDV freedom = new FreedomPDV();
			freedom.show();
			freedom.btVenda.doClick();
			
			/* Valida��o transferida para a abertura da tela de venda.
			int result = FreedomPDV.abreCaixa( freedom.con );

			if ( result == -1 ) {
				FreedomPDV.killProg( 5, "Caixa n�o foi aberto. A aplica��o ser� fechada!" );
			}
			else if ( result == 0 || result == 1 ) {
				freedom.btVenda.doClick();
			}
			*/
		} catch ( Throwable e ) {
			Funcoes.criaTelaErro( "Erro de execu��o\n\n" + e.getMessage() );
			e.printStackTrace();
		}
	}
}