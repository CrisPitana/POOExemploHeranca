package app;

public class UsaFuncionario{

	public static void main(String[]args) {

		Funcionario f1 = new Funcionario();
	
	    f1.setNome("Cris");
	    
	    f1.setRg("019.184.230-32");
	    
	    f1.setCartao("xxxzzzyyy");
	    
	    System.out.println(f1.getNome());
	    System.out.println(f1.getRg());
	    System.out.println(f1.getCartao());

	
	}
}