public class Vestuario extends Produto {
	// atributos específicos da classe
	private String material;
	private int tipo;
	private String tamanho;
	
	/* USO DE CONSTANTES
	 * Para declarar constantes em uma classe, devem ser usados os modificados
	 * static e final. Em java, significa que:
	 * static faz com que a constante pertença a classe e não a instancia dela
	 * final indica que o valor não pode ser alterado após ser definido
	 * por convenção, constantes tem o nome em MAIÚSCULAS
	 */
	public static final int CAMISETA = 1;
	public static final int CAMISA = 2;
	public static final int CALCA = 3;
	public static final int CASACO = 4;
	
	public void setMaterial(String material) {
		if (material.length() >= 10)
			this.material = material; // armazena o valor no atributo material
		else
			this.material = "Não informado";
	}
	
	public String getMaterial() {
		return material;
	}
	
	// Tamanhos retirados de https://www.calitta.com/br/content/tamanhos-e-medidas-de-roupas-6
	public void setTamanho(String tam) {
		if (tam.equalsIgnoreCase("P") || tam.equalsIgnoreCase("PP") ||
			tam.equalsIgnoreCase("M") || tam.equalsIgnoreCase("G") ||
			tam.equalsIgnoreCase("XG") || tam.equalsIgnoreCase("XGG") ||
			tam.equalsIgnoreCase("EG") || tam.equalsIgnoreCase("EGG") ||
			tam.equalsIgnoreCase("unico") )
			
			this.tamanho = tam; // armazena o valor no atributo tamanho
		
		else
			this.tamanho = "Não informado";
	}
	
	public void setTipo(int tipo) {
		// como estão sendo usados códigos númericos, para validar basta ver se ele está dentro do intervalo de códigos definidos
		if (tipo >= 1 && tipo <= 4) 
			this.tipo = tipo;
		else
			this.tipo = 0;	// código para tipo inválido
	}
	
	// criando um método construtor para a classe
	// parametros nome e precoCompra são exigidos pelo construtor
	// da classe Produto
	public Vestuario(String material, int tipo, String tam, 
		// nome e precoCompra são os parametros que o construtor da classe Produto exige
		String nome, float precoCompra){
	
		super(nome, precoCompra);
		
		setMaterial(material); // o método setMaterial faz essa validação
		setTipo(tipo);	// o método setTipo faz essa validação
		setTamanho(tam); // o método setTamanho faz essa validação
	}
	
	public void mostrarVestuario() {
		// é possível acessar os atributos nome, descricao e precoVenda
		// sem os metódos getters, pois else foram definidos como protected na superclasse
		System.out.printf("%s \n", nome);	
		
		// só exibe a descrição se o atributo foi inicializado
		// no exemplo feito em aula, ele não está sendo incializado
		if (descricao != null)
			System.out.printf("Descrição: %s \n", descricao);
		
		System.out.printf("Preço: %.2f \n", precoVenda);
		System.out.printf("Tamanho: %s \n", tamanho);
		System.out.printf("Material: %s \n", material);
		
		/* mostrando o tipo do produto
		* como está sendo usado um código, será necessário fazer testes para
		* determinar seu tipo
		* usar constantes permite evitar testar SE tipo == 1 para saber se é uma camiseta
		* é possível testar SE tipo == CAMISETA
		*/
		if (tipo == CAMISETA)
			System.out.printf("Tipo: Camiseta \n");
		else if (tipo == CAMISA)
			System.out.printf("Tipo: Camisa \n");
		else if (tipo == CALCA) 
			System.out.printf("Tipo: Calça \n");
		else if (tipo == CASACO) 
			System.out.printf("Tipo: Casaco \n");
		else
			System.out.printf("Tipo: não informado \n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
