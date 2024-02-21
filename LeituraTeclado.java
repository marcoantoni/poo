import java.util.Scanner; // importa a classe Scanner para poder ler do teclado

class LeituraTeclado{
	
	public static void main(String args[]) {
		
		// criando uma instancia da classe scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		
		String nome = sc.nextLine(); // // lendo um string
		
		System.out.println("O nome lido foi: " + nome);
		
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt(); // lendo um int
		
		System.out.println("A idade lida foi: " + idade);
		
		System.out.println("Informe seu peso: ");
		float peso = sc.nextFloat();	// lendo um float
		System.out.println("O peso lido foi: " + peso);
		
		
	}
}
