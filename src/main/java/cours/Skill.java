package cours;

import java.util.List;

public abstract class Skill {
	private String name;
	
	protected Skill(String name) {
		super();
		this.name = name;
	}
	
	public abstract void action(List<Hero> heroes, List<Monster> monsters);
	public abstract List<Personnage> chose(List<Hero> heroes,List<Monster> monsters);
	
	public String getName() {
		return name;
	}
}
