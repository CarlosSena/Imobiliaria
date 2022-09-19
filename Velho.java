
public class Velho extends Imovel{

	//um desconto no preço
	

	public String endereco;
	   public Double preco;
	   
	   private double desconto;
	  


	   public Velho(String endereco, Double preco ){
	    super();
	    this.endereco = endereco;
	    this.preco = preco;
	    
	    
	    
	    
	}



	@Override
	public void adicional() {
      
	       desconto =  preco - 1000 ;
	       System.out.println("Preço com desconto: " + desconto);
		
	}
	    
	    
	    
	    
	}
	

