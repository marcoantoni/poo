class Produto {
	String nome;	
	float precoCompra;
	float precoVenda;
	int codigo;	// codigo do produto (id)
	String descricao;	// caso queira adicionar detalhes sobre o produto
	
	/* construtor1: obriga a informar o nome e o preco de compra do produto
	 * a partir do preco de compra, o preco de venda será acrescido de 50%
	 */
	public Produto(String nome, float precoCompra){
		if (nome.length() > 3)
			this.nome = nome;
		else 
			System.out.println("Nome incorreto");
			
		if (precoCompra > 0)
			this.precoCompra = precoCompra;
		else 
			System.out.println("Preço inválido");
			
		this.precoVenda = precoCompra * 1.5f;	// defini todos os produtos com um lucro de 50%
	}	
	
	/* construtor2: obriga a informar o nome e o preco de compra e preco de venda do produto
	 * esse método é util quando se quer especificar o preco de venda do produto na hora do cadastro
	 */
	public Produto(String nome, float precoCompra, float precoVenda ){
		if (nome.length() > 5)
			this.nome = nome;
		else 
			System.out.println("Nome incorreto");
			
		if (precoCompra > 0)
			this.precoCompra = precoCompra;
		else 
			System.out.println("Preco de compra inválido");
			
		if (precoVenda > 0)
			this.precoVenda = precoVenda;
		else 
			System.out.println("Preco de venda inválido");
	}
	
	public static void main (String []args){
		Produto p1 = new Produto("Pepsi", 3.89f);
	}	
	
}
