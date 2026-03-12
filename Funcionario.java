// definição da classe Funcionario
class Funcionario {

	// declaração dos atributos da classe
	// representam as características de um funcionário
	String nome;
	String cpf;
	float salario;
	String cargo;
	
	// método construtor 1
	// é executado automaticamente quando um objeto da classe é criado
	// neste construtor são inicializados apenas os atributos obrigatórios
	public Funcionario(String nome, String cpf, float salario) {
		this.nome = nome;       // atribui ao atributo nome o valor recebido por parâmetro
		this.cpf = cpf;         // atribui ao atributo cpf o valor recebido por parâmetro
		this.salario = salario; // atribui ao atributo salario o valor recebido por parâmetro
		
		System.out.printf("Executando o método construtor 1. Ele inicializa o nome, cpf e o salário \n");
	}
	
	// método construtor 2
	// exemplo de sobrecarga de construtores (mesmo nome, parâmetros diferentes)
	// neste caso também é inicializado o atributo cargo
	public Funcionario(String nome, String cpf, float salario, String cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.cargo = cargo;
		
		System.out.printf("Executando o método construtor 2. Ele inicializa o nome, cpf, salário e o cargo \n");
	}
	
	// método responsável por gerar uma representação em texto do objeto
	// normalmente é utilizado para exibir os dados do objeto
	public String toString() {
		
		// variável que irá armazenar a saída formatada
		String saida = "";
		
		// concatenação das informações do funcionário
		saida += "Nome: " + nome + "\n";
		saida += "CPF: " + cpf + "\n";
		saida += "Salário: " + salario + "\n";
		
		// verifica se o atributo cargo foi definido antes de exibi-lo
		if (cargo != null)
			saida += "Cargo ocupado: " + cargo + "\n";
		
		saida += "------------------------\n";
		
		// retorna a string montada
		return saida;
	}
	
	// método principal da aplicação
	// é o ponto de entrada da execução do programa
	public static void main (String args[]) {
		
		// criação de objetos da classe Funcionario
		// neste caso está sendo utilizado o construtor que recebe 4 parâmetros
		
		Funcionario func1 = new Funcionario("Carlos Augusto", "123.456.653-65", 3208.89f, "Desenvolvedor front end");
		
		Funcionario func2 = new Funcionario("Patricia", "764.345.345-44", 6210.89f, "Desenvolvedora back end");
		
		Funcionario func3 = new Funcionario("Ana", "123.375.345-33", 2210.89f, "Secretária");
		
		// chamada do método toString() para exibir os dados de cada objeto
		
		System.out.printf(func1.toString() );
		System.out.printf(func2.toString() );
		System.out.printf(func3.toString() );
	}
}
