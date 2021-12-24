import java.util.Scanner;
import java.math.BigInteger;

public class Main {
public static void main(String[] args) {
	  
	  
try (var ler = new Scanner(System.in)) {
	    
int n = ler.nextInt(),valores;
			
BigInteger contador = BigInteger.valueOf(1);
BigInteger somador = BigInteger.valueOf(1);
			
for(int i=0;i<n;i++) {
			  
valores = ler.nextInt();

for(int x=1;x<valores;x++) {
				  
contador = contador.multiply(BigInteger.valueOf(2));
somador = somador.add(contador);
				}	
				
somador = somador.divide(BigInteger.valueOf(12));
somador = somador.divide(BigInteger.valueOf(1000));
				
	System.out.println(somador+" kg");
				
somador = BigInteger.valueOf(1);
contador = BigInteger.valueOf(1);	
			}
		}
	}	
}
