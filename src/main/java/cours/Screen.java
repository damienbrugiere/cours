/**
 * 
 */
package cours;

/**
 * @author Damien
 *
 */
public abstract class Screen {
	protected Player player;
	protected int longueur;
	protected int largeur;
	
	protected Screen(Player player, int longueur,int largeur) {
		super();
		this.player = player;
		this.longueur =longueur;
		this.largeur = largeur;
	}
	public abstract void display();
	public abstract boolean action(String userCommand);
	public abstract void initialiseMap();
}
