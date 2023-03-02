public class Aula3Exemplo1{
	public static void main (String args[]){
		// invólucros
		String nascimento = "1993";
		String pesoString = "78.4";
		
		// como calcular a idade sendo que o ano de nascimento é uma string?
		// é preciso converter a string para inteiro 
		int anoNascimento = Integer.parseInt(nascimento);
		
		int idade = 2023 - anoNascimento;
		
		System.out.printf("Idade: %d anos", idade);
		
		//convertendo uma string para float
		float peso = Float.parseFloat(pesoString);
		
		System.out.printf("Peso é %f", peso);
		
		/* Exemplo de vetores */
		
		// forma 1 de declar um array
		// faz a declaracao e atribuicao de todos os valores
		// nesse caso, nao é preciso dizer qual será seu tamanho
		//String turmaADS[] = {"Francis", "Danieri", "Aureo", "Antonio", "Augusto", "Gabriel", "Silvio", "Vinicius", "Marco"};

		// forma dois de declarar: diz que a variavel será um vetor
		String turmaADS[];
		
		// inicializa o vetor, dizendo qual será seu tamanho
		turmaADS = new String[5];

		turmaADS[0] = "Chico"; //trocando o primeiro valor do array
		turmaADS[1] = "Aureo";
		turmaADS[2] = "Antonio";
		turmaADS[3] = "Augusto";
		
		
			// turmaADS.length retorna o tamanho do vetor - recomendavel fazer dessa forma
		// acessar um indice inválido do array gera um erro em tempo de execução
		for (int i=0; i < turmaADS.length; i++){
			// tratando os valores nulos, para nao mostrá-los
			if (turmaADS[i] != null)
				System.out.println(turmaADS[i]);
		}
		
		
	}
}
