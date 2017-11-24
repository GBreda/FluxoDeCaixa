package controlefinanceiro;
import controlefinanceiro.FluxoDeCaixa;
import javax.swing.JOptionPane;

public class TesteFluxoDeCaixa {
public static void main(String[] args)  {
	try{
	FluxoDeCaixa fc = new FluxoDeCaixa();
	int opcao;
	do{	opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Controle Financeiro \n 0.Sair \n 1. Adicionar Entrada \n 2. Adicionar Saída \n 3. Remover Entrada \n 4. Remover Saída \n 5. Consultar"));
	switch (opcao){
	case 1:
		String nomeEnt = (JOptionPane.showInputDialog(null, "Digite o nome para identicar a entrada"));
        float valorEnt = Float.parseFloat (JOptionPane.showInputDialog(null, "Digite o valor da entrada"));
        String dataEnt = (JOptionPane.showInputDialog(null, "Digite a data da entrada"));
        Dados entrada = new Dados(nomeEnt,valorEnt,dataEnt);
        fc.addEntrada(entrada);
        fc.pegarValorTotalDeEntradas();
		break;
	case 2:
		String nomeSai = (JOptionPane.showInputDialog(null, "Digite o nome para identicar a saida"));
        float valorSai = Float.parseFloat (JOptionPane.showInputDialog(null, "Digite o valor da saida"));
        String dataSai = (JOptionPane.showInputDialog(null, "Digite a data da saida: "));
        Dados saida = new Dados(nomeSai,valorSai,dataSai);
        fc.addSaida(saida);
        fc.pegarValorTotalDeSaida();
		break;
	case 3:
		String nomeRem= (JOptionPane.showInputDialog(null, "Digite o nome da entrada que deseja remover"));
		fc.removeEntrada(nomeRem);
		fc.pegarValorTotalDeEntradas();
		break;
	case 4:
		String saidaRem = (JOptionPane.showInputDialog(null, "Digite o nome da entrada que deseja remover"));
		fc.removeSaida(saidaRem);
		fc.pegarValorTotalDeSaida();
		break;
	case 5:
		fc.Saldo();
		JOptionPane.showMessageDialog(null, fc);
	}
	}while(opcao != 0);
	}catch (Exception e){
		JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

