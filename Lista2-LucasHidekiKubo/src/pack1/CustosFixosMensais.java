package pack1;

public enum CustosFixosMensais {
	AGUA(100),LUZ(300),INTERNET(150),GAS(80);
	
	private int valor;
	
	CustosFixosMensais(int valor) {
		this.valor=valor;
	}

	public int getValor() {
		return valor;
	}

}
