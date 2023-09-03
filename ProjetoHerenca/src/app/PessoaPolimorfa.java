package app;

import javax.swing.JOptionPane;

public class PessoaPolimorfa {

	public static void main(String[] args) {
		Pessoa p1 = null;

		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Forneca um numero"));

		switch (tipo) {

		case 1:
			p1 = new Pessoa();
			break;

		case 2:
			p1 = new PessoaFisica();
			break;

		case 3:
			p1 = new PessoaJuridica();
			break;

		case 4:
			p1 = new Funcionario();
			break;

		default: {
			System.out.println("Tipo desconhecido");
			System.exit(0);
		}
		}

		p1.mostraClasse();
	}

}

/*   ATIVIDADE 2
 
deitel -  capitulo 10 - java como programar Deitel
ESTUDAR - 311 - 330








*/

