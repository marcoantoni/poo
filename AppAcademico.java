public class AppAcademico {
	
	public static void main (String args[]) {
		
		// criando um professor para teste da classe
		Professor p1 = new Professor("Marco Antoni", "792.370.110-59", "marco.antoni@rolante.ifrs.edu.br", "DI");
		
		System.out.printf(p1.toString() );
		
		// criando uma nova disciplina
		Disciplina poo = new Disciplina("Programação Orientada a Objetos", p1, 66);
		
		System.out.printf(poo.toString() );
		
		// Criando uma nova turma
		Turma turmaPOO26 = new Turma(poo);
		
		// criando os alunos para serem adicionados a turma
		Aluno al01 = new Aluno("Carlos Augusto", "441.864.110-69", "carlos@gmail.com", Aluno.CURSO_ADS, new Data(15, 1, 1995) );
		

		Aluno al02 = new Aluno("Felipe Donato.", "241.314.850-79", "felipe@t", Aluno.CURSO_ADS, new Data(14, 8, 2009) );	
		

		Aluno al03 = new Aluno("Gustavo Souza" , "111.011.890-29", "gustavo@ymail.com", Aluno.CURSO_ADS, new Data (21, 19, 2006) );
	
		Aluno al04 = new Aluno("Cassino Sores" , "411.416.060-46", "cassiano@soares.com", Aluno.CURSO_ADS, new Data (21, 19, 2006) );

		
		// adicionando os alunos à turma
		turmaPOO26.adicionarAluno(al01);
		turmaPOO26.adicionarAluno(al02);
		turmaPOO26.adicionarAluno(al03);
		turmaPOO26.adicionarAluno(al04);
		
		// testando o método que mostra os alunos matriculados
		System.out.printf("Alunos matriculados em POO\n");
		System.out.printf(turmaPOO26.mostrarAlunos() );
		
		// adicionando os encontros - apenas do mes de junho
		turmaPOO26.adicionarEncontro(new Data(3, 6, 2026) );
		turmaPOO26.adicionarEncontro(new Data(10, 6, 2026) );
		turmaPOO26.adicionarEncontro(new Data(17, 6, 2026) );
		turmaPOO26.adicionarEncontro(new Data(24, 6, 2026) );
		
		// testando o método que mostra as datas das aulas
		System.out.printf("As aulas serão em: \n");
		System.out.printf(turmaPOO26.mostrarEncontros() );
		
		// mostrando o método que exibe todas as informações
		turmaPOO26.mostrarRelatorio();
		
	}

}
