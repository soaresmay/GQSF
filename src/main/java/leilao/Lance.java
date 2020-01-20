package leilao;

public class Lance {
	
 private Cliente cliente;
 private double valor;
 
public Lance(Cliente cliente, double valor) {
	super();
	this.cliente = cliente;
	this.valor = valor;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}
 
}
