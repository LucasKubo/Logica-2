package exercicio_6;

public class Tempo {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Tempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	public Tempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void imprimeTempo() {
		System.out.println(horas+":"+minutos+":"+segundos);
	}
	
	public int substraiTempo(int tempo1, int tempo2) {
		return tempo1-tempo2;
	}
	
	public int somaTempo(int tempo1, int tempo2) {
		return tempo1+tempo2;
	}

}
