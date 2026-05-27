public class Pessoa {
	
	/*
	 * Atributos protegidos (protected), permitindo que classes filhas,
	 * como Aluno e Professor, possam acessar diretamente esses dados.
	 * 
	 * Esses atributos foram movidos da classe Aluno para a superclasse Pessoa,
	 * evitando repetição de código e permitindo reutilização por outras classes.
	 */
	protected String nome;
	protected String cpf;
	protected int matricula;
	protected String email;
	
	/*
	 * Construtor da classe Pessoa.
	 * 
	 * Este código foi reaproveitado da antiga classe Aluno,
	 * pois agora a responsabilidade de inicializar os dados comuns
	 * pertence à superclasse Pessoa.
	 * 
	 * Dessa forma, tanto Aluno quanto Professor poderão utilizar
	 * este construtor através da herança.
	 */
	public Pessoa(String nome, String cpf, String email){
		
		/* 
		 * Expressão regular utilizada para validar o nome.
		 * 
		 * A validação exige:
		 * - pelo menos duas partes separadas por espaço;
		 * - apenas letras, incluindo letras acentuadas.
		 * 
		 * A validação anterior considerava apenas quantidade mínima
		 * de caracteres, permitindo nomes como "Carlos", que possuem
		 * apenas uma palavra.
		 * 
		 * Exemplos:
		 * - "Carlos" → inválido
		 * - "Felipe D." → inválido
		 * - "Felipe Santos" → válido
		 */
		String regex = "^[\\p{L}]+( [\\p{L}]+)+$";

		// Verifica se o nome não é nulo e se atende ao padrão da expressão regular
		if (nome != null && nome.matches(regex) ) {
			
			// Armazena o nome no atributo da classe
			this.nome = nome;
			
		} else {
			
			// Exibe mensagem caso o nome seja inválido
			System.out.printf(
				"O nome %s é invalidado, pois deve ter no mínimo duas partes \n",
				nome
			);
			
			// Define valor padrão para evitar atributo vazio
			this.nome = "Nome não informado";
		}
		
		/*
		 * Validação do CPF utilizando método externo.
		 * 
		 * A responsabilidade da validação foi delegada para outra classe,
		 * melhorando a organização e reutilização do código.
		 */
		if (CpfCnpjUtils.isValidCPF(cpf)){
			
			// CPF válido
			this.cpf = cpf;
			
		} else {
			
			// CPF inválido
			System.out.printf(
				"O CPF %s é inválido. Verifique a informação \n",
				cpf
			);
			
			// Define valor vazio em caso de erro
			this.cpf = "";
		}
		
		/*
		 * Chama o método setEmail para reaproveitar a validação
		 * já existente para o atributo email.
		 */
		setEmail(email);
		
	}
	
	/*
	 * Método responsável por alterar o e-mail.
	 * 
	 * A validação atual verifica apenas o tamanho mínimo da String.
	 */
	public void setEmail(String email) {
		
		// Verifica se o e-mail possui tamanho mínimo aceitável
		if (email.length() > 8) {
			
			// E-mail considerado válido
			this.email = email;
			
		} else {
			
			// E-mail inválido
			System.out.printf("O e-mail %s é inválido\n", email);
			
			// Define valor vazio
			this.email = "";
		}
	}
	
	/*
	 * Método getter responsável por retornar o e-mail.
	 */
	public String getEmail() {
		return email;
	}
	
	/*
	 * Método getter responsável por retornar o nome.
	 */
	public String getNome() {
		return nome;
	}

}
