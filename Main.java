package clases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Poner el nombre de la persona y crear el array con sus 6 pokemon.
		System.out.print("Com et dius?: ");
		String trainer = sc.next();

		sc.nextLine();

		//CREACION POKEMONS DE LA PERSONA
		System.out.println("\n\nBenvingut "+trainer+", sisplau escull el nom per cadascun dels teus pokemon:");
		String[] player_pokemons = new String[6];
		for (int i = 0; i != 6; i++) {
			player_pokemons[i] = sc.next();
		}

		System.out.println(Arrays.toString(player_pokemons));

		//LISTA DE POKEMONS DE BOOT
		String[] boot_pokemons = {"a","b","c","d","e","f","g","h","i","j"};

		int opt = -1;
		do {
			System.out.println("\n\nLluïta Pokemon entre "+trainer+" i Boot"
					+ "\n\n1) Lluitar\n2) Jugar altra vegada\n3) Acabar Partida\n\nQue vols fer?");
			System.out.print("Option:");

			sc.nextLine();
			if (!sc.hasNextInt()){
				System.out.println("\n\n"
						+ "=======================================================\n"
						+ "The given option has to be an integer, "
						+ "please try again.\n=======================================================\n\n");
				sc.nextLine();
			}else {
				opt = sc.nextInt();
				sc.nextLine();

				switch (opt) {
					case 1:
						System.out.println("caso "+opt);
						break;
					case 2:
						System.out.println("caso "+opt);
						break;
					case 3:
						System.out.println("=========================="
								+ "\n||        THE END       ||"
								+ "\n==========================");
						break;
					default:
						System.out.println("\n\n"
								+ "========================================\n"
								+ opt+" is not a valid option, please ty again.\n========================================\n\n");
						break;

				}

			}
		}while (opt != 3);

	}

}
