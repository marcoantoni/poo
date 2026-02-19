class Aula01 {
	
	public static void main (String args[]) {
		// Isso é um comentário de apenas uma linha
		
		/* Isso é um comentário multi linha
		 * outra linha
		 * o comentário fecha com
		 */
		 
		 // declarando variaveis
		 String nome = "Lucas";
		 int idade = 23;
		 float peso = 78.9f;
		 
		 // vamos tentar armazenar o valor 7012734782 dentro de um int - irá gerar um erro, pois o valor não é suportado
		 long rg = 7012734782l;
		 
		 double pi = 3.141555734985734985783945947398574395934;
		 
		 char sexo = 'M';	// declarando uma variavel char
		 
		 // imprimindo os dados
		 // %s -> exibir string / char
		 // %d -> exibir numeros inteiros
		 // %f -> exibir numeros com ponto flutuante
		 System.out.printf("Nome: %s \n", nome);
		 
		 System.out.printf("Idade: %d \n", idade);
		 
		 System.out.printf("Peso: %f \n", peso);
		 
		 System.out.printf("Sexo: %s \n", sexo);
		 
		 char teste = 77;
		 
		 System.out.printf("O caractere 77 da tabela ASC é %s \n", teste);
		
		// determinar se a pessoa é maior de idade
		// exemplo de if com uma condição
		
		if (idade >= 18) {
			System.out.printf("É maior de idade \n");
		} else {
			System.out.printf("É menor de idade \n");
		}
		
		// escrever um numero por extenso
		// exemplo de teste em que uma variavel pode assumir mais de 2 valores
		int numero = 5;
		
		if (numero == 1)
			System.out.printf("UM \n");
		else if (numero == 2)
			System.out.printf("DOIS \n");
		else if (numero == 3) 
			System.out.printf("TRÊS \n");
		else 
			System.out.printf("NÃO ENTENDO NUMEROS MAIORES QUE 3 OU MENORES OU IGUAL QUE 0\n");
		
		
		// está apto a tirar a CNH?
		// if com duas condições
		
		boolean passouNoTeste = false;
		
		if (idade >= 18 && passouNoTeste == true)
			System.out.printf("Passou no teste e é maior de idade. APTO\n");
		else 
			System.out.printf("Não atende aos requisitos. NÃO APTO \n");
			
		// exemplo de concatenação de strings
		
		// adicionando o sobrenome a variavel nome
		nome = nome + " da Silva";
		
		System.out.printf("Nome completo: %s \n", nome);
		
		// escrever um numero por extenso usando a estrutura de decisão switch
		
		switch(numero){
			case 1:
				System.out.printf("UM \n");
				break;
			case 2:
				System.out.printf("DOIS \n");
				break;
			case 3:
				System.out.printf("TRÊS \n");
				break;
			case 4:
				System.out.printf("QUATRO \n");
				break;
			// o default simula o último else de uma estrutura if/else aninhada
			default:
				System.out.printf("NÃO ENTENDO NUMEROS MAIORES QUE 4 OU MENORES OU IGUAL QUE 0\n");
			
		}
	}
}
