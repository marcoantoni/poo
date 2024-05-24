import java.util.Random;
import java.util.Scanner;

class Adivinhe {
	int sorteado;
	int tentativas;
	
	public Adivinhe() {
		tentativas = 1;
		
		Random r = new Random();
		
		sorteado = r.nextInt(0, 100);
		
		System.out.printf("O numero gerado foi %d ", sorteado);
	}
	
	public void jogar() {
		
		for (int i=0; i<10; i++){
							
			System.out.printf("Pense em um número entre 0 e 100\n");
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			
			if (numero == sorteado){
				System.out.printf("Parabéns, você me venceu!\n");
				break;
			} else {
				if (sorteado > numero) {
					System.out.printf("O que pensei é maior\n");
				} else {
					System.out.printf("O que pensei é menor\n");
				}
			}
			
			if (tentativas == 10){
				System.out.printf("Eu venci. O número sorteado era %d\n", sorteado);
				break;
			} 
					
			tentativas++;
						
		}		
	}
	
	public static void main (String args[]) {
		Adivinhe jogo = new Adivinhe();
		
		jogo.jogar();
	}
}
