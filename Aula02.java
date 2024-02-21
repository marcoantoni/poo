class Aula02 {
	
	public static void main (String args[]){
		/* Exemplo apto a tirar a CNH: 
		 * É preciso atender a dois requisitos:
		 * 1º ser maior de idade
		 * 2º passar no teste psicológico
		 */
		int idade = 17;
		boolean passouNoTeste = true;
		
		// avaliando as duas condições
		if (idade >= 18 && passouNoTeste) {
			System.out.println("Apto a tirar a CNH");
		} else {
			System.out.println("Não apto a tirar a CNH");
		}
		
		// avaliando as condições de maneira isolada, fornecendo mensagens mais claras ao usuário
		if (idade >= 18){
			if (passouNoTeste)
				System.out.println("Apto a tirar a CNH");
			else
				System.out.println("Não apto a tirar a CNH, pois reprovou no teste");
		} else {
			System.out.println("Precisa ser maior de 18 anos");
		}
		
		// exemplo de if aninhado
		int diaSemana = 18;	// 0 domingo 6 - sabado
		
		if (diaSemana == 0)
			System.out.println("Domingo");
		else if (diaSemana == 1)
			System.out.println("Segunda-feira");
		else if (diaSemana == 2)
			System.out.println("Terça-feira");
		else if (diaSemana == 3)
			System.out.println("Quarta-feira");
		else if (diaSemana == 4)
			System.out.println("Quinta-feira");
		else if (diaSemana == 5)
			System.out.println("Sexta-feira");
		else if (diaSemana == 6)
			System.out.println("Sábado");
		else 
			System.out.println("Dia inválido. Somente valores entre 0 e 6 são aceitos");
			
		// exemplo estrutura de decisão switch
		
		switch(diaSemana){
			case 0:
				System.out.println("Domingo");
				break;
			case 1:
				System.out.println("Segunda-feira");
				break;
			case 2: 
				System.out.println("Terça-feira");
				break;
			case 3:
				System.out.println("Quarta-feira");
				break;
			case 4: 
				System.out.println("Quinta-feira");
				break;
			case 5:
				System.out.println("Sexta-feira");
				break;
			case 6: 
				System.out.println("Sabádo");
				break;
			default: 
				System.out.println("Dia inválido. Somente valores entre 0 e 6 são aceitos");
		}
		
		
	}
}
