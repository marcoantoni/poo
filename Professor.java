public class Professor extends Pessoa {
	private String vinculo;
	private int cargaHoraria;
	private float salario;
	
	public Professor(String nome, String cpf, String email, String vinculo) {
		super(nome, cpf, email);
		setVinculo(vinculo);
	}
	
	public void setVinculo(String vinculo) {
		if (vinculo.equalsIgnoreCase("20") || vinculo.equalsIgnoreCase("40") || vinculo.equalsIgnoreCase("DE") ) {
					
			this.vinculo = vinculo;
			
			if (vinculo.equalsIgnoreCase("20") )
				this.cargaHoraria = 20;
			else
				this.cargaHoraria = 40;
		} else {
			this.vinculo = "Horista";
		}
		
		calcularSalario();
	}
	
	public String getVinculo() {
		return vinculo;
	}
	
	public void setCargaHoraria(int ch) {
		if (vinculo.equalsIgnoreCase("horista") && ch > 0) {
			cargaHoraria = ch;
			calcularSalario();
		} else {
			System.out.printf("Verifique se a carga horária informado é valida ou se o professor é horista. \n");
		}
	}
	
	private void calcularSalario() {
		
		if (vinculo.equalsIgnoreCase("20") )
			salario = 4500f;
		else if (vinculo.equalsIgnoreCase("40") )
			salario = 9000f;
		else if (vinculo.equalsIgnoreCase("DE") )
			salario = 13500f;
		else 
			if (cargaHoraria > 0) 
				salario = cargaHoraria * 80;
			else
				System.out.printf("Só é possível calcular o salário do professor horista se a carga horária trabalhada for maior que 0 horas\n");
	}
	
	public String toString() {
		
		return "Nome: " + nome + "\nCPF: " + cpf + "\nMatricula: " + matricula + "\nSalario: " + salario + "\n";
		
	}
	
}
