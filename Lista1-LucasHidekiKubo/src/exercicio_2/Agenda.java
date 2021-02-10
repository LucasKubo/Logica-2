package exercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Contato> contatos = new ArrayList<>();

	public Agenda() {}

	public void adicionarContato (Contato contato) {
		contatos.add(contato);
	}
	
	public void removerContato (Contato contato) {
		contatos.remove(contato);
	}
	
	public void exibeContatos () {
		System.out.println(contatos);
	}
}
