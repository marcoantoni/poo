import java.util.Scanner;

// Import necessário para gerar números aleatórios
import java.util.Random;

class Aula5 {
	
	public static void main (String args[]) {
		
		int num1 = 25;
		
		// Forma antiga (em desuso) de instanciar um objeto Integer
		//Integer num2 = new Integer(25);
		
		// Forma atual recomendada para criar um objeto Integer
		Integer num2 = Integer.valueOf(25);
		
		// Comparação entre tipo primitivo (int) e objeto (Integer)
		// O Java faz "unboxing" automaticamente (converte Integer para int)
		if (num1 == num2)
			System.out.printf("São iguais \n");
		else
			System.out.printf("São diferentes \n");
	
		// Criando outro objeto Integer com o mesmo valor
		Integer num3 = Integer.valueOf(25);
		
		// Comparação com == entre objetos faz com que seja comparada o endereço de memória
		// Irá dizer que são diferentes
		if (num2 == num3)
			System.out.printf("São iguais \n");
		else
			System.out.printf("São diferentes \n");
			
		// Comparação correta de conteúdo entre objetos Integer
		if (num2.equals(num3) )
			System.out.printf("São iguais \n");
		else
			System.out.printf("São diferentes \n");
			
		String nome = "Jonas";
		
		System.out.printf("Informe o nome \n");
		
		// Objeto para leitura de dados do teclado
		Scanner sc = new Scanner(System.in);
		String nomeLido = sc.nextLine();
		
		// Comparação incorreta de Strings (compara referência de memória)
		// por mais que se digite "Jonas", sempre dirá que são diferentes
		if (nome == nomeLido )
			System.out.printf("Os nomes são iguais \n");
		else
			System.out.printf("Os nomes são diferentes \n");
		
		// existência de um número armazenado dentro de uma string
		String nascimento = "1993";
		
		// Convertendo String para inteiro
		int anoNasc = Integer.parseInt(nascimento);
		
		// Calculando idade com base no ano atual
		int idade = 2026 - anoNasc;
		
		System.out.printf("Passaram se %d anos entre as duas datas \n", idade);
		
		// Exemplo de concatenação de Strings com operador +
		//nome = nome + " Augusto";
		
		System.out.printf("Nome: %s \n", nome);
		
		// Forma correta de comparar Strings (compara conteúdo)
		if (nome.equals(nomeLido) )
			System.out.printf("Os nomes são iguais \n");
		else
			System.out.printf("Os nomes são diferentes \n");
			
		// Comparação ignorando letras maiúsculas e minúsculas
		System.out.printf("%s é igual %s? %s \n", 
			nome, nomeLido, nome.equalsIgnoreCase(nomeLido) );
			
		// Métodos que retornam novas Strings convertidas
		
		// Convertendo para maiúsculas
		System.out.printf("Nome em maiúsculas: %s \n", nome.toUpperCase() );
		
		// Convertendo para minúsculas
		System.out.printf("Nome em minúsculas: %s \n", nome.toLowerCase() );
		
		// Criando uma frase
		String frase = "Hoje deu muita chuva com ventos em Rolante";
		
		// Exibindo frase original
		System.out.printf("Frase original: %s \n", frase);
		
		// Substituindo todas as letras "a" por "Z". O replaceAll retorna uma nova string
		System.out.printf("Frase modificada: %s \n", frase.replaceAll("a", "Z") );
		
		// Retorna o tamanho da String (quantidade de caracteres) 
		System.out.printf("A frase: %s tem %d letras \n", frase, frase.length() );
		
		// Retorna a posição da primeira ocorrência da letra "e"
		System.out.printf("A primeira letra e na frase %s está na posição %d \n", 
			frase, frase.indexOf("e") );
			
		// Retorna a posição da última ocorrência da letra "a"
		System.out.printf("A última letra na frase %s está na posição %d \n", 
			frase, frase.lastIndexOf("a") );
			
		// Retorna o caractere na posição 3 (quarta posição, pois começa em 0)
		System.out.printf("A quarta letra na frase %s é %s \n", frase, frase.charAt(3) );
		
		String nomeCompleto = "Ricardo Augusto Borges";
		
		// Usando o substring para fazer recortes
		
		// Extraindo o primeiro nome (primeira letra - posição zero até o primeiro " "
		String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" ") );
		
		System.out.printf("O primeiro nome é %s \n", primeiroNome);
		
		// Extraindo o sobrenome (após o último espaço)
		String sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ")+1, nomeCompleto.length() );
		
		System.out.printf("Sobrenome: %s \n", sobrenome);
		
		// Exemplo de geração de números aleatórios
		
		// Criando objeto da classe Random
		Random gerador = new Random();
		
		// Gera número aleatório entre 0 (inclusive) e 500 (exclusive)
		int numAleatorio = gerador.nextInt(500);
		
		// Exibe o número gerado
		System.out.printf("O numero aleatório gerado foi %d \n", numAleatorio);
		
		// Gera número aleatório entre -5 (inclusive) e 5 (exclusive)
		numAleatorio = gerador.nextInt(-5, 5);
		
		// Exibe o número gerado dentro do intervalo definido
		System.out.printf("O numero aleatório gerado foi %d \n", numAleatorio);
		
	}

}
