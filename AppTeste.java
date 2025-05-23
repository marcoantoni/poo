class AppTeste{

	public static void main (String args[]) {
		// criando um novo cliente
		Cliente cli01 = new Cliente("Jonas Alberto Da Costa",
			"254.458.860-85", "Rua Frederico Augusto Timmenn",
			new Data(21, 8, 1999) );
			
		// imprimindo as informações do cliente
		//System.out.printf("%s", cli01.toString() );
		
		// códido copiado da classe Banco
		Conta cta1 = new Conta(cli01, new Data (14, 1, 2021) );
		
		// fazendo operações de deposito e saque na conta do Pablo
		cta1.depositar(200);
		cta1.depositar(100);
		cta1.sacar(150);
		
		cta1.imprimirExtrato();
	}
}
