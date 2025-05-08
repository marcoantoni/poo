class Data {
	// declaração dos atributos necessários para representar a data
	// encapsulando os atributos da classe com o modificador de acesso private
	private int dia;
	private int mes;
	private int ano;

	public Data (int dia, int mes, int ano) {	
		setMes(mes);
		setDia(dia);
		setAno(ano);
		
	}
	
	// métodos setters
	
	public void setDia(int dia) {
		// validação do dia
		
		// definindo um array para armazenar a quantidade de dias de cada mês 

		int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// na validação usando um array, não será necessário fazer 12 ifs (um para cada mes)
		if (dia >= 1 && dia <= diasMes[this.mes]){
			this.dia = dia;
		} else {
			this.dia = 1; // definindo um dia default para inicialização dos atributos da classe
		}
	}
	
	public void setMes(int mes) {
		// validando o mes do ano
		if (mes >= 1 && mes <= 12){
			// aqui o mes é valido
			this.mes = mes;
		} else {
			this.mes = 1;	// definindo um mes default para inicialização dos atributos da classe
		}
	}
	
	public void setAno(int ano) {
		// validação do ano
		if (ano >= 1970) {
			this.ano = ano;
		} else {
			this.ano = 1970; // definindo um dia default para inicialização dos atributos da classe
		}
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	// método responsável por escrever a data por extenso
	
	public String escreverPorExtenso() {
		
		String meses[] = {"", "janeiro", "feveiro", "março", 
			"abril", "maio", "junho", "julho", "agosto", 
			"setembro", "outubro", "novembro", "dezembro"
		};
		
		return dia + " de " + meses[mes] + " de " + ano;
	}
	
	public static void main(String args[]) {
		/*Data hoje = new Data(27, 13, 2025);
		
		// chamando o método escreverPorExtenso
		
		System.out.printf("Hoje é %s", hoje.escreverPorExtenso() );
		*/
		
		// criando as datas que representam alguns feriados
		Data feriado1 = new Data(18, 4, 2025);
		
		Data feriado2 = new Data(21, 4, 2025);
		
		Data feriado3 = new Data(1, 5, 2025);
		
		Data feriado4 = new Data(19, 6, 2025);
		
		// criando um array que armazena datas
		
		Data feriados[] = {feriado1, feriado2, feriado3, feriado4};
		
		System.out.println("Neste semestre, não haverá aulas em:");
		
		for (int i=0; i < feriados.length; i++) {
			System.out.println(feriados[i].escreverPorExtenso() );
		}
	}
	
}
