import java.util.Scanner; 

class ExemploString {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("O que você deseja: C para continuar P para parar");
		String opcao =  sc.nextLine();
		
		// desse jeito ao escolher a letra 'c' vai cair no else. Vamos compreender as formas de testar as strings
		if (opcao == "c")
			System.out.printf("Escolheu a letra C \n");
		else
			System.out.printf("Escolheu outra letra \n");
			
		String nome1 = "flavio";
		String nome2 = "flavio";
		String nome3 = new String("flavio");	// outra forma de criar a string
		
		// mostrando os 3 nomes
		System.out.printf("nome1: %s \n", nome1);
		System.out.printf("nome2: %s \n", nome2);
		System.out.printf("nome3: %s \n", nome3);
		
		if (nome1 == nome2) {
			System.out.printf("Os nomes são iguais \n");	// vai dizer que são iguais
		} else {
			System.out.printf("Os nomes são diferentes \n");
		}
		
		// vai dizer que são diferentes, pois quando se compara objetos, o java testa se os endereços de memória são iguais
		if (nome1 == nome3) {
			System.out.printf("Os nomes são iguais \n");
		} else {
			System.out.printf("Os nomes são diferentes \n");	
		}
		
		// a forma correta de comparar uma string com a outra é utilizando o método equals. Ele retorna true se as strings forem iguais
		
		if (nome1.equals(nome3) ) {
			System.out.printf("%s - %s. Os nomes são iguais \n" , nome1, nome3);
		} else {
			System.out.printf("%s - %s. Os nomes são diferentes \n" , nome1, nome3);
		}
		
		// testa a string sem diferenciar maiúsculas de minúsculas
		if (nome1.equalsIgnoreCase(nome3) ) {
			System.out.printf("%s - %s. Os nomes são iguais \n" , nome1, nome3);
		} else {
			System.out.printf("%s - %s. Os nomes são diferentes \n" , nome1, nome3);
		}
		
		// para pegar um caractere de um string, usa-se o método charAt, passando como parametro a posição do caractere
		
		char op = opcao.charAt(0);	// pega o 1º (a contagem começa em 0) caractere da variavel opcao
		
		System.out.printf("A opção escolhida foi: %s \n", op );
		
		// testando dessa forma, ao digitar a letra 'c' vai a primeira mensagem
		if (op == 'c')
			System.out.printf("Escolheu a letra C \n");
		else
			System.out.printf("Escolheu outra letra \n");
		
		
		
		System.out.printf("%s == %s - %s \n", nome1, nome2, nome1.equals(nome2) );
		System.out.printf("%s == %s - %s \n", nome1, nome2, nome1.equalsIgnoreCase(nome2) );	
		
		// compareTo vai retornar a diferença entre duas strings, conforme o código da tabela ASCII
		System.out.printf("Diferença: %d \n", nome1.compareTo(nome3) );
	
		
		// converte uma string para minúsculas. retorna uma string.
		System.out.printf("nome2 em minúsculas: %s \n", nome2.toLowerCase() );

		// converte uma string para maiúsculas.retorna uma string.
		System.out.printf("nome2 em maiúsculas: %s \n", nome2.toUpperCase() );
		
		// conta a quantiidade de caracteres de uma string. retorna um número inteiro.
		System.out.printf("nome2 tem %d caracteres \n", nome2.length() ); 
		
		// indexOf retorna a posição em que um caractere aparece pela primeira vez na string.  
		System.out.printf("A primeira ocorrencia da letra 'a' no nome2 (%s) é na posição %d", nome2, nome2.indexOf("a") );

		// lastIndexOf retorna a posição em que um caractere aparece pela última vez na string. 	
		System.out.printf("A última ocorrencia da letra 'a' no nome2 (%s) é na posição %d", nome2, nome2.lastIndexOf("a") );
		
		// replaceAll substitui um caractere por outro dentro de uma string. retorna uma string.
		System.out.printf("Substituindo a letra 'a' por 'x' em nome2(%s) -> %s \n", nome2, nome2.replaceAll("a", "x") ); 
	
		String nomeCompleto = "carlos augusto da silva";
		
		// o método substring permite recortar uma string. Alguns exemplos: 
		
		// convertendo a primeira letra para maiusculas: recorte da posição 0 até a 1 e transforma em maiúscula. Depois concatena o resto da string (posição 1 em diante) 
		String primeiraLetra = nomeCompleto.substring(0, 1).toUpperCase() +  nomeCompleto.substring(1);
		
		System.out.printf("Nome completo: %s \n", primeiraLetra);
		
		// primeiro nome vai da posição 0 até a ocorrencia do primeiro espaço em branco
		String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" ") );
	
		System.out.printf("Primeiro nome: %s \n", primeiroNome);
		
		// o sobrenome é o próximo (+1) caracter depois do último espaço em branco " ", que vai até o ultimo caractere da string
		String sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ")+1, nomeCompleto.length() );
		System.out.printf("Último nome: %s \n", sobrenome);
	
		char caractere = 32; // criando um caractere usando o código da tabela ascci
		System.out.printf("Caractere: %s ", caractere);
		
		System.out.printf("Mostrando a tabela ASCCI por completo\n");
		
		for (int i=0; i<255; i++) {
			char c = (char)i;	// necessário fazer o cast para que a compilação funcione. se remover o char, o código não compila
			System.out.printf("%d = %s \n", i, c);
			
		}
	
	}

}
