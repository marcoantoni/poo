class AppVenda {
	
	public static void main (String args[]) {
		// criando os produtos
		Produto p1 = new Produto("Calça jeans", 89.f);
		Produto p2 = new Produto("Moletom", 108.78f);
		Produto p3 = new Produto("Meias", 7.18f);
		Produto p4 = new Produto("Calça kappa azul marinho",
		 59.9f, 108.9f);
		 
		 // cria uma venda
		 Venda venda1 = new Venda();
		 
		 //adiciona os objetos (itens) p1 e p4 a venda1
		 venda1.adicionarItem(p1);
		 venda1.adicionarItem(p4);
		 venda1.adicionarItem(p1);
		 
		 // mostra os itens da venda;
		 venda1.visualizarVenda();
	}
}
