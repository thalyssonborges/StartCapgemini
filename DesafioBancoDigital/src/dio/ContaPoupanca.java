package dio;

import java.util.List;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		super.imprimirInfoConta();
	}

	public void exibirTodosClientes() {
		super.exibirClientes();
	}
	
}
