class Data {
	
	// =========================
	// ENCAPSULAMENTO DOS ATRIBUTOS
	// =========================
	
	// O modificador "private" impede o acesso direto aos atributos
	// a partir de outras classes.
	// Ou seja, ninguém pode fazer algo como: objeto.dia = 10;
	// Isso força o uso de métodos (getters e setters),
	// garantindo mais controle e validação dos dados.
	
	// Se não fosse especificado nenhum modificador (public, private, etc),
	// o Java utilizaria o acesso padrão (public), que é o mais permisso
	
	private int dia;
	private int mes;
	private int ano;
	
	
	/* 
	 * Método construtor da classe.
	 * É executado automaticamente ao criar um objeto com "new".
	 * 
	 * Aqui usamos os métodos setters ao invés de acessar diretamente
	 * os atributos, garantindo que as validações sejam aplicadas.
	 */
	public Data (int dia, int mes, int ano) {
		// depois que foram criados os métodos set, basta chamar os respectivos
		// métodos para garantir que a validação seja executada
		setMes(mes);
		setDia(dia);
		setAno(ano);
	}
	
	
	// Sobrecarga (overload) de construtor
	// Mesmo nome, parâmetros diferentes
	public Data (int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}
	
	
	// =========================
	// GETTERS E SETTERS
	// =========================
	
	/*
	 * MÉTODO SET (setDia)
	 * 
	 * Nomenclatura:
	 * - Sempre começa com "set"
	 * - Seguido do nome do atributo (Dia → setDia)
	 * 
	 * Tipo:
	 * - void (não retorna valor)
	 * 
	 * Função:
	 * - Alterar o valor do atributo
	 * - Aplicar validações antes de salvar o valor
	 */
	public void setDia(int dia) {
		
		// Array com quantidade de dias por mês
		int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// Validação baseada no mês atual
		if (dia >= 1 && dia <= diasMes[this.mes]) {	
			this.dia = dia;
		} else {
			System.out.printf("Dia inválido");
			this.dia = 1; // valor padrão
		}
	}
	
	
	/*
	 * MÉTODO GET (getDia)
	 * 
	 * Nomenclatura:
	 * - Sempre começa com "get"
	 * - Seguido do nome do atributo
	 * 
	 * Tipo:
	 * - Mesmo tipo do atributo (int)
	 * 
	 * Função:
	 * - Retornar o valor do atributo
	 * - Permitir acesso controlado ao atributo privado
	 */
	public int getDia() {
		return dia;
	}
	
	
	public void setAno(int ano) {
		
		// Validação simples: ano não pode ser negativo
		if (ano >= 0) {
			this.ano = ano;
		} else { 
			System.out.printf("Ano inválido");
			this.ano = 1900;
		}
	}
	
	
	public int getAno(){
		return ano;
	}
	
	
	public void setMes(int mes) {
		
		// Mês deve estar entre 1 e 12
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else { 
			System.out.printf("Mês é inválido \n");
			this.mes = 1;
		}
	}
	
	
	public int getMes() {
		return mes;
	}
	
	
	// =========================
	// MÉTODOS DE SAÍDA
	// =========================
	
	public String escreverAbreviado(){
		
		if (ano == 0)
			return dia + "/" + mes;
		
		return dia + "/" + mes + "/" + ano;
	}
	
	
	public String escreverExtenso() {
		
		String meses[] = {
			"", "janeiro", "fevereiro", "março", "abril", "maio",  
			"junho", "julho", "agosto", "setembro", 
			"outubro", "novembro", "dezembro"};

		return dia + " de " + meses[mes] + " de " + ano;
	}
	
	
	public static void main (String args[]) {
		
		// Criação de objeto com valor inválido (mês 14)
		// A validação do setter corrige automaticamente
		Data hoje = new Data(15, 14, 2026);

		System.out.printf( hoje.escreverAbreviado() );
		System.out.printf( hoje.escreverExtenso() );


		// Array de objetos
		Data aulasPOO[] = new Data[5];

		aulasPOO[0] = new Data(1, 4, 2026);
		aulasPOO[1] = new Data(8, 4, 2026);
		aulasPOO[2] = new Data(15, 4, 2026);
		aulasPOO[3] = new Data(22, 4, 2026);
		aulasPOO[4] = new Data(29, 4, 2026);


		System.out.printf("A avalição ficou marcada para %s \n", 
			aulasPOO[3].escreverExtenso() );


		System.out.printf("As aulas de POO em abril serão nas seguintes datas \n");

		for (int i = 0; i < aulasPOO.length; i++){
			System.out.printf("%s \n", aulasPOO[i].escreverAbreviado() );
		}
	}
}
