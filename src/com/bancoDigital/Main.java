package com.bancoDigital;

public class Main {

	public static void main(String[] args) {
		
		Cliente abner = new Cliente();
		abner.setNome("Abner");
		
		Conta cc = new ContaCorrente(abner);
		Conta poupanca = new ContaPoupanca(abner);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}