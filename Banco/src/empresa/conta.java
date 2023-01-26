package empresa;

public class conta {
	int numero;
	String titular;
	float saldo;
	float limite;
	boolean apagar;
	
	public conta(int numero, String titular, float saldo, float limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	void printData(boolean conta ,boolean nome, boolean saldo,boolean limite) {
		if(conta || nome || saldo || limite){
			System.out.println("\n---------------");
			System.out.println("Dados bancarios");
			System.out.println("---------------");
			if (conta == true) {System.out.println("Numero da conta: " + this.numero);}
			if (nome == true) {System.out.println("Nome do titular: " + this.titular);}
			if (saldo == true) {System.out.println("Saldo da conta:  " + this.saldo);}
			if (limite == true) {System.out.println("Limite de saque: " + this.limite);}
			System.out.println("_______________\n");}
		else {
			System.out.println("Nenhum dado requisitado!");}
	}
	boolean deposito(double valor) {
		if (valor<0) {
			return false;
		}
		this.saldo += valor;
		return true;
	}
	boolean saque(double valor) {
		if(valor>limite) {
		return false;
		}
		this.saldo -= valor;
		return true;
	}
}
