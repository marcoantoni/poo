class Aula03 {
	
	public static void main(String args[]){
		// exemplos de laço de repetição
		
		// for é um laço de repetição contado (sabe-se o nº de vezes que deverá ser executada uma ação)
		// a contrução é dividida em 3 partes:
		// 1ª condicão: inicialização
		// 2ª condição: saída
		// 3ª condição: incremento da variavel de controle
		// for decrescente: int i=10; i > 0; i--
		for (int i=0; i < 10; i++) {
 
			System.out.printf("Laço for: i=%d \n", i);
			
			//if (i == 5)
			//	break; // interrompe o laço de repetição
		}
		
		boolean status = false;
		int j = 0;
		// laço com pré-validação 
		// primeiro avalia a condição para ver se executa ou não
		while (!status){
			System.out.printf("Executando o laço while pela %d vez \n", j);
			
			// definindo uma condição de saída
			j++;
			
			if (j == 10)
				status = true;
		}
		
		// laço do while tem pós validao
		// vai executar pelo menos uma vez
		boolean encontrado = false;
		int k=0;
		
		do {
			System.out.printf("Executando o laço do while pela %d vez", k);
			k++;
			
			if (k == 10)
				encontrado = true;
				
		} while (!encontrado);
		// ao final da execução, avalia se vai continuar a execução
	}
}
