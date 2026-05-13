// import necessário para utilizar a classe ArrayList
import java.util.ArrayList;

class ExemploArrayList{
	
	public static void main (String args[]) {
		
		// criando um array tradicional de números inteiros
		int arrayNumeros[] = {10, 15, 5, 50, 7};
		
		// exibindo os valores armazenados no array
		System.out.printf("Exibindo o array arrayNumeros[]\n");
		
		// percorre o array utilizando índice
		for (int i=0; i < arrayNumeros.length; i++){
			
			// exibe a posição e o valor armazenado
			System.out.printf("%d = %d \n", i, arrayNumeros[i]);
		}
		
		// criando um ArrayList para armazenar números inteiros
		ArrayList<Integer> arrayListNumeros = new ArrayList<>();
		
		// adicionando valores ao ArrayList
		arrayListNumeros.add(10);
		arrayListNumeros.add(15);
		arrayListNumeros.add(5);
		arrayListNumeros.add(50);
		arrayListNumeros.add(7);
		
		// exibindo os valores do ArrayList
		System.out.printf("\nExibindo o ArrayList arrayListNumeros[]\n");
		
		// percorrendo todos os elementos do ArrayList
		for (Integer numero : arrayListNumeros){
			
			System.out.printf("%d \n", numero);
		}
		
		// criando objetos do tipo Aluno com a ajuda do ChatGPT
		Aluno aluno1 = new Aluno("Carlos Silva", "123.456.789-09", "carlos.silva@email.com", Aluno.CURSO_ADS, new Data(15, 3, 2002));
		Aluno aluno2 = new Aluno("Mariana Souza", "987.654.321-00", "mariana.souza@email.com", Aluno.CURSO_TPG, new Data(22, 7, 2001));
		Aluno aluno3 = new Aluno("Joao Pereira", "111.444.777-35", "joao.pereira@email.com", Aluno.CURSO_ADS, new Data(9, 11, 2000));
		Aluno aluno4 = new Aluno("Fernanda Lima", "529.982.247-25", "fernanda.lima@email.com", Aluno.CURSO_TPG, new Data(1, 5, 2003));
		Aluno aluno5 = new Aluno("Ricardo Alves", "390.533.447-05", "ricardo.alves@email.com", Aluno.CURSO_ADS, new Data(30, 8, 2001));
		Aluno aluno6 = new Aluno("Patricia Gomes", "168.995.350-09", "patricia.gomes@email.com", Aluno.CURSO_TPG, new Data(14, 2, 2002));
		Aluno aluno7 = new Aluno("Lucas Martins", "295.379.148-06", "lucas.martins@email.com", Aluno.CURSO_ADS, new Data(18, 12, 1999));
		Aluno aluno8 = new Aluno("Juliana Rocha", "714.602.380-01", "juliana.rocha@email.com", Aluno.CURSO_TPG, new Data(7, 9, 2004));
		Aluno aluno9 = new Aluno("Eduardo Costa", "153.509.460-56", "eduardo.costa@email.com", Aluno.CURSO_ADS, new Data(25, 1, 2000));
		Aluno aluno10 = new Aluno("Camila Fernandes", "987.123.654-81", "camila.fernandes@email.com", Aluno.CURSO_TPG, new Data(11, 6, 2003));
		
		// criando um ArrayList para armazenar objetos do tipo Aluno
		ArrayList<Aluno> turma = new ArrayList<>();
		
		// adicionando os alunos ao ArrayList
		turma.add(aluno1);
		turma.add(aluno2);
		turma.add(aluno3);
		turma.add(aluno4);
		turma.add(aluno5);
		turma.add(aluno6);
		turma.add(aluno7);
		turma.add(aluno8);
		turma.add(aluno9);
		turma.add(aluno10);
		
		System.out.printf("\nExibindo os alunos\n");
		
		// foreach utilizado para percorrer todos os objetos da turma
		for (Aluno al : turma ) {
			System.out.printf("%s \n", al.getNome() );
		}

	}
}
