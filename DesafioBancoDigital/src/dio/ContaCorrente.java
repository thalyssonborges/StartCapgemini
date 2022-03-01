package dio;

import java.util.List;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		super.imprimirInfoConta();
	}

	public void exibirTodosClientes() {
		super.exibirClientes();
	}
	
}
