import java.util.Date;
import java.text.SimpleDateFormat;

abstract class Conta{
	
	// aqui tem um exemplo de polimorfismo: 
	// o atributo cliente pode armazenar tanto um objeto do tipo PessoaFisica quanto PessoaJuridica
	protected Pessoa cliente;
	protected int nConta;
	protected Data aberturaConta;
	protected float saldo;
	
	public Conta(Pessoa cliente){
		this.cliente = cliente;
		saldo = 0f;
		
		/* Date é uma classe nativa do Java para representar datas. Não a utilizamos, pois durante a disciplina, foi implementada essa classe para fins didáticos.
		   Aqui ela esta sendo utilizada para pegar a data atual do computador (hoje), para possibilitar criarmos uma nova data (instancia da classe Data, desenvolvida em aula).
		*/
		Date date = new Date(); 
		
		SimpleDateFormat formatterDd = new SimpleDateFormat("dd"); 
		SimpleDateFormat formatterMm = new SimpleDateFormat("MM"); 
		SimpleDateFormat formatterYyyy = new SimpleDateFormat("yyyy");  
		 
		int dia = Integer.parseInt(formatterDd.format(date));
		int mes = Integer.parseInt(formatterMm.format(date));
		int ano = Integer.parseInt(formatterYyyy.format(date));
		
		aberturaConta = new Data(dia, mes, ano);
	}
	
	public int getNConta(){
		return nConta;
	}
	
	public float getSaldo(){
		return saldo;
	}
	
	// o que aconteceria se o programador quiser reescrever esse metodo?
	// metodo final nao pode ser sobreescrito nas classes filhas
	public final void depositar(float valor){
		if (valor > 0){
			saldo += valor;
		}
	}
	
	// um método abstract tem a finalidade de obrigar que ele sejam implementado na classe filha.
	// ele não tem as chaves pois não tem nenhuma implementação
	public abstract void sacar(float valor); 
	
	public void imprimirExtrato(){
		System.out.println("Cliente: " + cliente.getNome() );
		System.out.println("Número da conta: " + nConta);
		
		// Precisamos verificar qual é o tipo real do objeto armazenado na variável cliente.
		// Embora a variável tenha sido declarada como Cliente (ou outra classe mais genérica),
		// o objeto pode ser uma PessoaFisica ou uma PessoaJuridica.
		// Essa verificação é feita em tempo de execução com o operador instanceof.
		if (cliente instanceof PessoaFisica) {

			// Casting (conversão de referência):
			// Aqui informamos ao Java que o objeto referenciado por cliente
			// deve ser tratado como uma PessoaFisica.
			// Isso permite acessar métodos que existem apenas nessa classe,
			// como o método getCpf().
			System.out.println("CPF: " + ((PessoaFisica) cliente).getCpf());

		} else {

			// Da mesma forma, convertemos a referência para PessoaJuridica
			// para acessar métodos específicos dessa classe, como getCnpj().
			System.out.println("CNPJ: " + ((PessoaJuridica) cliente).getCnpj());

		}
		
		System.out.println("Cliente desde: " + aberturaConta.escreverPorExtenso() );
		System.out.println("Saldo: " + saldo);

	}
	
}
