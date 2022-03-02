package dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		String cliente;
		
		List<Cliente> listaClientesContaCorrente = new ArrayList<Cliente>();
		List<Cliente> listaClientesContaPoupanca = new ArrayList<Cliente>();
		List<Conta> listaContaCorrente = new ArrayList<Conta>();
		List<Conta> listaContaPoupanca = new ArrayList<Conta>();
		

		
		do {
			//MENU DE OP��ES DE ABERTURA DE CONTA
			System.out.println("==== MENU DE ABERTURA DE CONTA ====");
			System.out.println("Selecione uma das op��es");
			System.out.println("1 - Abertura de Conta Corrente");
			System.out.println("2 - Abertura de Conta Poupan�a");
			System.out.println("3 - Sair");
			System.out.printf("Op��o: ");
			opcao = sc.nextInt();
			
			
			if(opcao == 1) { //MENU DE OP��ES DE ABERTURA DE CONTA -- CONTA CORRENTE
				System.out.printf("\n==== ABERTURA CONTA CORRENTE === \n");
				System.out.printf("Nome do Cliente: ");
				cliente = sc.next();
				Cliente nome = new Cliente();
				nome.setNome(cliente);
				listaClientesContaCorrente.add(nome);
				
				Conta conta = new ContaCorrente(nome);
				listaContaCorrente.add(conta);

				
			}else if(opcao == 2){ //MENU DE OP��ES DE ABERTURA DE CONTA -- CONTA POUPAN�A
				System.out.printf("\n==== ABERTURA CONTA POUPAN�A === \n");
				System.out.printf("Nome do Cliente: ");
				cliente = sc.next();
				Cliente nome = new Cliente();
				nome.setNome(cliente);
				listaClientesContaPoupanca.add(nome);
				
				Conta conta = new ContaPoupanca(nome);
				listaContaPoupanca.add(conta);
				
			}else if(opcao == 3) { //MENU DE OP��ES DE ABERTURA DE CONTA -- SAIR
				opcao = 0;
			}
			
			System.out.println();
		}while(opcao!=0);
		
		List<Conta> listaTodosClientes = new ArrayList<Conta>(listaClientesContaCorrente.size()+listaClientesContaPoupanca.size());
		listaTodosClientes.addAll(listaContaCorrente);
		listaTodosClientes.addAll(listaContaPoupanca);
		
		do { //MENU DE OP��ES DE TRANSA��ES FINANCEIRAS
			System.out.println("==== REALIZAR TRANSA��ES FINANCEIRAS ====");
			System.out.println("Selecione uma das op��es");
			System.out.println("1 - Contas Corrente");
			System.out.println("2 - Contas Poupan�as");
			System.out.println("3 - Sair");
			System.out.printf("Op��o: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) { //MENU DE OP��ES DE TRANSA��ES FINANCEIRAS -- CONTAS CORRENTES
				System.out.println("\nContas Corrente");
				int i=0;
				for (Conta c : listaContaCorrente) {
					System.out.println(i+" :"+c.cliente.nome);
					i++;
				}
				System.out.printf("Selecione o cliente: ");
				int opcCliente = sc.nextInt();
				listaContaCorrente.get(opcCliente);
				
				boolean opc = true;
				do { //MENU DE OPERA��ES -- CONTA CORRENTE
					System.out.println("\n==== MENU DE OPERA��ES DA CONTA ====");
					System.out.println("Selecione uma das op��es");
					System.out.println("1 - Saque");
					System.out.println("2 - Deposito");
					System.out.println("3 - Transferencia");
					System.out.println("4 - Voltar");
					System.out.printf("Op��o: ");
					opcao = sc.nextInt();
					
					if(opcao == 1) { //MENU DE OPERA��ES -- CONTA CORRENTE -- { SAQUE }
						System.out.printf("Valor de Saque: ");
						double valor = sc.nextDouble();
						listaContaCorrente.get(opcCliente).sacar(valor);
						opc = false;
					}else if(opcao == 2) { //MENU DE OPERA��ES -- CONTA CORRENTE -- { DEPOSITO }
						System.out.printf("Valor de Deposito: ");
						double valor = sc.nextDouble();
						listaContaCorrente.get(opcCliente).depositar(valor);
						System.out.println("Deposito Efetuado!\n");
						opc = false;
					}else if(opcao == 3) { //MENU DE OPERA��ES -- CONTA CORRENTE -- { TRANSFERENCIA }
						System.out.printf("Valor de Transferencia: ");
						double valor = sc.nextDouble();
						i = 0;
						for (Conta c : listaTodosClientes) {
							System.out.println(i+": "+c.cliente.nome);
							i++;
						}
						System.out.printf("Selecione uma conta para transferir: ");
						int opcCliente1 = sc.nextInt();
						listaContaCorrente.get(opcCliente).transferir(valor, listaTodosClientes.get(opcCliente1));
						opc = false;
					}else { //MENU DE OPERA��ES -- CONTA CORRENTE -- { VOLTAR }
						opc = false;
					}
				}while(opc);
					
			}else if(opcao == 2) { //MENU DE OP��ES DE TRANSA��ES FINANCEIRAS -- CONTAS POUPAN�A
				System.out.println("\nContas Poupan�a");
				int i=0;
				for (Conta c : listaContaPoupanca) {
					System.out.println(i+" :"+c.cliente.nome);
					i++;
				}
				System.out.printf("Selecione o cliente: ");
				int opcCliente = sc.nextInt();
				listaContaPoupanca.get(opcCliente);
				
				boolean opc = true;
				do { //MENU DE OPERA��ES -- CONTA POUPAN�A
					System.out.println("\n==== MENU DE OPERA��ES DA CONTA ====");
					System.out.println("Selecione uma das op��es");
					System.out.println("1 - Saque");
					System.out.println("2 - Deposito");
					System.out.println("3 - Transferencia");
					System.out.println("4 - Voltar");
					System.out.printf("Op��o: ");
					opcao = sc.nextInt();
					
					if(opcao == 1) { //MENU DE OPERA��ES -- CONTA POUPAN�A -- { SAQUE }
						System.out.printf("Valor de Saque: ");
						double valor = sc.nextDouble();
						listaContaPoupanca.get(opcCliente).sacar(valor);
						opc = false;
					}else if(opcao == 2) { //MENU DE OPERA��ES -- CONTA POUPAN�A -- { DEPOSITO }
						System.out.printf("Valor de Deposito: ");
						double valor = sc.nextDouble();
						listaContaPoupanca.get(opcCliente).depositar(valor);
						System.out.println("Deposito Efetuado!\n");
						opc = false;
					}else if(opcao == 3) { //MENU DE OPERA��ES -- CONTA POUPAN�A -- { TRANSFERENCIA }
						System.out.printf("Valor de Transferencia: ");
						double valor = sc.nextDouble();
						i = 0;
						for (Conta c : listaTodosClientes) {
							System.out.println(i+": "+c.cliente.nome);
							i++;
						}
						System.out.printf("Selecione uma conta para transferir: ");
						int opcCliente1 = sc.nextInt();
						listaContaPoupanca.get(opcCliente).transferir(valor, listaTodosClientes.get(opcCliente1));
						opc = false;
					}else { //MENU DE OPERA��ES -- CONTA POUPAN�A -- { VOLTAR }
						opc = false;
					}
					
					
				}while(opc);
			}else { //MENU DE OP��ES DE TRANSA��ES FINANCEIRAS -- CONTAS POUPAN�A -- { SAIR }
				opcao = 0;
			}
			
			boolean opc = true; 

		}while(opcao!=0);
		
		System.out.println("\n>>>>  Extrato de Clientes Conta Corrente  <<<<\n");
		for (Conta c : listaContaCorrente) {
			c.imprimirExtrato();
		}
			
		System.out.println(">>>>  Extrato de Clientes Conta Poupanca  <<<<\n");
		for (Conta c : listaContaPoupanca) {
			c.imprimirExtrato();
		}

		System.out.println(">>>>>  TODOS OS CLIENTES  <<<<<\n");
		for (Conta c : listaTodosClientes) {
			c.exibirTodosClientes();
		}
	 
	}

}
