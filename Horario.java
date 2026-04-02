// Definição da classe Horario
class Horario {
	
	// Atributos da classe: armazenam hora e minutos
	int horas;
	int minutos;
	
	// Método construtor: usado para criar objetos da classe Horario
	public Horario (int horas, int minutos){
		
		// Validação da hora (deve estar entre 0 e 23)
		if (horas >= 0 && horas <= 23) 
			this.horas = horas; // atribui ao atributo da classe
		else
			System.out.printf("A hora informada é inválida! \n");
			
		// Validação dos minutos (deve estar entre 0 e 59)
		if (minutos >= 0 && minutos <= 59) 
			this.minutos = minutos; // atribui ao atributo da classe
		else
			System.out.printf("O minutos informado é inválido! \n");
				
	}
	
	// Método estático que calcula a diferença entre dois horários
	// Recebe dois objetos Horario como parâmetros
	public static int calcularDiferenca(Horario hrInicio, Horario hrFim) {
		
		// Converte o horário inicial para minutos totais
		int minHrInicio = (hrInicio.horas * 60) + hrInicio.minutos;
		
		// Converte o horário final para minutos totais
		int minHrFim = (hrFim.horas * 60) + hrFim.minutos;
		
		// Calcula a diferença entre os dois horários
		int dif = minHrInicio - minHrFim;
		
		// Retorna o valor absoluto da diferença (sempre positivo)
		return Math.abs(dif);
		
	}
	
	// Método principal: ponto de entrada do programa
	public static void main (String args[]) {
		
		// Cria um objeto representando o início da aula (19:30)
		Horario hrInicioAula = new Horario(19, 30);
		
		// Cria um objeto representando o horário do intervalo (20:40)
		Horario hrIntervalo = new Horario(20, 40);
		
		// Exibe na tela a duração da aula até o intervalo
		// Chamando o método estático calcularDiferenca
		System.out.printf("A aula tem duração de %d minutos até o intervalo \n",
			Horario.calcularDiferenca(hrInicioAula, hrIntervalo) );
		
	}
}
