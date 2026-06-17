class PessoaFisica extends Pessoa{

	private String cpf;
	private String rg;
	
	public PessoaFisica(String cpf, String rg, String nome, Data nascimento, String endereco){
		super(nome, nascimento, endereco);
		setRg(rg);
		
		if (CpfCnpjUtils.isValidCPF(cpf))
			this.cpf = cpf;
		else
			System.out.println("CPF inválido: será necessário atualizar o documento para validar o cadastro.");
	}	
	
	public String getCpf(){
		return cpf;
	}
	
	public String getRg(){
		return rg;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String toString(){
		String msg = "";
		msg = msg + "Nome: " + getNome() + "\n";
		msg = msg + "Nascimento: " + getNascimento() + "\n";
		msg = msg + "CPF: " + cpf + "\n";
		msg = msg + "RG: " + rg + "\n";
		
		return msg;
	}          
}
