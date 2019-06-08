/**
 * 
 */
package cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Damien
 *
 */
public class ShopScreen extends Screen{
	private List<Hero> heros;

	public ShopScreen(Player player, int longueur, int largeur) {
		super(player,longueur,largeur);
		this.heros = new ArrayList<>(Arrays.asList(new Hero("tutu", 0, 0, 50, 10),new Hero("tyty", 0, 0, 50, 10),new Hero("tete", 0, 0, 50, 10)));
	}

	@Override
	public void display() {
		System.out.println("gold : " + this.player.getGold()+" po");
		this.heros.forEach(iterator -> {System.out.println("gold : " + iterator.getPrice() + " po");iterator.displayInformation();});
	}

	@Override
	public boolean action(String userCommand) {
		if(userCommand.contains("purchase")) {
			String heroName = userCommand.substring(9);
			Optional<Hero> heroPresent = this.heros.stream().filter(iterator -> iterator.getName().equals(heroName)).findFirst();
			if(heroPresent.isPresent()) {
				boolean added = player.purchasePersonnage(heroPresent.get());
				if(added) {
					heros.remove(heroPresent.get());
				}
			}
		}
		return false;
	}

	@Override
	public void initialiseMap() {
		
	}
	
	

}
