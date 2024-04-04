class Pessoa {
	String nome;
	float peso;
	float altura;
	
	// criando o método construtor 1
	public Pessoa(String n, float p) {
		System.out.printf("\nMétodo construtor 1\n");
		this.nome = n;
		this.peso = p;
	}
	
	// criando o método construtor 2
	public Pessoa(String n, float p, float a){
		System.out.printf("\nMétodo construtor 2\n");
		this.nome = n;
		this.peso = p;
		this.altura = a;
	}
	
	public void imprimirDados(){
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Peso: %f \n", peso);
		
		if (altura != 0)
			System.out.printf("Altura: %f \n", altura);
		
	}
	
	public static void main (String args[]) {
		Pessoa p1 = new Pessoa("Lucas", 71.8f);
		
		p1.imprimirDados();
	}
}
