package controle;

import leilao.Cliente;
import leilao.Lance;
import leilao.Leilao;

public class ControleLeilao {

	public boolean validarLance (Lance novoLance, Leilao leilao ) {
		boolean validade = false;
		if(novoLance.getValor()>= leilao.getLanceMinimo ()) {
			if(leilao.getLances().size() != 0) {
			Cliente ultimoCliente = leilao.getLances().get(leilao.getLances().size()-1).getCliente();
			if(novoLance.getCliente().equals(ultimoCliente)) {
			validade =  false;
		}else {
			validade = true;
		}
			}else {
				validade = true;
			}
	}
		return validade;	
}
}