class Data {
	
	// Declaração dos atributos que representam uma data
	int dia;
	int mes;
	int ano;
	
	/* 
	 * Método construtor da classe.
	 * O construtor é um método especial que é chamado automaticamente
	 * quando um objeto da classe é criado.
	 * 
	 * Ao utilizar o operador "new", o Java executa o construtor da classe.
	 * 
	 * O construtor normalmente é usado para inicializar os atributos
	 * do objeto e garantir que ele seja criado com valores válidos.
	 * 
	 * Por ser um método especial, ele:
	 * - não possui tipo de retorno
	 * - possui obrigatoriamente o mesmo nome da classe
	 */
	
	public Data (int dia, int mes, int ano) {
		
		// "this" é utilizado para se referir ao atributo da própria classe,
		// resolvendo a ambiguidade entre os nomes dos atributos e dos parâmetros
		
		// As três linhas abaixo armazenam nos atributos da classe
		// os valores recebidos como parâmetros do construtor
		this.dia = dia;	
		this.mes = mes;
		this.ano = ano;
		
	}
	
	// Sobrecarga de método (overload)
	// Ocorre quando existem métodos com o mesmo nome,
	// mas com assinaturas diferentes (quantidade ou tipo de parâmetros).
	public Data (int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}
	
	// Método que retorna a data no formato de texto
	public String toString(){
		
		// Tratando o caso em que o ano não foi informado
		if (ano == 0)
			return dia + "/" + mes;
		
		// Retorno padrão (quando o ano foi informado)
		return dia + "/" + mes + "/" + ano;
	}
	
	public static void main (String args[]) {
		
		// Criando uma instância (objeto) da classe Data
		Data hoje = new Data(15, 4, 2026);
		
		// Exibindo a data no console.
		// Como o método toString() retorna uma String,
		// podemos passá-la diretamente para o printf
		
		// Exemplo de atribuição direta (não utilizado aqui)
		// hoje.dia = 15;
		// hoje.mes = 4;
		// hoje.ano = 2026;
		
		System.out.printf( hoje.toString() );
		
	}
	
}
