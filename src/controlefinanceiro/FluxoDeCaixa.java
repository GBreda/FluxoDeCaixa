package controlefinanceiro;
import java.util.ArrayList;
import controlefinanceiro.Dados;

	public class FluxoDeCaixa {
		protected ArrayList<Dados>entradas;
		protected  ArrayList<Dados>saidas;
		protected float saldo;
		protected float totalEntradas;
		protected float totalSaidas;
		
		public FluxoDeCaixa(){
			entradas = new ArrayList<Dados>();
			saidas = new ArrayList<Dados>();
		}
		
		public void addEntrada(Dados entrada)throws Exception{
			if(entrada == null){
				throw new Exception ("Valor Inválido!");
			}
			entradas.add(entrada);
		}
		
		public void addSaida(Dados saida)throws Exception{
			if (saida == null){
				throw new Exception ("Valor Inválido!");
			}
			saidas.add(saida);
		}
		
		public void removeEntrada(String nomeEntrada) throws Exception
		{
					if (nomeEntrada == null){
						throw new Exception ("Valor Inválido!");
					}

					for (int index = 0; index <= entradas.size(); index++)
					{
						if(entradas.get(index).nome.equals(nomeEntrada));
							entradas.remove(index);
					}
						
		
			}
		public void removeSaida(String nomeSaida) throws Exception
		{
					if (nomeSaida == null){
						throw new Exception ("Valor Inválido!");
					}

					for (int index = 0; index <= saidas.size(); index++)
					{
						if(saidas.get(index).nome.equals(nomeSaida));
							saidas.remove(index);
					}
		
			}
		
		
	    public float pegarValorTotalDeEntradas(){
	    	
	    	totalEntradas = 0;
	    	
	    	for (int index = 0; index < entradas.size(); index++){
	    	totalEntradas = totalEntradas + entradas.get(index).valor;
	    }
	    	return totalEntradas;
	    }
	    public float pegarValorTotalDeSaida(){
	    	
	    	totalSaidas = 0;
	    	
	    	for(int index = 0; index < entradas.size(); index++){
	    		totalSaidas = totalSaidas + saidas.get(index).valor;
	    	}
	    	return totalSaidas;
	}
	    public float Saldo(){
	    	saldo = totalEntradas - totalSaidas;
	    	return saldo;
	    	}

	    
		public String toString() {
			return "Entradas:"+entradas+"\n"+"Saídas:"+saidas+"\n"+ "Saldo:"+saldo;
		}
	    


}
