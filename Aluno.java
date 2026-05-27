// Import necessário para leitura de dados via teclado
import java.util.Scanner;

/*
 * A classe Aluno agora HERDA da classe Pessoa através da palavra-chave EXTENDS.
 * 
 * Isso significa que Aluno passa a reutilizar atributos e métodos da superclasse Pessoa,
 * evitando repetição de código.
 * 
 * Com isso, Aluno herda:
 * - nome
 * - cpf
 * - matricula
 * - email
 * - getNome()
 * - getEmail()
 * - setEmail()
 * 
 * A relação de herança representa a ideia de que:
 * "Aluno é uma Pessoa".
 */
public class Aluno extends Pessoa {
	
	/*
	 * Os atributos nome, cpf, email e matricula foram removidos desta classe,
	 * pois agora pertencem à superclasse Pessoa.
	 * 
	 * Essa alteração evita duplicação de código e permite que outras classes,
	 * como Professor, também reutilizem essas informações.
	 */
	
	/*
	 * Encapsulamento:
	 * O atributo curso é privado (private), permitindo acesso apenas
	 * através dos métodos set e get.
	 * 
	 * ALTERAÇÃO:
	 * Antes o curso era armazenado como String.
	 * Agora passou a utilizar códigos numéricos inteiros.
	 * 
	 * Isso ajuda a:
	 * - padronizar valores;
	 * - evitar erros de digitação;
	 * - facilitar validações.
	 */
	private int curso;
	
	/*
	 * Exemplo de composição:
	 * Um aluno possui uma data de nascimento.
	 * 
	 * Em vez de armazenar como String,
	 * utilizamos um objeto da classe Data.
	 */
	private Data nascimento;
	
	// Atributo adicional para telefone
	private String fone;
	
	/*
	 * Atributo estático:
	 * pertence à classe e não aos objetos individualmente.
	 * 
	 * Será utilizado para contar quantos alunos foram criados.
	 */
	private static int qtdAlunos;
	
	/*
	 * Constantes utilizadas para representar os cursos.
	 * 
	 * O uso de static final cria valores fixos,
	 * evitando o uso de números "mágicos" no código.
	 */
	public static final int CURSO_TPG = 1;
	public static final int CURSO_ADS = 2;
	
	/*
	 * Método construtor da classe Aluno.
	 * 
	 * ALTERAÇÃO IMPORTANTE:
	 * As validações de nome, CPF e e-mail não estão mais nesta classe.
	 * 
	 * Essas responsabilidades foram movidas para a superclasse Pessoa,
	 * centralizando as validações em um único local.
	 */
	public Aluno(String nome, String cpf, String email, int cod_curso, Data nasc){
		
		/*
		 * A referência SUPER é utilizada para acessar elementos
		 * da superclasse (classe mãe).
		 * 
		 * Neste caso, super(...) está chamando o construtor
		 * da classe Pessoa.
		 * 
		 * Isso faz com que os atributos herdados:
		 * - nome
		 * - cpf
		 * - email
		 * 
		 * sejam inicializados diretamente pela superclasse.
		 * 
		 * Além disso, todas as validações existentes
		 * no construtor de Pessoa também serão executadas.
		 * 
		 * IMPORTANTE:
		 * A chamada para super(...) deve obrigatoriamente
		 * ser a primeira linha do construtor.
		 * 
		 * Caso exista um construtor na superclasse
		 * que recebe parâmetros, o Java exige que ele
		 * seja chamado antes de qualquer outra instrução.
		 */
		super(nome, cpf, email);
		
		/*
		 * O método setCurso é utilizado para validar e armazenar
		 * o código do curso.
		 */
		setCurso(cod_curso);		
		
		// Armazena a data de nascimento recebida
		this.nascimento = nasc;
		
		// Incrementa o contador de alunos criados
		qtdAlunos++;
	}
	

	/*
	 * Os métodos setEmail() e getEmail() foram removidos desta classe,
	 * pois agora pertencem à superclasse Pessoa.
	 * 
	 * Como Aluno herda de Pessoa,
	 * esses métodos continuam disponíveis normalmente.
	 */
	

	public void setCurso(int curso) {
		
		/* 
		 * Validação do código do curso.
		 * 
		 * Os códigos devem ser positivos.
		 */
		if (curso > 0){
			this.curso = curso;
		} else {
			
			System.out.printf(
				"Código de curso inválido. "
				+ "Verifique com o Setor de Registros Acadêmicos "
				+ "o código correto. \n"
			);
			
			this.curso = 1;
		}
	}
	
	// Método getter do atributo curso
	public int getCurso() {
		return curso;
	}
	
	/*
	 * O método lerTeclado foi comentado temporariamente.
	 * 
	 * O objetivo é demonstrar a diferença entre:
	 * - private
	 * - protected
	 * 
	 * Os atributos herdados da classe Pessoa estão como protected,
	 * permitindo acesso direto dentro da classe Aluno.
	 * 
	 * Caso fossem private,
	 * as linhas abaixo gerariam erro de compilação.
	 */
	
//	public void lerTeclado(){
//		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("Informe o nome do aluno: ");
//		nome = sc.nextLine();
		
//		System.out.printf("Informe o CPF do aluno: ");
//		cpf = sc.nextLine();
		
//		System.out.printf("Informe o e-mail do aluno: ");
//		email = sc.nextLine();
		
//		System.out.printf("Informe a matricula do aluno: ");
//		matricula = sc.nextInt();
		
//		sc.nextLine(); // consome a quebra de linha pendente
		
		/*
		 * ALTERAÇÃO:
		 * O curso agora é lido como inteiro,
		 * utilizando os códigos definidos nas constantes.
		 */
//		System.out.printf("Informe o curso do aluno: ");
//		curso = sc.nextInt();
		
//		sc.nextLine();
		
		/*
		 * Como nascimento passou a ser um objeto Data,
		 * não é possível ler diretamente usando String.
		 * 
		 * Seria necessário:
		 * - ler dia;
		 * - mês;
		 * - ano;
		 * 
		 * e depois criar um objeto Data.
		 */
		
//		System.out.printf("Informe um telefone para contato: ");
//		fone = sc.nextLine();
//	}

	
	/*
	 * Sobrescrita do método toString().
	 * 
	 * Responsável por gerar uma representação textual do objeto.
	 */
	public String toString(){
		
		String saida = "";
		
		/*
		 * Mesmo os atributos estando na superclasse Pessoa,
		 * eles podem ser acessados aqui,
		 * pois foram definidos como protected.
		 * Ainda pode ser acessado através do método (getNome, por exemplo)
		 */
		saida = saida + "Nome: " + nome + "\n";
		saida += "CPF: " + cpf + "\n";
		saida += "E-mail: " + email + "\n";
		saida += "Nº matricula: " + matricula + "\n";
		
		/*
		 * Interpretação dos códigos dos cursos.
		 * 
		 * O código numérico é convertido em texto.
		 */
		if (curso == CURSO_TPG)
			saida += "Curso Superior de Tecnologia em Processos Gerenciais\n";
		else if (curso == CURSO_ADS)
			saida += "Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas\n";
		else 
			saida += "Curso não especificado\n";
		
		/*
		 * Utiliza método da classe Data
		 * para escrever a data formatada.
		 */
		saida += "Data de nascimento: "
			+ nascimento.escreverAbreviado() + "\n";
		
		// Exibe telefone apenas se ele existir
		if (fone != null)
			saida += "Telefone para contato: " + fone + "\n \n";
				
		return saida;
	}
	
	/*
	 * Método estático:
	 * pode ser chamado sem criar objetos da classe.
	 */
	public static String exibirQtdAlunos() {
		return "Atualmente existem "
			+ qtdAlunos
			+ " matriculas na instituição";
	}
	
	public static void main (String args[]) {
		
		/*
		 * ALTERAÇÃO:
		 * Agora é necessário criar um objeto Data
		 * para representar a data de nascimento.
		 */
		Data nascimentoAluno01 = new Data(8, 4, 2005);
		
		/*
		 * Após aplicar encapsulamento na classe Data,
		 * os atributos privados não podem mais ser acessados diretamente.
		 */
		
		// nascimentoAluno01.dia = 35;
		
		
		/*
		 * Para modificar valores,
		 * devemos utilizar métodos SET.
		 */
		nascimentoAluno01.setAno(2002);

		
		/*
		 * Também não é possível acessar diretamente
		 * atributos privados.
		 */
		
		// System.out.printf("%d", nascimentoAluno01.ano);

		
		/*
		 * Para acessar informações,
		 * devemos utilizar métodos GET.
		 */
		System.out.printf(
			"O aluno 1 nasceu no ano de %d \n",
			nascimentoAluno01.getAno()
		);

		
		/*
		 * Criação do primeiro aluno.
		 */
		Aluno al01 = new Aluno(
			"Carlos Augusto",
			"919.960.290-37",
			"carlos@gmail.com",
			Aluno.CURSO_TPG,
			nascimentoAluno01
		);
		
		
		/*
		 * Criação do segundo aluno.
		 * 
		 * Neste caso, o objeto Data é criado diretamente
		 * dentro da chamada do construtor.
		 */
		Aluno al02 = new Aluno(
			"Felipe D.",
			"556.161.350-20",
			"felipe@t",
			Aluno.CURSO_ADS,
			new Data(14, 8, 2009)
		);	
		
		al02.matricula = 202517645;
		
		System.out.printf(al01.toString());
		System.out.printf(al02.toString().toUpperCase());
		
		
		/*
		 * Terceiro aluno.
		 */
		Aluno al03 = new Aluno(
			"Gustavo",
			"315.339.860-70",
			"gustavo@ymail.com",
			Aluno.CURSO_ADS,
			new Data (21, 19, 2006)
		);
		
		al03.matricula = 202518644;
		
		System.out.printf(al03.toString());
		
		
		/*
		 * Chamada de método estático.
		 */
		System.out.printf(Aluno.exibirQtdAlunos());
		
		
		/*
		 * Constantes não podem ser alteradas.
		 * 
		 * A linha abaixo geraria erro de compilação.
		 */
		
		//Aluno.CURSO_TPG = 5;
	}
}
