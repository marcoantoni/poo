public class Lista1Ex6{

	public static void main (String args[]){
		int dia = 17, mes = 4, ano = 2023;
				
		// código com 36 linhas usando switch
		
		String meses[] = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		String msg = dia + " de " + meses[mes]  +" de " + ano;
		
		System.out.println(msg);
	}
} 
