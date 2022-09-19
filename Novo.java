
public class Novo extends Imovel{
	//deste valor adicional
	

	   public String endereco;
	   public Double preco;
	   private double adicional;
	  


	   public Novo(String endereco, Double preco ){
	    super();
	    this.endereco = endereco;
	    this.preco = preco;
	    
	    
	    
	    
	}
	   
	   @Override    
	   public void adicional(){
		  
	       adicional = 1000 + preco;
	       System.out.println("Preço Final: " + adicional);
	       
	   }
}
