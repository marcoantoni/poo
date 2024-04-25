class Venda {
	Produto itens[];	// cria um vetor de produtos
	float total;	// total da venda
	int indice;	// indice para controlar a inserção dos itens 

	public Venda(){
		itens = new Produto[100];
		total = 0;
		indice = 0;
	}
	
	public void adicionarItem(Produto item) {
		itens[indice] = item;
		total += item.precoVenda;
		indice++;
	}
	
	// criar um método que aplica um desconto na venda
	
	public void visualizarVenda(){
		
		for (int i=0; i<100; i++){
			// tratanto o erro do vetor não estar cheio
			if (itens[i] == null)
				break;
			else
				System.out.printf("%s - %f \n", 
					itens[i].nome, itens[i].precoVenda );
		}
		
		System.out.printf("Total da venda: %f \n", total);
	}

}
