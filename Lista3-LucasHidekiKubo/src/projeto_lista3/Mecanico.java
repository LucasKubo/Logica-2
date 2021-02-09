package projeto_lista3;

public class Mecanico extends Pessoa{
	private String especialidade;
	
	public Mecanico (String cpf, String nome, String especialidade) {
		super(cpf, nome);
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	//Retorna os dados do Mecanico.
	public String toString() {
		return "Nome do mecânico: "+getNome()+"\nCpf do mecânico: "+getCpf()+"\nEspecialidade: "+especialidade;
	}
}
