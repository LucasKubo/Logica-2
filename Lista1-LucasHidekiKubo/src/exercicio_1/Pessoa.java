package exercicio_1;

public class Pessoa {
	private String nome;
	private String dataDeNascimento;
	private double altura;
	private int anoAtual = 2021;
	
	public Pessoa(String nome, String dataDeNascimento, double altura) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimeDados() {
		System.out.println("Nome:"+nome+"\nData de nascimento: "+dataDeNascimento+"\nAltura: "+altura);
	}
	
	public void calculaIdade() {
		int anoNascimento = Integer.parseInt(dataDeNascimento.substring(6, 10));
		System.out.println(anoAtual - anoNascimento);
	}
}
