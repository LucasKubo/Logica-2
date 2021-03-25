package application;

import java.util.Locale;

import entities.Aluno;
import entities.Disciplina;
import entities.Professor;
import entities.Turma;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Turma t1 = new Turma("LG2A2", "ADS");
		System.out.println(t1);
		
		Professor p1 = new Professor("Johnata", "Mestre", 111);
		System.out.println(p1);
		
		Aluno a1 = new Aluno ("Lucas", "Sp3046672", t1);
		System.out.println(a1);
		
		p1.login("Johnata", "Mestre");
		
		Disciplina d1 = new Disciplina("LOGA2", p1);
		System.out.println(d1);
		
	}

}
