// Classe criada apenas para demonstrar o uso da classe Math
// A classe Math é uma classe utilitária da linguagem Java,
// ou seja, ela fornece métodos prontos para uso e não precisa ser instanciada
class ExemploMath {
	
	public static void main (String args[]) {
		
		// A classe Math possui apenas métodos estáticos
		// Isso significa que NÃO precisamos criar um objeto (new Math())
		// Os métodos são acessados diretamente pelo nome da classe
		
		// Método sqrt(): calcula a raiz quadrada de um número
		System.out.printf("A raiz quadrada de 16 é %f\n", Math.sqrt(16));
		
		// Método pow(): calcula a potência (base elevada ao expoente)
		System.out.printf("2 elevado na 16 é %f \n", Math.pow(2, 16));
		
		// Método min(): retorna o menor valor entre dois números
		System.out.printf("O menor valor entre 8 e 15 é %d \n", Math.min(8, 15));
		
		// Método max(): retorna o maior valor entre dois números
		System.out.printf("O maior valor entre 8 e 15 é %d \n", Math.max(8, 15));
		
		// IMPORTANTE:
		// A classe Math é considerada uma classe utilitária porque:
		// - não representa um objeto do mundo real
		// - não faz sentido criar instâncias dela
		// - todos os seus métodos são estáticos
		// - é usada apenas como um conjunto de funções prontas
		
	}
}
