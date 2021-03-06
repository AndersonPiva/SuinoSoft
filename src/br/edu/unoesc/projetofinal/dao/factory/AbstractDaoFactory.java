package br.edu.unoesc.projetofinal.dao.factory;

import br.edu.unoesc.projetofinal.dao.AbortoDAO;
import br.edu.unoesc.projetofinal.dao.AcessoDAO;
import br.edu.unoesc.projetofinal.dao.CausaDAO;
import br.edu.unoesc.projetofinal.dao.CoberturaDAO;
import br.edu.unoesc.projetofinal.dao.CompraMedicamentoDAO;
import br.edu.unoesc.projetofinal.dao.CompraRacaoDAO;
import br.edu.unoesc.projetofinal.dao.CompradorDAO;
import br.edu.unoesc.projetofinal.dao.DescarteMachoDAO;
import br.edu.unoesc.projetofinal.dao.DescarteMatrizDAO;
import br.edu.unoesc.projetofinal.dao.DesmameDAO;
import br.edu.unoesc.projetofinal.dao.EnderecoDAO;
import br.edu.unoesc.projetofinal.dao.FornecedorDAO;
import br.edu.unoesc.projetofinal.dao.FuncionarioDAO;
import br.edu.unoesc.projetofinal.dao.GranjaDAO;
import br.edu.unoesc.projetofinal.dao.LactacaoDAO;
import br.edu.unoesc.projetofinal.dao.LoteDAO;
import br.edu.unoesc.projetofinal.dao.MachoDAO;
import br.edu.unoesc.projetofinal.dao.MatrizDAO;
import br.edu.unoesc.projetofinal.dao.MontaMachoDao;
import br.edu.unoesc.projetofinal.dao.MontaSemenDAO;
import br.edu.unoesc.projetofinal.dao.MorteLeitaoCrecheDAO;
import br.edu.unoesc.projetofinal.dao.MorteMachoDAO;
import br.edu.unoesc.projetofinal.dao.MorteMaternidadeDAO;
import br.edu.unoesc.projetofinal.dao.MorteMatrizDAO;
import br.edu.unoesc.projetofinal.dao.MovimentacaoDeLeitaoDAO;
import br.edu.unoesc.projetofinal.dao.NotaCompraDAO;
import br.edu.unoesc.projetofinal.dao.NotaVendaDAO;
import br.edu.unoesc.projetofinal.dao.OutrasSaidasDAO;
import br.edu.unoesc.projetofinal.dao.PartoDAO;
import br.edu.unoesc.projetofinal.dao.ProprietarioDAO;
import br.edu.unoesc.projetofinal.dao.RacaDAO;
import br.edu.unoesc.projetofinal.dao.RacaoDAO;
import br.edu.unoesc.projetofinal.dao.RepeticaoCioDAO;
import br.edu.unoesc.projetofinal.dao.SaidaRacaoDAO;
import br.edu.unoesc.projetofinal.dao.SemenDAO;
import br.edu.unoesc.projetofinal.dao.TarefaDAO;
import br.edu.unoesc.projetofinal.dao.TransferenciaEntreLoteDAO;
import br.edu.unoesc.projetofinal.dao.UsuarioDAO;
import br.edu.unoesc.projetofinal.dao.VacinaDAO;
import br.edu.unoesc.projetofinal.dao.VacinacaoMachoDAO;
import br.edu.unoesc.projetofinal.dao.VacinacaoMatrizDAO;
import br.edu.unoesc.projetofinal.dao.VendaLeitaoDAO;
import br.edu.unoesc.projetofinal.dao.VendaMachoDAO;
import br.edu.unoesc.projetofinal.dao.VendaMatrizDAO;

public interface AbstractDaoFactory {
	MontaMachoDao montaMachoDao();
	MontaSemenDAO montaSemenDao();
	AbortoDAO abortoDao();
	AcessoDAO acessoDao();
	CausaDAO causaDao();
	CoberturaDAO coberturaDao();
	CompraMedicamentoDAO compraMedicamentodao();
	CompraRacaoDAO compraRacaoDao();
	DescarteMatrizDAO descarteMatrizDao();
	DescarteMachoDAO descarteMachoDao();
	DesmameDAO desmamedao();
	EnderecoDAO enderecodao();
	FornecedorDAO fornecedordao();
	FuncionarioDAO funcionariodao();
	GranjaDAO granjadao();
	LactacaoDAO lactacaodao();
	LoteDAO lotedao();
	MachoDAO machodao();
	MatrizDAO matrizdao();
	MorteLeitaoCrecheDAO morteleitaocrechedao();
	MorteMaternidadeDAO mortematernidadedao();
	MorteMachoDAO mortemachodao();
	MorteMatrizDAO mortematrizdao();
	MovimentacaoDeLeitaoDAO movimentacaodeleitao();
	NotaCompraDAO notacompradao();
	NotaVendaDAO notavendadao();
	OutrasSaidasDAO outrassaidasdao();
	PartoDAO partodao();
	ProprietarioDAO proprietariodao();
	RacaDAO racadao();
	RacaoDAO racaodao();
	RepeticaoCioDAO repeticaociodao();
	SaidaRacaoDAO saidaracaodao();
	SemenDAO semendao();
	TransferenciaEntreLoteDAO transferenciaentrelotedao();
	UsuarioDAO usuariodao();
	VacinaDAO vacinadao();
	VendaLeitaoDAO vendaleitaodao();
	VendaMachoDAO vendamachodao();
	VendaMatrizDAO vendamatrizdao();
	VacinacaoMatrizDAO vacinacaomatrizdao();
	VacinacaoMachoDAO vacinacaomachodao();
	TarefaDAO tarefaDao();
	CompradorDAO compradorDao();
}
