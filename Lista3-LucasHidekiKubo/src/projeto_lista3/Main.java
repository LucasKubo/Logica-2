package projeto_lista3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("111122223333","Lucas","11930012002");
		Cliente c2 = new Cliente("444555666777","Leonardo","11905072006");
		Cliente c3 = new Cliente("223333444999","Victor","11916122003");
		
		Servico s1 = new Servico(01,"Conserto de retrovisor",300.00);
		Servico s2 = new Servico(03,"Blindagem do carro",20000.00);
		Servico s3 = new Servico(05,"Pintura",1000.00);
		
		Oficina of1 = new Oficina();
		
		OrdemDeServico ods1 = new OrdemDeServico(10,c1);
		OrdemDeServico ods2 = new OrdemDeServico(20,c2);
		OrdemDeServico ods3 = new OrdemDeServico(30,c3);
		OrdemDeServico ods4 = new OrdemDeServico(40,c1);
		
		ods1.adicionaServico(s3);
		ods1.adicionaServico(s2);
		
		ods2.adicionaServico(s1);
		ods2.adicionaServico(s3);
		
		ods3.adicionaServico(s1);
		ods3.adicionaServico(s2);
		ods3.adicionaServico(s3);
		
		ods4.adicionaServico(s1);
		ods4.adicionaServico(s2);
		
		of1.adicionaOS(ods1);
		of1.adicionaOS(ods2);
		of1.adicionaOS(ods3);
		of1.adicionaOS(ods4);
		
		
		System.out.println("Valor total da Ordem de Serviço (ods1): "+ods1.calculaValorTotal());
		System.out.println();
		System.out.println("O cliente com o Cpf 111122223333 está nas seguintes ordens: "+ of1.buscaOSCPF("111122223333"));
		System.out.println();
		System.out.println("Estes são os dados da ordem de serviço com código 10: \n" + of1.buscaOSServico(10));
		System.out.println();
		System.out.println("Faturamento total da Oficina (of1): " + of1.calculaFaturamento());
	}

}
