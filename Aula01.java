import java.util.Scanner;

public class Aula01{
	
	public static void main (String args[]){
		int idade = 20;
		boolean aprovadoNoTeste = true;
		
		if (idade >= 18)
			System.out.println("Eh maior de idade");
		else 
			System.out.println("Eh menor de idade");
			
		int numero = 1;
		
		if (numero == 1)
			System.out.println("Um");
		else if (numero == 2)
			System.out.println("Dois");
		else if (numero == 3)
			System.out.println("Três");
		else 
			System.out.println("Numero inválido");
			
		// construção acima pode ser realizada usando a estrutura de decisão switch
		switch(numero){
			case 1:
				System.out.println("Um");
				break;
			case 2:
				System.out.println("Dois");
				break;
			case 3:
				System.out.println("Três");
				break;
			default: 
				System.out.println("Numero inválido");
		}

		// if com duas condições
		if (idade >= 18 && aprovadoNoTeste )
			System.out.println("Apto a tirar a CNH");
		else if (idade < 18)
			System.out.println("Não tem idade para tirar a CNH");
		else 
			System.out.println("Reprovado no teste psicológico");
	
		// 1º inicializacao da variavel
		// 2º condicao de saida
		// 3º incremento 
		int i=0;
		for (i=1; i < 10; i++){
			System.out.printf("Executando o laco for pela %d vez\n", i);
		}
	
		// laco de repeticao while
		boolean status = true;
		
		i = 0;
		while (status){
			// executa o laco enquando o status for igual a true
			System.out.printf("Executando o laco while pela %d vez\n", i);
			
			// condicao de saida do laco
			i++;
			if (i == 10)
				//status = false; 
				// outra condicao de saida poderia ser usar o comando break;
				break;
		}
		
		// do while é um laço de repetição com pós validação
		boolean encontrado = false;
		do {
			// comando 
			System.out.printf("Executando o laco do while pela %d vez\n", i);
			i++;
			
			if (i == 11)
				encontrado = true;
		} while (encontrado != true); // pode usar a negacao (!encontrado)
	
		
		// leituras do teclado
		Scanner sc = new Scanner(System.in); 
		
		System.out.printf("Lendo uma string");
		String nome = sc.nextLine();
		
		System.out.printf("Lendo um inteiro");
		
		int num = sc.nextInt();
		
		System.out.printf("Lendo um float");
		float num2 = sc.nextFloat();
	
	}
	
	
}
