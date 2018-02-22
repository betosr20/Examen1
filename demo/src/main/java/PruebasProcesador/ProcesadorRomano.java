package PruebasProcesador;

public class ProcesadorRomano {

	public int Convierte(String pnumRomano) {
		int numero =0;
		if (pnumRomano == ""){
			return 0;
		}else {
			numero=5;
			switch (pnumRomano) {
				case "I": numero=1;
				break;
				
				case "II": numero=2;
				break;
				
				case "III": numero=3;
				break;
				
				case "IIII": numero=1;
				break;
				
				case "V": numero=5;
				break;
				
				case "X": numero=10;
				break;
				
				case "L": numero=50;
				break;
				
				case "C": numero=100;
				break;
				
				case "D": numero=500;
				break;
				
				case "M": numero=1000;
				break;
			}	
			return numero;
		}
	}
}
