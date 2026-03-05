class Ponto {
	// atributos
	int x;
	int y;
	
	public int determinarQuadrante(){
		
		if (x > 0 && y > 0)
			return 1;
		else if (x < 0 && y > 0)
			return 2;
		else if (x < 0 && y < 0)
			return 3;
		else if (x > 0 && y < 0)
			return 4;
			
		return 0;	// indica que está na linha ou origem
		
	}
	
	// criando o método para testar a classe
	public static void main(String args[]){
		
		// criando uma coordenada do grafico
		Ponto p1 = new Ponto();
		
		p1.x = 5;	// definindo a coordenada x
		p1.y = 0;	// definindo a coordenada y
		
		System.out.printf("O ponto está no %d quadrante \n", 
			p1.determinarQuadrante() );
				
	}
}
