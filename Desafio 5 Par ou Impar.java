import java.io.IOException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	
    	String[] saida = new String[N];
    	int valor;
    	
    	for (int i = 0; i < N; i++) {
    		
    	valor = leitor.nextInt();
    	if(valor > 0){
    		  
    
                if(valor % 2 == 0){
                         saida[i] = "EVEN POSITIVE";
    		    
                }else{
    	        saida[i] = "ODD POSITIVE";
    		  }
    		  
    		}else if(valor < 0){
    		  
    		  if(valor % 2 == 0){
    		    saida[i] = "EVEN NEGATIVE";
    		    
    		  }else{
    		    saida[i] = "ODD NEGATIVE";
    		  }
    		  
    		}else{
    		  saida[i] = "NULL";
    		  
    		}
    	}
    	
    	for(int i=0;i<N;i++){
    	  
    	  System.out.println(saida[i]);
  	}
	}
}