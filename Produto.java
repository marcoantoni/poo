// Classe que representa um produto
class Produto {
	
	// Atributos da classe
	String nome;
	float pCompra;
	float pVenda;
	
	// Método construtor que recebe nome e preço de compra
	public Produto (String nome, float pCompra) {
		
		// Validação do nome (regra de negócio)
		if (nome.length() > 5){
			this.nome = nome; // atribui o nome se for válido
		} else {
			System.out.printf("Nome de produto inválido \n"); // mensagem de erro
		}
		
		// Validação do preço de compra (regra de negócio)
		if (pCompra > 0){
			this.pCompra = pCompra; // atribui o preço de compra
			
			// Define o preço de venda com acréscimo de 50%
			pVenda = pCompra * 1.5f;
		} else {
			System.out.printf("Preço de compra inválido \n"); // mensagem de erro
		}
	}
	
	// Método que retorna uma representação em texto do objeto
	public String toString() {
		return "Produto: " + nome + 
			   "\nPreço custo R$: " + pCompra + 
			   "\nPreço venda: R$ " + pVenda + 
			   "\n-----\n"; 
	}
	
	// Método principal para execução do programa
	public static void main (String args[]) {
		
		// Criação de objetos da classe Produto
		Produto p1 = new Produto("Doritos 210g", 6.99f);
		Produto p2 = new Produto("Pepsi 1L retornável", 3.89f);
		
		// Impressão dos dados dos produtos
		System.out.printf(p1.toString());
		System.out.printf(p2.toString());
	}
	
}

/*
Observação:
Não foi implementada a sobrecarga do método construtor (ou seja, um segundo construtor
recebendo precoVenda) em razão do tempo disponível para a correção da atividade.
*/
