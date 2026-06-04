class Disciplina {
	private String nomeDisc;
	private Professor prof;
	private int cargaHoraria;
	
	public Disciplina(String nomeDisc, Professor prof, int ch) {
		if (nomeDisc.length() > 5) 
			this.nomeDisc = nomeDisc;
		else
			System.out.printf("O nome deve conter mais que 5 caracteres\n");
			
		this.prof = prof;
		
		if (ch == 33 || ch == 66 || ch == 80) 
			this.cargaHoraria = ch;
		else 
			System.out.printf("A carga horária das disciplinas só pode ser 33, 66 ou 80 horas. Verifique a informação digitada.\n");
		
	}
	
	public String toString() {
		return "Disciplina: " + nomeDisc + " Carga horaria: " + cargaHoraria +
			" horas\nProfessor: " + prof.getNome();
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public String getNomeDisc(){
		return nomeDisc;
	}
	
	// escrevendo getProfessor, pois o atributo foi abreviado é agora é dificel renomear todos
	public Professor getProfessor() {
		return prof;
	}
	
}
