package exercicio_4;

public class Pessoa {
	private String nome;
	private int idade;
	private String nomeDoPai;
	private String nomeDaMae;
	
	public Pessoa(String nome, int idade, String nomeDoPai, String nomeDaMae) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	
	
	
}
