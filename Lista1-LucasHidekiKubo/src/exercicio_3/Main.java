package exercicio_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notas[] = new double[]{10,10,10};
		Aluno a1 = new Aluno("123456","Ronaldo",notas);
		a1.calculoMedia();
		System.out.println(a1.situacao());
	}

}
