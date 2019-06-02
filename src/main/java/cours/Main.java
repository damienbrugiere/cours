package cours;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Damien
 *
 */
public class Main {

	public static void main(String[] args) {
		Player player = new Player( 0, 0, Arrays.asList(new Personnage("soldier", 0, 0, 100, 20)));
		Screen map = new Map(5, 5, player);
		Scanner scanner = new Scanner(System.in);
		String userCommand = null;
		boolean fightingMode = false;
		boolean changeMode = false;
		do {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			if("open shop".equals(userCommand)) {
				map = ScreenFactory.passToShopScreen((AbstractMap)map);
			}else if("exit shop".equals(userCommand)) {
				map = ScreenFactory.passToMap(map);
			}
			map.initialiseMap();
			changeMode = map.action(userCommand);
			if (changeMode && fightingMode) {
				map = ScreenFactory.passToMap((AbstractMap) map);
				changeMode = false;
				fightingMode = false;
			} else if (changeMode && !fightingMode) {
				changeMode = false;
				fightingMode = true;
				map = ScreenFactory.passToFightingMap((AbstractMap) map);
			}
			map.display();
			userCommand = scanner.nextLine();
		} while (!"exit".equals(userCommand));

	}
}
