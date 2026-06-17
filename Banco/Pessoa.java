abstract class Pessoa{
	protected String nome;
	protected Data nascimento;	// apesar do nome nascimento, vai ser um atributo genérico: pode ser quando a pessoa fisica nasceu OU quando a pessoa juridica foi aberta
	protected String endereco;

	public Pessoa(String nome, Data nascimento, String endereco){
		setNome(nome);
		setEndereco(endereco);
		setNascimento(nascimento);
	}
	
	public void setNome(String nome){
				
		if (nome.length() > 10){
			this.nome = nome;
		} else { 	
			System.out.println("NOME INVÁLIDO. INSIRA UM NOME DO FORMATO \"Nome Sobrenome\"");
		}
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setEndereco(String endereco){
		// testando se o endereco possui mais que 10 digitos
		if (endereco.length() > 10 ) {
			this.endereco = endereco;
		} else { 	
			System.out.println("ENDERECO INVÁLIDO. INSIRA UM ENDERECO NO FORMATO \"Rua Nome Da Rua\"");
		}		
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setNascimento(Data nascimento){
		this.nascimento = nascimento;
	}
	
	public Data getNascimento(){
		return nascimento; 
	}
}
