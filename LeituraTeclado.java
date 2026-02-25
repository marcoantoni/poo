// Importa a classe Scanner do pacote java.util
// Scanner é usada para fazer leitura de dados pelo teclado
import java.util.Scanner;

class LeituraTeclado{
	
	public static void main (String args[]) {
		
		// Cria um objeto Scanner chamado "sc"
		// System.in indica que a leitura será feita pelo teclado
		Scanner sc = new Scanner(System.in);
		
		// Exibe uma mensagem na tela pedindo o nome
		System.out.printf("Qual o seu nome? \n");
		
		// Lê uma string digitada pelo usuário
		String nome = sc.nextLine();
		
		// Exibe mensagem pedindo a idade
		System.out.printf("Qual sua idade? \n");
		
		// Lê um número inteiro digitado pelo usuário
		int idade = sc.nextInt();
		
		// Exibe mensagem pedindo a altura
		System.out.printf("Qual sua altura? \n");
		
		// Lê um número decimal (float)
		float altura = sc.nextFloat();
		
		// Exibe o nome usando formatação (%s para String)
		System.out.printf("O nome lido foi: %s \n", nome); 
		
		// Exibe a idade usando formatação (%d para inteiro)
		System.out.printf("A idade lida foi: %d \n", idade); 
		
		// Exibe a altura com duas casas decimais (%.2f para float)
		System.out.printf("A altura lida foi: %.2f \n", altura); 
		
		
	}
	
}
