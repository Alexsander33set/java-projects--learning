package empresa;

public class Main {

	public static void main(String[] args) {
		conta c1 = new conta(111, "Robertin", 2000, 500);
		// CONTA|NOME|SALDO|LIMITE
		c1.printData(true,true,true,true);
		if(!c1.saque(800)) {
			System.out.println("Invalido. Limite de saque exedido");
		}
		if(!c1.deposito(800)) {
			System.out.println("Erro ao processar seu deposito");
		}
		else {
			System.out.println("Deposito Efetuado com sucesso");
		}
		// CONTA|NOME|SALDO|LIMITE
		c1.printData(false,true,true,false);
	}

}
