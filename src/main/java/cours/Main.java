package cours;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Damien
 *
 */
public class Main {

	public static void main(String[] args)  {
		char[][] terrain = new char[4][4];
		int persoI = 0;
		int persoJ = 0;
		String in = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\033[H\033[2J");  
			System.out.flush();
			if ("z".equals(in) && persoI != 0) {
				persoI--;
			}

			if ("q".equals(in) && persoJ != 0) {
				persoJ--;
			}
			if ("d".equals(in) && persoJ != 4) {
				persoJ++;
			}
			if ("s".equals(in) && persoI != 4) {
				persoI++;
			}
			display(terrain, persoI, persoJ);
			in = sc.nextLine();
		} while (!"exit".equals(in));

	}

	private static void display(char[][] terrain, int persoI, int persoJ) {
		for (int i = 0; i <= terrain.length; i++) {
			for (int j = 0; j <= terrain[0].length; j++) {
				if (i == persoI && j == persoJ) {
					System.out.print("o");
				} else {
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}
	}

}
