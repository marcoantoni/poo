class AppBanco {
	public static void main (String args[]) {
	
		PessoaFisica cli01 = new PessoaFisica("781.368.770-17", "3438643", "Juliano Antunes", new Data (14, 1, 1990), "Rua Frederico Augusto TImmen");
	
		PessoaJuridica cli02 = new PessoaJuridica("Mercado Reichert", "82.783.911/0001-05", "Mercado Reichert LTDA", new Data (1, 5, 1985), "Av. borges de medeiros"); 
	
		ContaCorrente conta01 = new ContaCorrente(cli01);
		
		conta01.depositar(1000f); // depositando 1000 reais na conta01
		
		conta01.sacar(400f); // sacando 400 reais da conta01 - saldo 600
		
		conta01.sacar(600f); // sacando 600 reais da conta01 - saldo 0
		
		conta01.sacar(300f); // sacando 300 reais da conta01 - saldo 0, pois o deposito não foi realizado
		
		ContaCorrente conta02 = new ContaCorrente(cli02);
		
		conta01.imprimirExtrato();
		
		conta02.sacar(1500f);	// // sacando 400 reais da conta02 - saldo -1500
		
		conta02.imprimirExtrato();
	
	}
}
