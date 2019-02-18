import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		char controlador = 'S';
		do { 
			System.out.println("para continuar digite S e N para parar");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String resposta = br.readLine();
	        controlador = resposta.charAt(0); 
		} while(controlador != 'N');
	}
}
