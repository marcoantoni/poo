class Aula02 {
	
	public static void main(String args[]) {
		
		// exemplo operadores aritméticos
		int a = 6;
		int b = 4;
		
		// para que o resultado de 1.5 é necessário que um operador seja float
		
		// a variavel pode ser alterada para float ou pode ser feito um cast (float)a
		
		float resultado = (float)a / b;
		
		System.out.println("O resultado é " + resultado);
		
		
		// exemplo de laço de repetição for
		
		// 1º condição de inicio: int i = 0
		// 2º condição de saída: i < 10;
		// 3º incremento: i++ (aumenta de um em um), i=i+2 (aumenta dois em dois)...
		
		for (int i = 0; i < 10; i=i+2){
			System.out.printf("executando o for pela %d vez \n", i);
		}
		
		// exemplo laço de repetição while
		// ele é um laço de repetição com pré validação
		
		boolean status = true;	// variavel para controlar a execução do while
		
		int i = 0;	// variavel para ser a condição de saida
		
		while (status == true) {
			System.out.printf("Executando o while");
			
			// definindo a condição de saida
			i++;
			
			if (i == 100)
				status = false;
		} 
		
		// Exemplo de laço de repetição do-while
		// O do-while executa o bloco pelo menos uma vez,
		// e só depois verifica a condição de parada.

		boolean encontrado = false;	// Variável de controle do laço.
		// Enquanto "encontrado" for false, o laço continuará executando.

		// int i = 0; 
		// Isso daria erro, pois "i" já foi declarado antes.
		// Em Java, não podemos declarar a mesma variável duas vezes no mesmo escopo.

		// Aqui apenas resetamos o valor da variável já existente.
		i = 0;

		do {
			
			// Este bloco será executado pelo menos uma vez,
			// mesmo que a condição do while seja falsa.
			System.out.printf("Executando o do while pela %d vez \n", i);
			
			// Incrementamos o contador a cada repetição.
			// Isso é importante para evitar laço infinito.
			i++;
					
			// Criamos a condição de saída do laço.
			// Quando i chegar a 200, a variável "encontrado" passa a ser true.
			if (i == 200)
				encontrado = true;
			
		// O laço continuará enquanto "encontrado" for false.
		// O operador ! significa "negação" (não).
		} while (!encontrado);

}
