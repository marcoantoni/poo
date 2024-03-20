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
	public void ajustarData(int dia, int mes, int ano){
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// validação do mes
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.printf("Mês inválido\n");
			this.mes = 1;
		}
		
		if (dia >=1 && dia <= diasMes[this.mes-1]){
			this.dia = dia;
		} else {
			System.out.printf("Dia inválido\n");
			this.dia = 1;
		}
		
		if (ano > 1900){
			this.ano = ano;
		} else {
			System.out.printf("Ano inválido\n");
			this.ano = 2000; 
		}
		
			

	}
	
	public static void main (String args[]) {
		// criando uma instancia da classe
		Data hoje = new Data();
		
		hoje.ajustarData(19, 3, 2024);
		
		System.out.printf("Hoje é %s", hoje.escreverPorExtenso() );
		
	}
}
