import java.util.Date;
import java.text.SimpleDateFormat;

abstract class Conta{
	// O polimorfismo permite simplificar a programação, ou seja, o atributo cliente pode armazenar instâncias das classes PessoaFisica ou PessoaJuridica
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
	
	// método final não pode ser sobrescrito em classes filhas
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
		
		// necessário saber se a variavel cliente contem uma instancia da classe PessoaFisica, para poder chamar o método getCpf
		// essa decisão é tomada em tempo de execução
		if (cliente instanceof PessoaFisica) {
			System.out.println("CPF: " + ( (PessoaFisica)(cliente)).getCpf() );	// necessário fazer a conversão do tipo em tempo de execução para poder chamar o método da classe correspondente. No caso, o método geCpf() pertence a PessoaFisica
		} else {
			System.out.println("CNPJ: " + ( (PessoaJuridica)(cliente)).getCnpj() );
		}
		
		System.out.println("Cliente desde: " + aberturaConta.escreverPorExtenso() );
		System.out.println("Saldo: " + saldo);

	}
	
}
