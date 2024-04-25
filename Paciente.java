class Paciente {
	// atributos da classe - também chamados de variaveis de instancia
	String nome;
	String endereco;
	Data nascimento;	// exemplo de composição: criando um atributo do tipo Data
	String cpf;
	String prontuario;
	
	// cria um método para gravar as informações no atributos (inicializar os dados)
	// o método retornar algo (int) é apenas para reforçar o exemplo da comunicação através da troca de mensagens
	public int cadastrarPaciente(String nome_p, String end, Data nasc, String cpf_p){
		// testa se o nome está em branco
		if (nome_p == ""){
			return 0; // codigo para representar erro
		} else {
			// gravando o parametro nome_p no atributo nome
			nome = nome_p;
		}
		
		endereco = end;
		nascimento = nasc;
		cpf = cpf_p;
		
		return 1; // codigo para representar sucesso
	}
	
	// mostra as inforamções gravadas no atributos da classe
	public void mostrarProntuario(){
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Endereço: %s \n", endereco);
		// como nascimento é do tipo Data, torna-se possível acessar os atributos e métodos da classe
		System.out.printf("Nascimento: %s \n", nascimento.escreverPorExtenso() );
		System.out.printf("Cpf: %s \n", cpf);
		System.out.printf("Prontuário: %s \n", prontuario);
	
	}
	
	// altera o endereço (atributo da classe)
	public void alterarEndereco(String end){
		if (end == "")
			System.out.printf("Por favor, verifique se o endereço está correto\n");
		else
			endereco = end;
	}
	
	// adiciona informações ao prontuario, sem excluir as existencias
	public void adicionarInfoProntuario(String info) {		
		prontuario += info + "\n";
	}
	
	public static void main(String args[]){
		
		// cria uma instancia da classe (um novo objeto) do tipo Paciente
		Paciente pac1 = new Paciente();
		
		// cria uma instancia da classe data para passar como parametro na linha abaixo
		Data dt1 = new Data(15, 5, 1997);
		
		// cria uma variavel que armazena o código retornado pelo método cadastrarPaciente, que será executado utilizando os parametros que foram passados
		int cod = pac1.cadastrarPaciente("Lucas", "Rua Frederico A. Timmem - Rolante/RS", dt1, "029.567.738-88");

		// testa o código de erro para mostrar uma mensagem
		if (cod  == 1 )
			System.out.printf("Paciente cadastrado com sucesso\n");
		else
			System.out.printf("Houve um erro ao cadastrar o paciente \n");

		// altera o endereço através da chamado ao método
		pac1.alterarEndereco("Igrejinha/RS");
		
		
		// adicionando informações da consulta
		pac1.adicionarInfoProntuario("O paciente chegou na consulta sentindo dores de cabeça. Foi receitado diporona.");
		
		pac1.adicionarInfoProntuario("Após dois dias, o paciente retornando com os mesmos sintomas. Foi solicitado um exame específico");
		pac1.mostrarProntuario();
			
		Paciente pac2 = new Paciente();
		
		// na linha abaixo, new Data(14, 4, 1995) cria uma instancia da classe sem armazenar em uma variavel
		pac2.cadastrarPaciente("Bruna", "Parobé", new Data(14, 4, 1995), "089.557.768-98");
		
		
		pac2.mostrarProntuario();
		
		
	}

}
