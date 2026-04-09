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
		
		// =========================
		// VALIDAÇÃO DO MÊS
		// =========================
		
		// Verifica se o mês está dentro do intervalo válido (1 a 12)
		if (mes >= 1 && mes <= 12){
			this.mes = mes; // valor válido → atribui normalmente
		} else { 
			System.out.printf("Mês é inválido \n");
			this.mes = 1;	// valor padrão caso seja inválido
		}
		
		
		// =========================
		// VALIDAÇÃO DO DIA (com uso de array)
		// =========================

		// Array que armazena a quantidade de dias de cada mês
		// Índice representa o mês (1 = janeiro, 2 = fevereiro, etc.)
		// A posição 0 não é usada (por isso começa com 0)
		int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// Usa o mês já validado (this.mes) para acessar o array
		// Ex: se mes = 2 → diasMes[2] = 28
		
		// Verifica se o dia está dentro do limite daquele mês específico
		if (dia >= 1 && dia <= diasMes[this.mes]) {	
			this.dia = dia; // valor válido
		} else {
			System.out.printf("Dia inválido");
			this.dia = 1; // valor padrão
		}
		
		
		// =========================
		// VALIDAÇÃO DO ANO
		// =========================
		
		// Verifica se o ano é positivo
		if (ano >= 0) {
			this.ano = ano;
		} else { 
			System.out.printf("Ano inválido");
			this.ano = 1900; // valor padrão
		}
	}
	
	// Sobrecarga de método (overload)
	// Ocorre quando existem métodos com o mesmo nome,
	// mas com assinaturas diferentes (quantidade ou tipo de parâmetros).
	// o segundo método construtor não faz nenhuma validação
	public Data (int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}
	
	// Método que retorna a data no formato de texto
	public String escreverAbreviado(){
		
		// Tratando o caso em que o ano não foi informado
		if (ano == 0)
			return dia + "/" + mes;
		
		// Retorno padrão (quando o ano foi informado)
		return dia + "/" + mes + "/" + ano;
	}
	
	// Método que retorna data escrita por extenso
	public String escreverExtenso() {
		
		// Array que armazena os nomes dos meses por extenso
		// O índice do array corresponde ao número do mês:
		// 1 = janeiro, 2 = fevereiro, ..., 12 = dezembro
		// A posição 0 fica vazia ("") para manter a correspondência direta com o número do mês
		String meses[] = {
			"", "janeiro", "fevereiro", "março", "abril", "maio",  "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

		// Monta e retorna a data no formato por extenso:
		// dia + " de " + nome do mês + " de " + ano
		// Exemplo: 10 de março de 2025
		
		// meses[mes] acessa diretamente o nome do mês correspondente
		return dia + " de " + meses[mes] + " de " + ano;

	}
	
	public static void main (String args[]) {
		
		// Criando uma instância (objeto) da classe Data
		// Note que o mês foi informado como 14 (valor inválido)
		// Isso serve para testar a validação feita no construtor da classe Data
		// Como o mês válido deve estar entre 1 e 12, o construtor irá corrigir
		// esse valor automaticamente (provavelmente definindo como 1, por exemplo)
		Data hoje = new Data(15, 14, 2026);


		// Exibindo a data no console
		// Os métodos retornam String, então podem ser usados direto no printf
		System.out.printf( hoje.escreverAbreviado() );
		System.out.printf( hoje.escreverExtenso() );


		// =========================
		// CRIAÇÃO DE ARRAY DE OBJETOS
		// =========================

		// Aqui estamos criando um array que pode armazenar 5 objetos do tipo Data
		// Ou seja, um array não precisa guardar apenas números ou textos,
		// ele pode armazenar objetos também
		Data aulasPOO[] = new Data[5];


		// =========================
		// ATRIBUIÇÃO DE VALORES NO ARRAY
		// =========================

		// Cada posição do array recebe um objeto Data
		// Ou seja, estamos instanciando objetos e colocando dentro do array
		aulasPOO[0] = new Data(1, 4, 2026);
		aulasPOO[1] = new Data(8, 4, 2026);
		aulasPOO[2] = new Data(15, 4, 2026);
		aulasPOO[3] = new Data(22, 4, 2026);
		aulasPOO[4] = new Data(29, 4, 2026);
		// tentar adicionar mais um item no array causa um erro, pois o array está cheio
		//aulasPOO[5] = new Data(29, 4, 2026);


		// =========================
		// ACESSANDO ELEMENTOS DO ARRAY
		// =========================

		// Acessamos uma posição específica (índice 3)
		// e chamamos um método do objeto armazenado nessa posição
		System.out.printf("A avalição ficou marcada para %s \n", 
			aulasPOO[3].escreverExtenso() );


		// =========================
		// PERCORRENDO UM ARRAY (LAÇO DE REPETIÇÃO)
		// =========================

		System.out.printf("As aulas de POO em abril serão nas seguintes datas \n");

		// Utilizamos um laço for para percorrer todas as posições do array
		// aulasPOO.length retorna o tamanho do array (quantidade de posições)

		// i representa o índice do array (posição)
		// Começa em 0 e vai até length - 1
		for (int i = 0; i < aulasPOO.length; i++){
			
			// Em cada repetição, acessamos uma posição do array
			// e usamos o objeto armazenado ali
			System.out.printf("%s \n", aulasPOO[i].escreverAbreviado() );
		}
		
		
	}
	
}
