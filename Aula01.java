class Aula01{
	
	public static void main (String args[]) {
	
		// primeiro declara-se o tipo da variavel
		int idade = 17;	// atribui o valor 30 a variavel idade
		
		/* 
			Comentários de mais de uma linha
			O print abaixo é uma forma de printar dados
		*/
		
		// O print abaixo é outra forma de printar dados
		System.out.println("Idade: " + idade);
		
		System.out.printf("Idade: %d", idade);
		
		float peso = 70.6f;
		
		System.out.printf("Peso: %f", peso);
		
		String mensagem = "Aprendendo a programar em Java!";
		
		System.out.printf("\nMensagem: %s", mensagem);
	
		char sexo = 'M'; // o tipo char sempre tem apenas 1 caractere e é dentro de aspas simples
		
		System.out.printf("\nSexo: %s", sexo);
		
		// operadores aritméticos
		
		int soma = 10 + 20;
		
		int subtracao = 10 - 20;
		
		int mult = 10 * 20;
		
		float div = (float)10 / 20;
		
		System.out.printf("\nSoma: %d", soma);
		System.out.printf("\nSubtração: %d", subtracao); 
		System.out.printf("\nMultiplicação: %d", mult); 
		System.out.printf("\nDivisão: %.2f", div);
		
		int mod = 10 % 3; 
		System.out.printf("\nResto: %d", mod);
		
		// exemplo de if com um condição
		if (idade >= 18){
			System.out.printf("É maior de idade");
		} else {
			System.out.printf("É menor de idade");
		}
	}
}
