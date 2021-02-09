package projeto_lista3;

public class Cliente extends Pessoa{
	private String telefone;
	
	public Cliente (String cpf, String nome, String telefone) {
		super(cpf, nome);
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Retorna dados de Cliente
	public String toString() {
		return "Nome do cliente: "+getNome()+"\nCpf do cliente: "+getCpf()+"\nTelefone: "+telefone;
	}
}
