public class Lista4Ex1{
	public static void main (String args[]){
		int hChico = 80;
		int hJuca = 60;
		int anos = 0;
		
		while (hJuca < hChico){
			hChico = hChico + 6;
			hJuca = hJuca + 9;
			anos++;
		} 
		
		System.out.printf("São necessários %d anos, até que Juca seja maior que Chico\n", anos);
		System.out.printf("Altura Juca: %d - Altura Chico: %d", hJuca, hChico);
		
	}
}
	
