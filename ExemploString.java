class ExemploString{

	public static void main(String args[]) {

		// criando uma string da forma tradicional
		
		String nome1 = "Leonardo";
		
		String nome2 = new String("LEonardo");	// criando uma string utilizando o construtor da classe string
		
		// ao escrever "Leonardo" vai dizer que é diferente, pois o java testa os endereços de memória
		// esta forma é errada para testar strings
		if (nome1 == nome2) {
			System.out.printf("Os nomes são iguais");
		} else {
			System.out.printf("Os nome são diferentes");
		}
		
		// forma correta de testar uma string: o método equals testa o conteúdo da string e retorna true se for igual
		if (nome1.equals(nome2) ){
			System.out.printf("Os nomes são iguais\n");
		} else {
			System.out.printf("Os nome são diferentes\n");
		}
		
		// testa a string sem diferenciar maiúsculas de minúsculas
		if (nome1.equalsIgnoreCase(nome2) ){
			System.out.printf("Os nomes são iguais\n");
		} else {
			System.out.printf("Os nome são diferentes\n");
		}
		
		// transformando uma string em maiúsculas - o método retorna uma string
		
		System.out.printf("Nome: %s \n", nome1.toUpperCase() );
		
		// transformando uma string em minúsculas - o método retorna uma string
		System.out.printf("Nome: %s \n", nome1. toLowerCase() );
		
		// concatenando uma string
		String nomeCompleto = nome1 + " da Silva    ";
	
		// nomeCompleto com - no lugar do espaço
		// o método replaceAll procura a ocorrencia do primeiro argumento e substitui pelo segundo argumento
		nomeCompleto = nomeCompleto.replaceAll(" ", "-");
		
		System.out.printf("Nome completo: %s \n", nomeCompleto);
		
		// quantos caracteres tem o nome completo?
		System.out.printf("%s tem %d caracteres \n", nomeCompleto, nomeCompleto.length() );
		
		// String nomeCompletoSemEspacosAnormais = nomeCompleto.trim();
		// System.out.printf("%s tem %d caracteres \n", nomeCompletoSemEspacosAnormais, nomeCompletoSemEspacosAnormais.length() );

		// pegando a segunda letra do nome
		// a contagem começa com 0, portanto a segunda letra está na posição 1
		// o método retorna um char, por isso não é possível armazenar em uma string
		char segundaLetra = nome1.charAt(1);
		
		
		System.out.printf("A segunda letra de %s é %s \n", segundaLetra, segundaLetra);
		
		// em qual posição aparece a primeira letra 'E' no nome Leonardo?
		
		System.out.printf("A primeira ocorrencia da letra 'e' em %s é na posição %d \n", nome1, nome1.indexOf("e") );
		
		// em qual posição aparece a última letra "O" no nome Leonardo?
		System.out.printf("A última ocorrencia da letra 'e' em %s é na posição %d \n", nome1, nome1.lastIndexOf("o") );
		
		
		nomeCompleto = "Carolina Mendes Ferreira";
		
		// primeiro nome vai da posição 0 até a ocorrencia do último " "
		String nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" ") );
		
		System.out.printf("Apenas o nome: %s \n", nome);
		
		String ultimoNome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" "), nomeCompleto.length() );

		// último nome vai da ocorrencia do último  " " até a quantidade de caracteres da string
		System.out.printf("Apenas o ultimo nome: %s \n", ultimoNome);

	}
}
