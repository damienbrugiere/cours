package cours;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMap {

	protected int longueur;
	protected int largeur;
	protected char[][] map;
	protected Personnage player;
	public AbstractMap(int longueur, int largeur, Personnage player) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.map = new char[longueur][largeur];
		this.player = player;
	}

	public void initialiseMap() {
		for (int x = 0; x < longueur; x++) {
			for (int y = 0; y < largeur; y++) {
				this.map[x][y] = '.';
			}
		}
	}

	public void displayMap() {
		for (int x = 0; x < longueur; x++) {
			for (int y = 0; y < largeur; y++) {
				System.out.print(map[x][y]);
			}
			System.out.println();
		}
	}

	public static Map passToMap(AbstractMap map) {
		Map mapReturn = new Map(map.longueur, map.largeur, map.player);
		mapReturn.initialiseMap();
		mapReturn.action(null);
		return mapReturn;
	}

	public static FightingMap passToFightingMap(AbstractMap map) {
		List<Personnage> monsters = new ArrayList<>();
    	map.player.reinitialise();
    	 int nombreAleatoire = 1 + (int)(Math.random() * ((4 - 1) + 1));
         map.player.setX(3);
         map.player.setY(1);
         for (int i = 0 ; i < nombreAleatoire; i ++) {
             monsters.add(new Personnage("monster"+i, 4-i, 3, 20, 5));
         }
    	FightingMap mapReturn =new FightingMap(map.longueur, map.largeur, map.player, monsters);
    	mapReturn.initialiseMap();
    	mapReturn.action(null);
    	return mapReturn;
	}

	public abstract boolean action(String userCommand);
}
