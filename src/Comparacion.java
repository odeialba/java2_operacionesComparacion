import java.util.Scanner;

public class Comparacion {
	public static void main(String[] args){
		System.out.println("Hola");
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nInserta un numero:\n");
		num1 = sc.nextInt();

		System.out.print("\nInserta otro numero:\n");
		num2 = sc.nextInt();
		if (num1 == num2){
			System.out.print("\nLos numeros insertados son iguales.\n");
		}
		if (num1 != num2){
			System.out.print("\nLos numeros insertados son diferentes.\n");
		}
		if (num1 > num2){
			System.out.print("\nEl primer numero es mas grande que el segundo numero.\n");
		}
		if (num1 < num2){
			System.out.print("\nEl primer numero es mas pequeño que el segundo numero.\n");
		}
		if ((num1 < 5)||(num2 < 5)){
			System.out.print("\nUno de los dos numeros es mas pequeño que 5.\n");
		}
		if ((num1 < 5)&&(num2 < 5)){
			System.out.print("\nLos dos numeros son mas pequeños que 5.\n");
		}
	}
}


