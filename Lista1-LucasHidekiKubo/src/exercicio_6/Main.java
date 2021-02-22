package exercicio_6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tempo t1 = new Tempo(17,11,20);
		Tempo t2 = new Tempo(19,32,21);
		
		t1.somaTempo(t2);
		System.out.println(t1);
		
		t1.substraiTempo(t2);
		System.out.println(t1);
	}

}
