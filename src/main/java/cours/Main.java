package cours;

import java.util.Scanner;

/**
 * @author Damien
 *
 */
public class Main {

	public static void main(String[] args) {
		Personnage player = new Personnage("Player", 0, 0, 100, 20);
		AbstractMap map = new Map(5, 5, player);
		Scanner scanner = new Scanner(System.in);
		String userCommand = null;
		boolean fightingMode = false;
		boolean changeMode = false;
		do {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			map.initialiseMap();
			changeMode = map.action(userCommand);
			if (changeMode && fightingMode) {
				map = AbstractMap.passToMap(map);
				changeMode = false;
				fightingMode = false;
			} else if (changeMode && !fightingMode) {
				changeMode = false;
				fightingMode = true;
				map = AbstractMap.passToFightingMap(map);
			}
			map.displayMap();
			userCommand = scanner.nextLine();
		} while (!"exit".equals(userCommand));

	}
}
