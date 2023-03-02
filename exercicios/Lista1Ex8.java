public class Lista1Ex8{
	public static void main (String args[]){
		float nota = 1.5f;
		
		if (nota >= 7)
			System.out.println("Aluno aprovado");
		else if (nota >= 1.7 && nota < 7)
			System.out.println("Aluno em exame");
		else 
			System.out.println("Aluno reprovado");
	}
}
