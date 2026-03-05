// import para ler do teclado
import java.util.Scanner;

public class Aluno {
	// declarando os atributos da classe
	String nome;
	String cpf;
	String email;
	int matricula;
	String curso;
	String nascimento;
	// acrescentando +1 atributo
	String fone;
	
	// criando um método para fazer a leitura do teclado
	// o método do tipo void não tem retorno 
	public void lerTeclado(){
		// criando uma instancia da classe Scanner, para poder 
		// fazer a leitura do teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o nome do aluno: ");
		nome = sc.nextLine();
		
		System.out.printf("Informe o CPF do aluno: ");
		cpf = sc.nextLine();
		
		System.out.printf("Informe o e-mail do aluno: ");
		email = sc.nextLine();
		
		System.out.printf("Informe a matricula do aluno: ");
		matricula = sc.nextInt();
		
		// colocando um sc.nextLine() para não pular a leitura do curso
		sc.nextLine();
		
		System.out.printf("Informe o curso do aluno: ");
		curso = sc.nextLine();
		
		System.out.printf("Informe a data de nascimento: ");
		nascimento = sc.nextLine();
		
		System.out.printf("Informe um telefone para contato: ");
		fone = sc.nextLine();
	}
	
	// criando um método para mostrar as inforamções do Aluno
	public String toString(){
		String saida = "";	// as variaveis precisam ser inicializadas
		
		// contatenar o valor dos atributos na variavel saída
		// o objetivo é retornar uma string que contém todas as informações a serem exibidas
		saida = saida + "Nome: " + nome + "\n";
		
		// outra forma de concatenar
		saida += "CPF: " + cpf + "\n";
		saida += "E-mail: " + email + "\n";
		saida += "Nº matricula: " + matricula + "\n";
		saida += "Curso: " + curso + "\n";
		saida += "Data de nascimento: " + nascimento + "\n";
		
		// exibindo o atributo recem adicionado
		
		if (fone != null)
			saida += "Telefone para contato: " + fone + "\n \n";
				
		return saida;
	}
	
	public static void main (String args[]) {
		
		// criando um instancia/objeto da classe Aluno
		Aluno al01 = new Aluno();	// o operador new é responsável por instanciar o objeto
		// o operador ponto permite acessar os atributos da classe
		
		// comentando as linhas de inicialização dos atributos, pois a leitura será feita do teclado
		// através do método lerTeclado
		
		al01.lerTeclado();
		
		/*al01.nome = "Carlos";
		al01.cpf = "123.456.789.10";
		al01.email = "carlos@gmail.com";
		//al01.matricula = 202512345;
		al01.curso = "TADS";
		*/
		
		// criando um segundo aluno
		Aluno al02 = new Aluno();
		
		/*
		al02.nome= "Felipe D.";
		al02.cpf = "987.654.123-84";
		al02.email = "felipe@ymail.com";
		al02.matricula = 202517645;
		al02.curso = "TADS";
		*/
		
		// lendo os dados dos segundo aluno do teclado
		al02.lerTeclado();
		
		// para acessar os dados de um objeto, sempre é necessário
		// especifica-lo antes do ponto
		// o operador . é usado para acessar atributos e métodos
		
		System.out.printf(al01.toString());
		
		System.out.printf(al02.toString().toUpperCase() );
		
	}
	
	
}
