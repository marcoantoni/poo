// Possível resoulução do exercício da Avaliação I
class BPM {
	String nome;
	int freq;
	
	public BPM (String nome, int freq) {
		this.nome = nome;
		this.freq = freq;
		
		// ao chamar mostrarResultado() aqui dentro, não será necessário chamar ele explicitamente. Isso garantirá que ele seja executado obrigatóriamente, pois ele está sendo chamado dentro do método construtor
		mostrarResultado();
	}
	
	public void mostrarResultado() {
		if (freq < 60){
			System.out.printf("%s tem braquicardia com %d bpm", nome, freq);
		} else if (freq >= 60 && freq <= 100){
			System.out.printf("%s tem batimentos normais com %d bpm", nome, freq);
		} else {
			System.out.printf("%s tem taquicardia com %d bpm", nome, freq);
		}
	}

	// criando um método para testar 
	
	public static void main(String args[]) {
		BPM b1 = new BPM("Marcelo", 79);
		// chamando explicitamente o método mostrarResultado()
		//b1.mostrarResultado();
	}		
}
