package exercicio_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato c1 = new Contato("Carol","(11) 92323");
		Contato c2 = new Contato("Ana","(11) 9232124");
		
		Agenda ag1 = new Agenda();
		ag1.adicionarContato(c1);
		ag1.adicionarContato(c2);
		ag1.exibeContatos();
		ag1.removerContato(c2);
		ag1.exibeContatos();
	}

}
