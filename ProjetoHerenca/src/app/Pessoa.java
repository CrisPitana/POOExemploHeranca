package app;

public class Pessoa {
      // final (bloqueia a classe o restante não herda os dados)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mostraClasse(){
		System.out.println("Classe Pessoa");
	}
}
