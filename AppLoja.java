class AppLoja {


	public static void main(String args[]) {
		/* Criando uma nova instancia de vestuario. Um vestuario também é um produto 
		 * Ao passar o argumento Vestuario.CAMISETA, é como se estivessemos passando o número 1. 
		 * É mais fácil usar a constante do que ter que lembrar que o código 1
		 * representa uma camiseta
		 */
		Vestuario prod1 = new Vestuario("100% algodão", Vestuario.CAMISETA, "M", "Camiseta básica", 41.3f );
			
		prod1.mostrarVestuario();
	}

}
