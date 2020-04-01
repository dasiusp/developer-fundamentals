import java.util.Scanner;
class MdSuicida {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		double mdProva = input.nextDouble();
		double mdTrab = input.nextDouble();
		double mdFinal;
		if (mdTrab < 5 || mdProva < 5) {
			if (mdProva <= mdTrab) mdFinal = mdProva;
			else mdFinal = mdTrab;
		} else mdFinal = (0.6 * mdProva) + (0.4 * mdTrab);
		System.out.println("Sua media final eh: " + mdFinal );
	}
}
