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

	public static void main(String[] args) {
		char[][] terrain = new char[4][4];
		int persoI = 0;
		int persoJ = 0;
		String in = null;
		Scanner sc = new Scanner(System.in);
		do {
			if (in != null) {
				switch (in) {
				case "z":
					if(persoI!=0) {
						persoI--;
					}
					break;
				case "q":
					if(persoJ!=0) {
						persoJ--;
					}
					break;
				case "d":
					if(persoJ!=4) {
						persoJ++;
					}
					break;
				case "s":
					if(persoI!=4) {
						persoI++;
					}
					break;
				default:
					break;
				}
			}
			display(terrain, persoI, persoJ);
			in = sc.nextLine();
		} while (!in.equals("exit"));

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
