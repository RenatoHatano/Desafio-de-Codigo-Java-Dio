import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		if(horasaida+tempoviagem+fuso >= 24){
		  System.out.println(horasaida+tempoviagem+fuso-24);
		}
		
		else { System.out.println(horasaida+tempoviagem+fuso);}
	
		
		sc.close();
	}
}