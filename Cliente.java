public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private Data nascimento;
	
	public void setNome(String nome) {
		// Expressão regular para um nome iniciando com letra maiúscula seguida de letras minúsculas
		String regexName = "\\p{Upper}(\\p{Lower}+\\s?)";

		// Um nome completo válido deve conter de 2 a 5 palavras (ex: "João da Silva Souza")
		String patternName = "(" + regexName + "){2,5}";

		// Verifica se o nome atende ao padrão definido
		if (nome.matches(patternName)) {
			this.nome = nome; // Nome válido, armazena no atributo
		} else {
			// Nome inválido, exibe uma mensagem informativa ao usuário
			System.out.println("NOME INVÁLIDO. INSIRA UM NOME NO FORMATO \"Nome Sobrenome\"");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCPF(String cpf){
		
		if (CpfCnpjUtils.isValidCPF(cpf) ){
			this.cpf = cpf;	// cpf válido, salvando no atributo da classe
		} else {
			System.out.printf("CPF inválido \n");
		}
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setNascimento(Data nasc) {
		this.nascimento = nasc;
	}
	
	public Data getNascimento() {
		return nascimento;
	}
	/*
	 * Validação simples, que testa apenas se o endereço tem 10 caracteres
	 */
	public void setEndereco(String endereco) {
		
		if (endereco.length() >= 10){
			this.endereco = endereco;
		} else {
			System.out.printf("Endereço inválido \n");
		}
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	// método construtor
	// vamos definir todos os atributos como obrigatórios
	public Cliente(String nome, String cpf, String endereco, Data dt) {
		setNome(nome);	// chama o método responsável por validar o nome
		setCPF(cpf);
		setEndereco(endereco);
		setNascimento(dt);
	}
	
	/* método para exibir as informações */
	// renomeando o método de toString para imprimir
	// quando uso o nome toString, na hora de chamar o método mostrarExtrato da classe Conta, ele acaba "puxando" as informações daqui
	public String imprimir() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco +
		"\nData de nascimento: " + nascimento.escreverPorExtenso();
	}
}
