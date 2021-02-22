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
	
	public void substraiTempo(Tempo tempo2) {
		//Transformando os tempos em segundos
		int tempo1EmSec = this.horas*3600 + this.minutos*60 + this.segundos;
		int tempo2EmSec = tempo2.horas*3600 + tempo2.minutos*60 + tempo2.segundos; 
		int resultado = (tempo1EmSec>tempo2EmSec)? tempo1EmSec - tempo2EmSec : tempo2EmSec - tempo1EmSec;
		
		if(resultado != 0) {  //Verificando se os tempos não são iguais
			//Atribuindo o resultado da substração dos tempos em horas, minutos e segundos.
			this.horas = resultado / 3600;
			int aux = resultado % 3600;
			this.minutos = aux / 60;
			this.segundos = aux % 60;
		}
	}
	
	public void somaTempo(Tempo tempo2) {
		//Transformando os tempos em segundos
		int tempo1EmSec = this.horas*3600 + this.minutos*60 + this.segundos;
		int tempo2EmSec = tempo2.horas*3600 + tempo2.minutos*60 + tempo2.segundos; 
		int resultado = tempo1EmSec + tempo2EmSec;
		
		//Atribuindo o resultado da soma dos tempos em horas, minutos e segundos.
		this.horas = resultado / 3600;
		int aux = resultado % 3600;
		this.minutos = aux / 60;
		this.segundos = aux % 60;
	}

	public String toString() {
		return "Tempo: "+ horas + ":"+ minutos+ ":"+ segundos;
	}
}
