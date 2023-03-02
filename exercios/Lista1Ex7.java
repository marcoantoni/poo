public class Lista1Ex7{
	public static void main (String args[]){
		int a = 16, b = 14, c = 11;
		
		int maior = a;
		
		if (b > maior)
			maior = b;
		else if (c > maior)
			maior = c;
			
		System.out.printf("%d é o maior valor", maior);
	}
}
