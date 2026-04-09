// Classe que representa uma venda realizada para um cliente
class Venda {
	
	// Atributos da classe
	String nomeCli;        // nome do cliente
	Produto itens[];       // array de produtos comprados
	float total;           // valor total da venda
	int indice;            // controla a posição atual para inserção no array
	
	// Construtor que inicializa a venda com o nome do cliente
	public Venda(String nomeCli){
		
		// Validação do nome do cliente (regra de negócio)
		if (nomeCli.length() > 5){
			this.nomeCli = nomeCli; // atribui o nome se for válido
		} else {
			System.out.printf("Nome de cliente inválido \n"); // mensagem de erro
		}
		
		// Inicializa o array de produtos com tamanho fixo (100 posições)
		itens = new Produto[100];
		
		// Inicializa o total da venda com zero
		// O índice começa em 0 automaticamente (controle de inserção)
		total = 0;
		
	}
	
	// Método responsável por adicionar um produto à venda
	public void adicionarItem(Produto prod) {
		
		// Adiciona o produto na posição atual do array
		itens[indice] = prod;
		
		// Soma o preço de venda do produto ao total da compra
		total = total + prod.pVenda;
		
		// Incrementa o índice para a próxima inserção
		indice++;
	}
	
	// Método que imprime a "nota" da venda
	public void imprimirNota() {
		
		System.out.printf("Cliente: %s \n", nomeCli);
		
		System.out.printf("Itens comprados\n");
		
		// Percorre o array até a posição atual (indice)
		for (int i=0; i<indice; i++){
			
			// Exibe número do item, nome do produto e preço de venda
			System.out.printf("%d - %s - %.2f \n", 
				i+1, itens[i].nome, itens[i].pVenda); 
		}
		
		System.out.printf("Total da compra: R$ %.2f \n", total); 
	}
	
	// Método principal para teste da classe
	public static void main (String args[]) {
		
		// Criação de alguns produtos
		Produto p1 = new Produto("Doritos 210g", 6.99f);
		Produto p2 = new Produto("Pepsi 1L retornável", 3.89f);
		Produto p3 = new Produto("Heinecken 473ml ", 4.19f);
		Produto p4 = new Produto("Arroz 2 kg", 4.79f);
		
		// Criação de uma venda para um cliente
		Venda venda1 = new Venda("Carlos Miguel");
		
		// Adicionando produtos à venda
		venda1.adicionarItem(p3);
		venda1.adicionarItem(p1);
		venda1.adicionarItem(p4);
		
		// Impressão da nota da venda
		venda1.imprimirNota();
	}
}
