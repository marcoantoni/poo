import java.util.Random;

public class ContaCorrente extends Conta{
	private float limite;
		
	public ContaCorrente(Pessoa cliente){
		
		super(cliente);
		
	
		if (cliente instanceof PessoaJuridica){
			this.limite = 3000f;
		} else {
			this.limite = 200;
		}

	}
	
	// O método sacar é reimplementado, pois ele tem funcinamento diferente (polimorfismo). O saque da conta corrente leva em conta também o limite disponível do cliente
	/* public void sacar(float valor){
		if (valor > 0){
			
			// verifica que o cliente tem limite suficiente para realizar o saque.
			
			if (valor <= (saldo + limite ) ){
				
				saldo -= valor;
								
			} else {
				System.out.println("VOCE NÃO POSSUI SALDO PARA REALIZAR O SAQUE");
			}
			
		} else {
			System.out.println("VALOR INVÁLIDO");
		}
	}*/
		
	public void imprimirExtrato(){
		// usando a referencia super para acessar o método da superclasse. ao chamar o método sem usar a referência, cria um loop infinito, pois será executado o método da classe atual  
		super.imprimirExtrato();	
		System.out.println("Limite: " + limite);
	}
}
