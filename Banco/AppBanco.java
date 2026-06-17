class AppBanco {

	/* 
	 * Classe para testar todas as explicações desenvolvidas em aula 
	 */
	
	public static void main (String args[]) {
	
		Pessoa p1 = new PessoaFisica("486.283.190-77", "343243", "Juliano dos Santos", new Data(14, 1, 2002), "Rua Frederico A. Timmen");
		
		//String nomeFantasia, String cnpj, String nome, Data nascimento, String endereco
		Pessoa p2 = new PessoaJuridica("Hauss congelados", "38.239.609/0001-90", "Hauss comercio de congelados LTDA", new Data(15, 1 , 2010), "Taquara") ;
		
		Conta c1 = new ContaCorrente(p2);
		
		c1.depositar(250);
		
		c1.sacar(300);
		
		c1.sacar(150);
		
		c1.sacar(6);
		
		c1.imprimirExtrato();
		
	}
}
