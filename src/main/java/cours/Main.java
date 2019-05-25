package cours;

/**
 *
 */

import java.util.ArrayList;
import java.util.List;
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
        List<Personnage> monsters = new ArrayList<>();
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            map.initialiseMap();
            changeMode = map.action(userCommand);
            if (changeMode && fightingMode) {
                player.reinitialise();
                map = new Map(5, 5, player);
                changeMode = false;
                fightingMode = false;
                map.initialiseMap();
                map.action(null);
            } else if (changeMode && !fightingMode) {
                changeMode = false;
                fightingMode = true;
                Personnage monster = new Personnage("monster", 3, 3, 20, 5);
                player.setX(3);
                player.setY(1);
                monsters.clear();
                monsters.add(monster);
                map = new FightingMap(5, 5, player, monsters);
                map.initialiseMap();
                map.action(null);
            }
            map.displayMap();
            userCommand = scanner.nextLine();
        } while (!"exit".equals(userCommand));

    }
}
