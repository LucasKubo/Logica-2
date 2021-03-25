package entities;

public class Professor extends Pessoa{
	private String titulacao;
	private int siape;
	
	
	public Professor(String nome, String titulacao, int siape) {
		super.setNome(nome);
		this.titulacao = titulacao;
		this.siape = siape;
	}


	public String getTitulacao() {
		return titulacao;
	}


	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}


	public int getSiape() {
		return siape;
	}


	public void setSiape(int siape) {
		this.siape = siape;
	}


	@Override
	public double calcRefeicao() {
		return 10;
	}


	@Override
	public void login(String user, String senha) {
		if (user == super.getNome() && senha == getTitulacao()) {
			System.out.println("Acesso permitido.");
		}else {
			System.out.println("Acesso negado.");
		}
		
	}

}
