import java.util.ArrayList;

class Turma {
	private Disciplina disc;
	private ArrayList<Aluno> alunos;
	private ArrayList<Data> encontros;
	private static int qtdMatriculos;
	
	public static final int MAX_ALUNOS = 3;
	
	public Turma(Disciplina disc) {
		
		this.disc = disc;
		
		alunos = new ArrayList<>();
		encontros = new ArrayList<>();
		
		qtdMatriculos = 0;
	}
	
	public void adicionarAluno(Aluno al) {
		
		if (qtdMatriculos < MAX_ALUNOS){
			alunos.add(al);
			qtdMatriculos++;
			System.out.printf("%s matriculado \n", al.getNome() );
		} else {
			System.out.printf("Não é possível matricular o aluno, pois a turma está cheia com %d alunos \n", MAX_ALUNOS);
		}
		
	}
	
	public String mostrarAlunos() {
		String saida = "";
		
		for (Aluno aluno : alunos) {
			saida += aluno.getNome() + "\n";
		}
		
		return saida;
		
	}
	
	public void adicionarEncontro(Data dataAula) {
		encontros.add(dataAula);
	}
	
	public String mostrarEncontros() {
		
		String saida = "";
		
		for (Data aula : encontros) {
			saida += aula.escreverAbreviado() + " " ;
		}
		
		return saida + "\n";
	
	}
	
	public void mostrarRelatorio() {
		System.out.printf("Disciplina: %s    Carga horária: %d horas \n", disc.getNomeDisc(), disc.getCargaHoraria() );
		System.out.printf("Professor: %s \n", disc.getProfessor().getNome() );
		System.out.printf("Existem %d alunos matriculados. São eles: \n ", qtdMatriculos);
		System.out.printf(mostrarAlunos() );
		System.out.printf("As aulas serão nas datas de: \n");
		System.out.printf(mostrarEncontros() );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
