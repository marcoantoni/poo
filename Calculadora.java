class Calculadora {

	public int somar(int n1, int n2) {
		return n1 + n2;
	}
	
	public void subtrair(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		
		System.out.printf("%d - %d = %d \n", numero1, numero2, resultado);
	}

	public static void main (String args[]) {
		Calculadora calc = new Calculadora();
		
		int resultado = calc.somar(18, 22);
		
		System.out.printf("\nO resultado é %d", resultado);
	
		// chamando o método somar dentro do print
		System.out.printf("\nO resultado é %d", calc.somar(77, 21) );
	
		calc.subtrair(69, 17);
	}
}
