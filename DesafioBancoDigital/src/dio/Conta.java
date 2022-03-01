package dio;

import java.util.List;

public abstract class Conta implements IConta{
	
	protected static int AGENCIA = 1;
	protected static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	

	@Override
	public void sacar(double valor) {
		if((this.saldo - valor) <=0) {
			System.out.println("Saldo insuficiente!");
		}else {
			this.saldo -= valor;	
			System.out.println("Saque Efetuado!");
		}
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if((this.saldo - valor) <=0 ) {
			System.out.println("Saldo insuficiente!");
		}else {
			this.saldo -= valor;
			contaDestino.depositar(valor);
			System.out.println("Transferência Efetuada!");
		}
	}

	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfoConta() {
		System.out.println(String.format("Titular: %s", this.cliente.nome));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println();
	}
	
	
	protected void exibirClientes() {
		System.out.println(String.format("Cliente: %s", this.cliente.nome));
	}

	
}
