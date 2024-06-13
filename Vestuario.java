class Vestuario extends Produto{
	private String marca;
	private String tamanho;
	
	public Vestuario(String marca, String tamanho, String nome, float precoCompra) {
		super(nome, precoCompra);
		setMarca(marca);
		setTamanho(tamanho);
	}
	
	public void setMarca(String marca) {
		if (marca.length() > 2) {
			this.marca = marca;
		} else {
			System.out.println("Marca inválida");
		}
	} 
	
	public String getMarca() {
		return marca;
	}
	
	public void setTamanho(String tamanho) {
		if (tamanho.equalsIgnoreCase("pp") )
			this.tamanho = "PP";
		else if (tamanho.equalsIgnoreCase("p") )
			this.tamanho = "P";
		else if (tamanho.equalsIgnoreCase("pp") )
			this.tamanho = "PP";
		else if (tamanho.equalsIgnoreCase("m") )
			this.tamanho = "m";
		else if (tamanho.equalsIgnoreCase("g") )
			this.tamanho = "G";
		else if (tamanho.equalsIgnoreCase("gg") )
			this.tamanho = "GG";
	}
	
	public String getTamanho() {
		return tamanho;
	}
}
