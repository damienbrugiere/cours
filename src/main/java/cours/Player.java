/**
 * 
 */
package cours;

import java.util.List;

/**
 * @author Damien
 *
 */
public class Player {
	private int x, y;
	private List<Personnage> team;

	public Player(int x, int y, List<Personnage> team) {
		super();
		this.x = x;
		this.y = y;
		this.team = team;
	}

	public List<Personnage> getTeam() {
		return team;
	}

	public void purchasePersonnage(Personnage personnage) {
		this.team.add(personnage);
	}

	public void removePersonnage(String name) {
		this.team.removeIf(iterator -> iterator.getName().equals(name));
	}

	public void reinitialise() {
		this.team.forEach(iterator -> iterator.reinitialise());
	}

	public void updateCoordonate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

    public void left() {
        if (this.y != 0)
            this.y--;
    }

    public void right(int max) {
        if (this.y != max)
            this.y++;
    }

    public void top() {
        if (this.x != 0)
            this.x--;
    }

    public void bottom(int max) {
        if (this.x != max)
            this.x++;
    }
}
