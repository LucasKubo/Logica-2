package projeto_lista3;

public class Pessoa {
	private String cpf;
	private String nome;
	
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Retorna dados de Pessoa
	public String toString() {
		return "Cpf: "+cpf+"\nNome: "+nome;
	}
	
}
