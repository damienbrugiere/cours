/**
 * 
 */
package cours;

import java.util.Arrays;
import java.util.List;

/**
 * @author Damien
 *
 */
public class ShopScreen extends Screen{
	private List<Personnage> personnages;

	public ShopScreen(Player player, int longueur, int largeur) {
		super(player,longueur,largeur);
		this.personnages = Arrays.asList(new Personnage("tutu", 0, 0, 50, 10),new Personnage("tyty", 0, 0, 50, 10),new Personnage("tete", 0, 0, 50, 10));
	}

	@Override
	public void display() {
		this.personnages.forEach(iterator -> iterator.displayInformation());
	}

	@Override
	public boolean action(String userCommand) {
		return false;
	}

	@Override
	public void initialiseMap() {
		
	}
	
	

}
