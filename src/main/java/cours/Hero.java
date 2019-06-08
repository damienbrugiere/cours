package cours;

import java.util.List;

public class Hero extends Personnage {
	private int price;
	private List<Skill> skills;
	protected Hero(String name, int x, int y, int hp, int price) {
		super(name, x, y, hp);
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
