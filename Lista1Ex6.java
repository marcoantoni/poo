public class Lista1Ex6{

	public static void main (String args[]){
		int dia = 17, mes = 4, ano = 2023;
		
		String msg = dia + " de ";
		
		switch (mes) {
			case 1: 
				msg += "janeiro";
				break;
			case 2: 
				msg += "fevereiro";
				break;
			case 3:
				msg += "março";
				break;
			case 4:
				msg += "abril";
				break;
			case 5:
				msg += "maio";
				break;
			case 6:
				msg += "junho";
				break;
			case 7:
				msg += "julho";
				break;
			case 8:
				msg += "agosto";
				break;
			case 9:
				msg += "setembro";
				break;
			case 10:
				msg += "outubro";
				break;
			case 11:
				msg += "novembro";
				break;
			default:
				msg += "dezembro";
		}
		
		msg += " de " + ano;
		
		System.out.println(msg);
	}
} 
