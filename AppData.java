class AppData {


	public static void main (String args[]){
		
		Data proxAula = new Data(31, 4, 2025);
		
		// depois de encapsular o atributo, o acesso direto deixa de funcionar
		// dessa forma, as duas linha de código abaixo deixam de funcionar
		
		// as duas linhas abaixo acessan diretamento os atributos
		// proxAula.dia = 50;	// atributo dia
		
		// proxAula.mes = 5;	// atributo mÊs
		
		// depois de encapular o atributo, para alterar os valores é necessário usar o método set
		proxAula.setDia(15);
		proxAula.setMes(5);
		
		System.out.printf("Não haverá aula em %s \n", 
			proxAula.escreverPorExtenso() );
		
		// exemplo de aplicação do método get
		// quero escrever a data no formato dia/mes, portanto, é necessário recuperar o valor desses dois atributos
		System.out.printf("Não haverá aula em %d/%d\n", 
			proxAula.getDia(), proxAula.getMes() );
		
	}

}
