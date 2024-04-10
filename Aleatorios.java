import java.util.Random;

class Aleatorios{
	
	public static void main(String args[]) {
		// cria uma instancia da classe Random
		Random gerador = new Random();
		
		// gerando um inteiro randomicamente
		
		//int aleatorioInteiro = gerador.nextInt(); // gera um numero dentro do intervalo de um int
		
		// int aleatorioInteiro = gerador.nextInt(1000); // gera um numero dentro do intervalo entre 0 e 1000
		
		int aleatorioInteiro = gerador.nextInt(1000, 2000); // gera um numero dentro do intervalo 1000 e 2000
		
		System.out.printf("O número inteiro gerado foi %d \n", aleatorioInteiro);
			
		// gera um float de maneira aleatória (valor entre 0 e 1)
		float aleatorioFloat = gerador.nextFloat();
		System.out.printf("O número float gerado foi %f \n", 
			aleatorioFloat);
			
		boolean aleatorioBooleano = gerador.nextBoolean();
		System.out.printf("O booleano gerado foi %s \n", 
			aleatorioBooleano);
	}

}
