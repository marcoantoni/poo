class Data {
	// declaracao dos atributos da classe
	int dia;
	int mes;
	int ano;
	
	public String escreverPorExtenso(){
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",	"agosto", "setembro", "outubro", "novembro", "dezembro"};
	
		return dia + " de " + meses[mes-1] + " de " + ano;
	}
	
	/* Tarefa para fazer:
	 * validação do dia considerando os anos bissextos
	*/
	public boolean ehBissexto(int ano){
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
			return true;
		}
		
		return false;
	}
	
	public void ajustarDia(int dia) {
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (dia >=1 && dia <= diasMes[this.mes-1]){
			this.dia = dia;
		} else {
			System.out.printf("Dia inválido\n");
			this.dia = 1;
		}
	}
	
	public void ajustarMes(int mes) {
		// validação do mes
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.printf("Mês inválido\n");
			this.mes = 1;
		}
	}
	
	public void ajustarAno(int ano){	
		if (ano > 1900){
			this.ano = ano;
		} else {
			System.out.printf("Ano inválido\n");
			this.ano = 2000; 
		}
	}
	
	
	
	// Desafio para fazer em casa:
	// criar um método para validação de numeros, eliminando a necessidade dos if de validação do dia/mes/ano
	public void ajustarData(int dia, int mes, int ano){
		
		ajustarMes(mes);
		
		ajustarDia(dia);
		
		ajustarAno(ano);
	
	}
	
	
	// método construtor da classe
	// não tem retorno
	// tem o mesmo nome da classe
	public Data (int dia, int mes, int ano){
		// validação do mes
		
		ajustarMes(mes);
		
		ajustarDia(dia);
		
		ajustarAno(ano);			

	}
	
	public static void main (String args[]) {
		// criando uma instancia da classe
		Data hoje = new Data(26, 3, 2024);
		
		hoje.ajustarData(3, 4, 2024);
		
		System.out.printf("Hoje é %s", hoje.escreverPorExtenso() );
		
		int ano = 1800;
		System.out.printf("%d é bissexto: %s", ano, hoje.ehBissexto(ano) );
	}
}
