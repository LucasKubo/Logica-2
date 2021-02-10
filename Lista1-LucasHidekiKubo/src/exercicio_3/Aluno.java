package exercicio_3;

public class Aluno {
	private String matricula;
	private String nome;
	private double[] notas = new double[3];
	private double media;
	
	public Aluno (String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calculoMedia() {
		double soma = 0;
		for (int i=0; i<3; i++) {
			soma += notas[i];
		}
		this.media = soma/3;
		return media;
	}
	
	public String situacao() {
		if (media<=10){
			if (media >= 6) {
				return "Aprovado";
			}
			return "Reprovado";
		}
		return "Nota inválida !";
	}
}
