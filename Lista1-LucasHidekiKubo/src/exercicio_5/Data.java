package exercicio_5;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimeData() {
		if (dia == 0) {
			System.out.println("Dia inválido !");
		}else if (mes == 0) {
			System.out.println("Mês inválido !");
		}else {
			System.out.println(dia+"/"+mes+"/"+ano);
		}
	}
	
	//Calcula a quantidade de dias que passaram até chegar no mês passado por parâmetro.
	public void calculaDias (int mes) {
		System.out.println((mes-1)*30+" Dias se passaram desde o início do ano até chegar no mês: "+mes);
	}
	
}
