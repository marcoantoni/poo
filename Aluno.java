// Import necessário para leitura de dados via teclado
import java.util.Scanner;

public class Aluno {
	// Atributos da classe que representam os dados do aluno
	String nome;
	String cpf;
	String email;
	int matricula;
	String curso;
	String nascimento;
	String fone; // atributo adicional para telefone
	
	// Atributo estático para contabilizar quantos objetos Aluno foram criados
	// Pertence à classe, e não a uma instância específica
	static int qtdAlunos;
	
	// Método construtor: executado automaticamente ao criar um objeto
	// Responsável por inicializar os atributos e validar os dados recebidos
	public Aluno(String nome, String cpf, String email){
		
		// Validação do nome: deve possuir mais de 5 caracteres
		if (nome.length() > 5) {
			this.nome = nome; // atribui o valor ao atributo da classe
		} else {
			System.out.printf("O nome %s é invalidado, pois tem menos de 5 letras \n", nome);
			this.nome = "Nome não informado";
		}
		
		// Validação do CPF utilizando método externo da classe CpfCnpjUtils
		if (CpfCnpjUtils.isValidCPF(cpf)){
			this.cpf = cpf;
		} else {
			System.out.printf("O CPF %s é inválido. Verifique a informação \n", cpf);
			this.cpf = "";
		}
		
		// Validação simples do e-mail (tamanho mínimo)
		if (email.length() > 8) {
			this.email = email;
		} else {
			System.out.printf("O e-mail %s é inválido\n", email);
			this.email = "";
		}
		
		// Incrementa o contador de alunos a cada nova instância criada
		qtdAlunos++;
	}
	
	// Método responsável por ler os dados do aluno via teclado
	// Não possui retorno (void)
	public void lerTeclado(){
		// Instancia o objeto Scanner para leitura de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o nome do aluno: ");
		nome = sc.nextLine();
		
		System.out.printf("Informe o CPF do aluno: ");
		cpf = sc.nextLine();
		
		System.out.printf("Informe o e-mail do aluno: ");
		email = sc.nextLine();
		
		System.out.printf("Informe a matricula do aluno: ");
		matricula = sc.nextInt();
		
		// Consome a quebra de linha pendente do nextInt()
		sc.nextLine();
		
		System.out.printf("Informe o curso do aluno: ");
		curso = sc.nextLine();
		
		System.out.printf("Informe a data de nascimento: ");
		nascimento = sc.nextLine();
		
		System.out.printf("Informe um telefone para contato: ");
		fone = sc.nextLine();
	}
	
	// Sobrescrita do método toString()
	// Retorna uma String com todos os dados do aluno formatados
	public String toString(){
		String saida = ""; // variável acumuladora
		
		// Concatenação dos atributos para montagem da saída
		saida = saida + "Nome: " + nome + "\n";
		saida += "CPF: " + cpf + "\n";
		saida += "E-mail: " + email + "\n";
		saida += "Nº matricula: " + matricula + "\n";
		saida += "Curso: " + curso + "\n";
		saida += "Data de nascimento: " + nascimento + "\n";
		
		// Exibe o telefone apenas se ele tiver sido informado
		if (fone != null)
			saida += "Telefone para contato: " + fone + "\n \n";
				
		return saida;
	}
	
	// Método estático para exibir a quantidade total de alunos criados
	// Pode ser chamado sem instanciar a classe
	public static String exibirQtdAlunos() {
		return "Atualmente existem " + qtdAlunos + " matriculas na instituição";
	}
	
	// Exemplo de método inválido (comentado):
	// Métodos estáticos não podem acessar atributos não estáticos diretamente
	/*public static String exibirNomeAluno(){
		return "Nome: " + nome;
	}*/
	
	public static void main (String args[]) {
		
		// Criação do primeiro objeto Aluno (instanciação)
		Aluno al01 = new Aluno("Carlos", "919.960.290-37", "carlos@gmail.com");
		
		// A leitura via teclado foi desativada para evitar digitação repetitiva
		// al01.lerTeclado();
		
		// Atribuição manual de alguns atributos
		al01.curso = "TADS";
		
		// Criação do segundo aluno
		Aluno al02 = new Aluno("Felipe D.", "556.161.350-20", "felipe@t");	
		
		al02.matricula = 202517645;
		al02.curso = "TADS";
		
		// Leitura do teclado também desativada para o segundo aluno
		// al02.lerTeclado();
		
		// Exibição dos dados dos alunos
		System.out.printf(al01.toString());
		
		// Exibe os dados em letras maiúsculas
		System.out.printf(al02.toString().toUpperCase());
		
		// Criação de um terceiro aluno
		Aluno al03 = new Aluno("Gustavo", "315.339.860-70", "gustavo@ymail.com");
		
		al03.matricula = 202518644;
		al03.curso = "TADS";
		
		System.out.printf(al03.toString());
		
		// Exibição da quantidade total de alunos criados (atributo estático)
		System.out.printf(Aluno.exibirQtdAlunos());
	}
}
