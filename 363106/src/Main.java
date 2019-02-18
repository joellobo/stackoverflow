import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/*
	public static void main(String[] args) throws IOException {
		char controlador = 'S';
		do { 
			System.out.println("para continuar digite S e N para parar");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String resposta = br.readLine();
	        controlador = resposta.charAt(0); 
		} while(controlador != 'N');
	}
	*/
	
	public static void main(String[] args) throws IOException {
		String resposta = null;
		do { 
			System.out.println("Digite: S para continuar e N para parar");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            resposta = br.readLine();
		} while(resposta != null && resposta.charAt(0) != 'N');
	}

}
