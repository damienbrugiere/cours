package cours;

import java.util.ArrayList;
import java.util.List;

public abstract class ScreenFactory {
	

	public static Map passToMap(Screen map) {
		Map mapReturn = new Map(map.longueur, map.largeur, map.player);
		mapReturn.initialiseMap();
		mapReturn.action(null);
		return mapReturn;
	}

	public static FightingMap passToFightingMap(Screen map) {
		List<Monster> monsters = new ArrayList<>();
    	map.player.reinitialise();
    	 int nombreAleatoire = 1 + (int)(Math.random() * ((4 - 1) + 1));
         map.player.updateCoordonate(3, 1);
         for (int i = 0 ; i < nombreAleatoire; i ++) {
             monsters.add(new Monster("monster"+i, 4-i, 3, 20));
         }
    	FightingMap mapReturn =new FightingMap(map.longueur, map.largeur, map.player, monsters);
    	mapReturn.initialiseMap();
    	mapReturn.action(null);
    	return mapReturn;
	}
	
	public static ShopScreen passToShopScreen(Screen map) {
		return new ShopScreen(map.player,map.longueur,map.largeur);
	}
}
