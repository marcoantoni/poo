// para usar o Random, é necessário fazer o import
import java.util.Random;

public class ExemploAleatorio{

	public static void main (String args[]){
		Random gerador = new Random();
		
		// criando um numero inteiro aleatorio;
		int intAleatorio = gerador.nextInt(0, 100);// define o intervalo dos numeros sorteados
		
		float floatAleatorio = gerador.nextFloat();
		
		boolean booleanAleatorio = gerador.nextBoolean();
		
		System.out.println("Inteiro sorteado foi " +  intAleatorio);
		System.out.println("Float sorteado foi " +  floatAleatorio);
		System.out.println("Boolean sorteado foi " +  booleanAleatorio);
	}
} 
