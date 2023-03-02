public class ExemploArgumentos{
	public static void main (String args[]){
		// mostrando o primeiro argumento passado pela linha de comando
		System.out.printf("Argumento 1: %s", args[0]);
		
		// necessário converter o argumento para inteiro, pois o paremetro vem como string
		for (int i=0; i < Integer.parseInt(args[1]); i++){
			System.out.println(args[0]);
		}
		
	}
}
