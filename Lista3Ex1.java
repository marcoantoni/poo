import java.util.Scanner;

public class Lista3Ex1{
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		float soma = 0;
		int notasLidas = 0;
		
		for (int i=0; i<3; i++){
			System.out.printf("Digite a nota %d", i+1);
			float nota = sc.nextFloat();
			
			if (nota >= 0 && nota <= 10){
				soma = soma + nota;
				notasLidas++;
			
			}
		}
		
		float media = soma / notasLidas;
		
		System.out.printf("Foram lidas %d notas e a média é %f", notasLidas, media);
		
		
		
		
		
	}
}
	
