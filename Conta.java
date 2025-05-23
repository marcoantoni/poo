import java.util.Random;	// importa a classe responsável pela geração de número aleatórios

class Conta {
	// atributos da classe
	private Cliente cliente; // objeto do tipo cliente
	private float saldo;	// saldo do cliente
	private Data abertura;	// indica quando a conta do cliente foi aberta - exemplo de composição/
	private int nConta;		// atributo que indica o número da conta
	
	public Conta (Cliente cli, Data dt) {
		
		this.cliente = cli;	// armazenenando o objeto cli no atributo cliente 
		
		this.abertura = dt;	// inicializando a data de abertura da conta
		
		saldo = 0;	// ao abrir a conta, o saldo está zerado
		
		// gerando um número aleatório de conta 
		Random g = new Random();	// instancia a classe Random, para que se possa usar o método nextInt
		
		this.nConta = g.nextInt(1000)+1; // gera o número aleatório
	}
	
	// método para imprimir os dados da classe
	public void imprimirExtrato(){
		System.out.printf("\nExtrato de conta \n");
		// o atributo nome do cliente precisa ser acessado com o método getNome
		System.out.printf("Cliente: %s \n", cliente.getNome() );
		System.out.printf("Conta nº: %d \n", nConta);
		System.out.printf("Conta aberta em %s \n", abertura.escreverPorExtenso() );
		System.out.printf("Saldo: %.2f \n", saldo);
		System.out.printf("----------------\n");
	}

	public boolean depositar(float valor){
		if (valor > 0) {
			saldo = saldo + valor;
			return true; // indica que teve sucesso
		}
		
		return false;	// falha no deposito
	}
	
	public boolean sacar(float valor){
		if (valor > 0) {
			saldo -= valor;
			return true; // sucesso ao sacar
		}
		
		return false;	// falha ao sacar
	}
}
