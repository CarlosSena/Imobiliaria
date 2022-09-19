import java.util.Scanner;

public class TestaImovel {

	 public static void main(String[] args) {
	        int op = 0;
	        Scanner sc = new Scanner(System.in);

	        Novo novo1 = new Novo("Rua Sei lá", 50000.00);
	       // double preco();
	        Velho velho1 = new Velho("Rua Não sei", 20000.00);
	        
	        

	       
	        //
	        do {

	            System.out.println("1 - Novo");
	            System.out.println("2 - Velho");
	            
	            System.out.println("0 - Sair \n>>");

	            op = sc.nextInt();
	        
	            
	            
	            switch (op) {
	                case 1:
	                    System.out.println("Endereço: " + novo1.endereco);
	                    System.out.println("Preço: " + novo1.preco);
	                    novo1.adicional();
	                    
	                    //System.out.println("Grupo: " + lobo1.grupo);
	                    //lobo1.emitirSom();
	                    //lobo1.formaDe();
	                    //System.out.println("Emitir Som: " + );
	                    //	
	                    break;

	               
	                case 2:
	                    System.out.println("Endereço: " + velho1.endereco);
	                    System.out.println("Preço: " + velho1.preco);
	                    velho1.adicional();
	                    break;
	                    
	                case 0:
	                	
	                    System.out.println("Saindo...");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Opção Inválida!");
	            }
	        } while (op != 0);
	    }

	
	
	
	
}

