// Exemplos de manipulação de Strings
public class ExemploString {
	
	public static void main (String[] args) {
		char sexo = 'm';	// tipo char sempre é declarado com aspas simples;
		
		System.out.printf("Sexo %s", sexo);
		
		// tipo char pode ser inicializado com um inteiro, que representa o codigo da tabela ascii
		char letra = 70; 
		
		System.out.printf("Letra %s", letra);
		
		String nome1 = "Marco";
		String nome2 = "marco";
		String nome3 = new String("marco");	// outra forma de declarar uma string
		
		// == é forma apropriada para comparar tipos primitivos
		if (nome1 == nome2)
			System.out.printf("São iguais\n");
		else
			System.out.printf("São diferentes\n");
			
		//vai mostrar "São diferentes", pois é falta a comparação dos endereços de memória, que são diferentes
		if (nome1 == nome3)
			System.out.printf("São iguais\n");
		else
			System.out.printf("São diferentes\n");
			
		// comparacao de strings
		// forma correta
		if (nome1.equals(nome3))
			System.out.printf("São iguais\n");
		else
			System.out.printf("São diferentes\n");
		
		
		// retornam um boolean
		System.out.printf("%s é igual a %s - %s\n", nome1, nome3, nome1.equals(nome3) );
		System.out.printf("%s é igual a %s - %s\n", nome1, nome3, nome1.equalsIgnoreCase(nome3) );
		
		// retornam um int
		System.out.printf("%s é igual a %s - %d\n", nome1, nome3, nome1.compareTo(nome3) );
		System.out.printf("%s é igual a %s - %d\n", nome1, nome3, nome1.compareToIgnoreCase(nome3) );
	
		/* outros métodos para manipular strings */
		
		String nomeCompleto = "rodrigo MacHado";
		
		System.out.printf("%s \n", nomeCompleto);
		
		// transformando a string em MAIUSCULAS
		System.out.printf("%s \n", nomeCompleto.toUpperCase() );
		
		//transformando a string em minúsculas
		System.out.printf("%s \n", nomeCompleto.toLowerCase() );
		
		// substituição de caracter
		System.out.printf("%s \n", nomeCompleto.replace(" ", "-") );
		
		// quantidade de caracteres da string
		System.out.printf("%d \n", nomeCompleto.length() );
		
		// pegando a letra de uma posicao da string
		System.out.printf("%s \n", nomeCompleto.charAt(14) );
		
		// posicao da primeira ocorrencia de uma letra
		System.out.printf("A primeira ocorrencia da letra está na posicao %d \n", nomeCompleto.indexOf("d") );
		
		System.out.printf("A primeira ocorrencia da letra está na posicao %d \n", nomeCompleto.lastIndexOf("o") );
		
		// primeiro nome
		String nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" ") );
		
		System.out.printf("Primeiro nome: %s \n", nome);
		
		// ultimo nome
		String sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ")+1, nomeCompleto.length() );
		System.out.printf("Último nome: %s \n", sobrenome);
		
		// convertendo a primeira letra para maiusculo
		String primeiraLetra = nomeCompleto.substring(0, 1).toUpperCase() + nomeCompleto.substring(1);
		System.out.printf("Primeira letra: %s \n", primeiraLetra);
		
		// Dica para resolver o exercicio 5
		char caracter = '8';
		
		int numero = Character.getNumericValue(caracter);
		
		System.out.printf("Numero: %d \n", numero);
		
	}
}

