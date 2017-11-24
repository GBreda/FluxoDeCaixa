package controlefinanceiro;

public class Dados {
	protected String nome;
	protected float valor;
	protected String data;
	
	public Dados(){
		
	}
	public Dados(String nome, float valor, String data){
		this.nome = nome;
		this.valor = valor;
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if (nome == null){
			throw new Exception ("Insira o nome!");
		}
		this.nome = nome;
	
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) throws Exception {
		if (valor < 0){
		throw new Exception ("Valor Inválido!");}
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) throws Exception {
		if (data == null){
			throw new Exception ("Insira a data!");
		}
		this.data = data;
		
	}
	
	public String toString() {
		return "\n"+"Nome:"+nome+"\n"+"Valor:"+valor+"\n"+"Data:"+data;
	}
		
}


