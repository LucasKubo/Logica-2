package entities;

public class Aluno extends Pessoa{
	public static int qtdAluno = 0;
	
	private String rne;
	private int matricula;
	private Turma turma;
	private SituacaoAcademica situacaoAcademica;
	
	public Aluno(String nome, String rne) {
		super.setNome(nome);
		this.rne = rne;
		this.matricula = ++qtdAluno;
		this.situacaoAcademica = SituacaoAcademica.MATRICULADO;
	}
	
	public Aluno(String nome, String rne, Turma turma) {
		super.setNome(nome);
		this.rne = rne;
		this.turma = turma;
		this.matricula = ++qtdAluno;
		this.situacaoAcademica = SituacaoAcademica.MATRICULADO;
	}
	
	public String getRne() {
		return rne;
	}

	public void setRne(String rne) {
		this.rne = rne;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public SituacaoAcademica getSituacaoAcademica() {
		return situacaoAcademica;
	}

	@Override
	public double calcRefeicao() {
		return 5;
	}

	@Override
	public String toString() {
		return "Aluno [rne=" + rne + ", matricula=" + matricula + ", turma=" + turma + ", situacao =" + situacaoAcademica + "]";
	}

	@Override
	public void login(String user, String senha) {
		if (user == super.getNome() && senha == getRne()) {
			System.out.println("Acesso permitido.");
		}else {
			System.out.println("Acesso negado.");
		}
	}
	
}
