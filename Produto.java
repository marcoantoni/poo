import java.util.Random;	// importar a classe responsável pela geração de números aleatórios

class Produto {
	
	// protected - permite que os membros fiquem acessíveis nas subclasses
	// podendo ser acessados diratamente
	protected String nome;	
	protected float precoCompra;
	protected float precoVenda;
	protected int codigo;	// codigo do produto (id) - será gerado de maneira aleatória
	protected String descricao; // esse atributo não será usado
	
	
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
		
		// criando uma instancia da classe Random, que fornecerá acesso aos métodos que geram numeros aleatórios
		Random gerador = new Random();
		// codigo = gerador.nextInt();	// gera um número dentro do que um int suporte
		// gerador.nextInt(100);	// gera um numero entre 0 e 100
		codigo = gerador.nextInt(100, 1000);	// gera um numero entre 100 e 1000
		
		this.precoVenda = precoCompra * 1.5f;	// define todos os produtos com um lucro de 50% 
		
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
	
	public void mostrar() {
		System.out.printf("%s - Preço R$: %.2f - cód: %d \n", nome,  precoVenda, codigo);
	}
	
	public static void main (String []args){
		Produto p1 = new Produto("Pepsi", 2.39f);
		
		p1.mostrar();
	}	
	
	
}
