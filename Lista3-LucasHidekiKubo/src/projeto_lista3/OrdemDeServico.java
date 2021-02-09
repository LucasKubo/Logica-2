package projeto_lista3;

import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {
	private int codigo;
	private Cliente cliente;
	private List<Servico> servicos = new ArrayList<>();
	private List<Mecanico> mecanicos;
	
	public OrdemDeServico(int codigo, Cliente cliente) {
		this.codigo = codigo;
		this.cliente = cliente;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Servico> getServicos(){
		return servicos;
	}
	
	public void setServicos (List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	public List<Mecanico> getMecanicos() {
		return mecanicos;
	}
	
	public void setMecanicos(List<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}
	
	//Recebe um servi�o e adiciona-o � ordem de servi�o.
	public void adicionaServico(Servico servico) {
		servicos.add(servico);
	}
	
	//Ainda n�o implementado
	public void adicionaMecanico(Mecanico mecanico) {
		
	}
	
	//Calcula o valor total dos servi�os da ordem de servi�o.
	public double calculaValorTotal() {
		double soma = 0;
		for (int i=0; i<servicos.size() ; i++) {
			soma += servicos.get(i).getValor();
		}
		return soma;
	}
	
	//Recebe um c�digo e retorna se existe algum servi�o com este c�digo.
	public boolean possuiServico(int codigo) {
		for (int i=0; i<servicos.size(); i++) {
			if (codigo == servicos.get(i).getCodigo()) {
				return true;
			}
		}
		return false;
	}
	
	//Ainda n�o implementado
	/*public boolean possuiMecanico(String cpf) {
		return ;
	}*/
	
	//Retorna dados(nome, codigo) de OrdemDeServico
	public String toString() {
		return "Nome do cliente da ordem de servi�o: " + cliente.getNome() + "\nC�digo da ordem de servi�o: " + codigo;
	}
}
