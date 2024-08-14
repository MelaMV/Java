package E17;
import java.util.Scanner;

public class E17 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un dia de la semana");
		String dia = sc.next();
		switch (dia) {
		case "Lunes":
		case "Martes":
		case "Miercoles":
		case "Jueves":
		case "Viernes":
			System.out.println("Es un dia laboral");
			break;
		case "Sabado":
		case "Domingo":
			System.out.println("Es un fin de semana");
			default:
			System.out.println("Introduzca nuevamente");
		}
	}
	

}
