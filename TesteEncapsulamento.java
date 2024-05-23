public class TesteEncapsulamento {
	
	public static void main (String args[]) {
		
		Data recuperacao = new Data(14, 5, 2024);	// a data está errada, será necessário alterar 
		
		// não é possível acessar diretamente um atributo encapslado. Isso causa um erro de compilação
		//recuperacao.dia = 35;
		//recuperacao.mes = 13;
		
		// para alterar os valores, será usado os métodos setters criados
		
		recuperacao.setDia(29);
		
		recuperacao.setMes(5);
		
		System.out.printf("A recuperação da disciplina será em %s \n", recuperacao.escreverPorExtenso() );
			
		// usando o método getters para recuperar os atributos, permitindo mostrar a informação de outro formato
		String dataAbreviada = recuperacao.getDia() + "/" + recuperacao.getMes() + "/" + recuperacao.getAno() ;
	
		System.out.printf("A recuperação será em %s \n", dataAbreviada);
	}
}
