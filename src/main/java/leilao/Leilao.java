package leilao;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	
 private  Produto produto;
 private List<Cliente> clientes;
 private List<Lance> lances;
 private double lanceMinimo; 
 	public Leilao(Produto produto, double lanceMinimo) {
	  super();
	  this.produto = produto;
	  this.clientes = new ArrayList<Cliente>();
	  this.lances = new ArrayList<Lance>();
	 this.lanceMinimo = lanceMinimo;
}
 	public void adicionarLance(Lance lance) {
 	  this.lances.add(lance);
 	}
 	public void adicionarCliente(Cliente cliente) {
	  this.clientes.add(cliente);
 }
	public Produto getProduto() {
		return produto;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public List<Lance> getLances() {
		return lances;
	}
	public double getLanceMinimo() {
		return lanceMinimo;
	}
 	
}
