// Import necessário para leitura de dados via teclado
import java.util.Scanner;

public class Aluno {
	// Atributos da classe que representam os dados do aluno
	String nome;
	String cpf;
	String email;
	int matricula;
	
	// ALTERAÇÃO: o atributo curso deixou de ser String e passou a ser int
	// Agora ele armazena um código numérico que representa o curso
	// Isso permite padronizar valores e evitar erros de digitação
	int curso;
	
	String nascimento;
	String fone; // atributo adicional para telefone
	
	// Atributo estático para contabilizar quantos objetos Aluno foram criados
	// Pertence à classe, e não a uma instância específica
	static int qtdAlunos;
	
	// ALTERAÇÃO: criação de constantes para representar os cursos
	// O uso de "static final" define valores fixos (constantes)
	// Isso evita o uso de números "mágicos" no código (ex: curso == 1)
	static final int CURSO_TPG = 1;
	static final int CURSO_ADS = 2;
	
	// Método construtor: executado automaticamente ao criar um objeto
	// ALTERAÇÃO: agora recebe também o código do curso como parâmetro
	public Aluno(String nome, String cpf, String email, int cod_curso){
		
		// Validação do nome: deve possuir mais de 5 caracteres
		if (nome.length() > 5) {
			this.nome = nome;
		} else {
			System.out.printf("O nome %s é invalidado, pois tem menos de 5 letras \n", nome);
			this.nome = "Nome não informado";
		}
		
		// ALTERAÇÃO: atribuição direta do curso a partir do código recebido
		// Neste momento não há validação, assumindo que o valor informado é válido
		this.curso = cod_curso;
		
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
	public void lerTeclado(){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o nome do aluno: ");
		nome = sc.nextLine();
		
		System.out.printf("Informe o CPF do aluno: ");
		cpf = sc.nextLine();
		
		System.out.printf("Informe o e-mail do aluno: ");
		email = sc.nextLine();
		
		System.out.printf("Informe a matricula do aluno: ");
		matricula = sc.nextInt();
		
		sc.nextLine(); // consome a quebra de linha pendente
		
		// ALTERAÇÃO: leitura do curso agora é feita como número inteiro
		// O usuário deve informar um dos códigos definidos nas constantes
		System.out.printf("Informe o curso do aluno: ");
		curso = sc.nextInt();
		
		sc.nextLine(); // consome a quebra de linha pendente
		
		System.out.printf("Informe a data de nascimento: ");
		nascimento = sc.nextLine();
		
		System.out.printf("Informe um telefone para contato: ");
		fone = sc.nextLine();
	}
	
	// Sobrescrita do método toString()
	public String toString(){
		String saida = "";
		
		saida = saida + "Nome: " + nome + "\n";
		saida += "CPF: " + cpf + "\n";
		saida += "E-mail: " + email + "\n";
		saida += "Nº matricula: " + matricula + "\n";
		
		// ALTERAÇÃO: interpretação do código do curso para exibição textual
		// Em vez de imprimir o número, o código é traduzido para o nome do curso
		// O uso das constantes torna a leitura mais clara e evita erros
		if (curso == CURSO_TPG)
			saida += "Curso Superior de Tecnologia em Processos Gerenciais\n";
		else if (curso == CURSO_ADS)
			saida += "Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas\n";
		else 
			saida += "Curso não especificado\n";
		
		saida += "Data de nascimento: " + nascimento + "\n";
		
		if (fone != null)
			saida += "Telefone para contato: " + fone + "\n \n";
				
		return saida;
	}
	
	// Método estático para exibir a quantidade total de alunos criados
	public static String exibirQtdAlunos() {
		return "Atualmente existem " + qtdAlunos + " matriculas na instituição";
	}
	
	public static void main (String args[]) {
		
		// ALTERAÇÃO: ao criar o aluno, agora é necessário informar o curso
		// utilizando as constantes definidas na classe
		Aluno al01 = new Aluno("Carlos", "919.960.290-37", "carlos@gmail.com", Aluno.CURSO_TPG);
		
		// Criação do segundo aluno com outro curso
		Aluno al02 = new Aluno("Felipe D.", "556.161.350-20", "felipe@t", Aluno.CURSO_ADS);	
		
		al02.matricula = 202517645;
		
		System.out.printf(al01.toString());
		System.out.printf(al02.toString().toUpperCase());
		
		// Terceiro aluno também utilizando constante
		Aluno al03 = new Aluno("Gustavo", "315.339.860-70", "gustavo@ymail.com", Aluno.CURSO_ADS);
		
		al03.matricula = 202518644;
		
		System.out.printf(al03.toString());
		
		System.out.printf(Aluno.exibirQtdAlunos());
		
		// IMPORTANTE: constantes não podem ser alteradas
		// A linha abaixo geraria erro de compilação
		//Aluno.CURSO_TPG = 5;
	}
}
