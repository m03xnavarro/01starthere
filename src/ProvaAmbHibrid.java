import java.util.Scanner;


public class ProvaAmbHibrid {

	public static void main(String[] args) {
		CotxeHibrid myCar = new CotxeHibrid();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdueix la marca del cotxe:");
		myCar.marca = entrada.nextLine();
		
		System.out.println("Introdueix el model del cotxe:");
		myCar.model = entrada.nextLine();
		
		System.out.println("Introdueix el nombre de cilindres:");
		myCar.cilindres = Integer.parseInt(entrada.nextLine());

		System.out.println("Introdueix la cilindrada:");
		myCar.cilindrada = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Introdueix els kW del motor elèctric:");
		myCar.potMotElec = Integer.parseInt(entrada.nextLine());
		
		myCar.calculaPotenciaFiscal(myCar.cilindres, myCar.cilindrada, myCar.potMotElec);
		
		System.out.println("");
		System.out.println("El " + myCar.marca + " " + myCar.model + " té "
				+ myCar.potenciaFiscal + " cavalls fiscals");
		entrada.close();

	}

}
