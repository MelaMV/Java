package E16;
import java.util.Scanner;
public class main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String contraseña = "Lobo";
		
		final int INTENTOS=3;
		
		//Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
		boolean acierto=false;
		
		 String Password;
		
		for (int i=0;i<INTENTOS&&!acierto;i++) {
			System.out.println("Introduce una contraseña");
			Password = sc.next();
			
			//Comprobamos si coincide, no usamos==, usamos el metodo equals
			
			if (Password.equals(contraseña)){
				System.out.println("Lo hiciste, acertaste");
				acierto=true;
				
			 
			}
			
		}
		
	}
}
