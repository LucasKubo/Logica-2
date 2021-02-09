package projeto_lista3;
import java.util.ArrayList;
import java.util.List;

public class Oficina {
	private List<OrdemDeServico> ordensServico = new ArrayList<>();
	
	public Oficina(){}

	public List<OrdemDeServico> getOrdensServico() {
		return ordensServico;
	}

	public void setOrdensServico(List<OrdemDeServico> ordensServico) {
		this.ordensServico = ordensServico;
	}
	
	//Recebe uma OrdemDeServico e a adiciona na lista ordensServico.
	public void adicionaOS (OrdemDeServico os) {
		ordensServico.add(os);
	}
	
	//Recebe um cpf e retorna as OrdemDeServico que possui o cliente com o cpf recebido.
	public List<Object> buscaOSCPF (String cpf){
		List<Object> lista = new ArrayList<>();
		for (int i=0; i<ordensServico.size(); i++) {
			if(cpf.equalsIgnoreCase(ordensServico.get(i).getCliente().getCpf())) {
				lista.add(ordensServico.get(i).getCodigo());
			}
		}
		return lista;
	}
	
	//Recebe um código de OrdemDeServico e retorna o código (se existir ordem com o código), ou null(caso não exista ordem com o código).
	public Integer buscaOSCodigo (int codigo) {
		for (int i=0; i<ordensServico.size(); i++) {
			if (codigo == ordensServico.get(i).getCodigo()) {
				return ordensServico.get(i).getCodigo();
			}
		}
		return null;
	}
	
	//Recebe um código de OrdemDeServico e retorna uma lista com as ordens que possuem o código recebido.
	public List<OrdemDeServico> buscaOSServico(int codigo){
		List<OrdemDeServico> servicos = new ArrayList<OrdemDeServico>();
		for (int i=0; i<ordensServico.size(); i++) {
			if (codigo == ordensServico.get(i).getCodigo()) {
				servicos.add(ordensServico.get(i));
			}
		}
		return servicos;
	}
	//Função ainda não definida
	/*public List<OrdemDeServico> buscaOSMecanico(String cpf){ 
		return ;
	}*/
	
	//Retorna o valor total de todas as ordens.
	public double calculaFaturamento() {  
		double total = 0;
		for (int i=0; i<ordensServico.size(); i++) {
			total += ordensServico.get(i).calculaValorTotal();
		}
		return total;
	}
	
	//Implementação incompleta
	public String toString() {
		return "provisório_oficina";
	}
}
