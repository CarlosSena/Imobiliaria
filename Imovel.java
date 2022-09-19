
public abstract class Imovel {
	
	
	//Crie a classe Imovel, que possui um endereço e um preço. a. crie uma classe Novo
	
	//que herda Imovel e possui um adicional no preço.
	
	//Crie métodos de acesso e impressão deste valor adicional. b.
	
	//crie uma classe Velho, que herda Imovel e possui um desconto no preço.
	
	 //Crie métodos de acesso e impressão para este desconto.


	private String endereco;
	private Double preco;
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public abstract void adicional();
	
	//public abstract void desconto(); 
}
