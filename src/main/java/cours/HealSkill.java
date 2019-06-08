/**
 * 
 */
package cours;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Damien
 *
 */
public class HealSkill extends Skill{
	private int heal,number;
	
	protected HealSkill(String name,int heal,int number) {
		super(name);
		this.heal = heal;
		this.number = number;
	}

	@Override
	public void action(List<Hero> heroes, List<Monster> monsters) {
		if(heroes==null || heroes.size()>0 ) {
			return;
		}
		heroes.stream().forEach(iterator -> iterator.heal(this.heal));
	}

	@Override
	public List<Personnage> chose(List<Hero> heroes, List<Monster> monsters) {
		List<Monster> monstersAlive=monsters.stream().filter(iterator -> iterator.isAlive()).collect(Collectors.toList());
		List<Monster> monstersSorted = monstersAlive.stream().sorted((hp, hp1) -> Integer.compare(hp.getFightLife(), hp1.getFightLife())).collect(Collectors.toList());;
		List<Personnage> monstersReturned = new ArrayList<>();
		int numberOfElements = this.number;
		if(this.number<monstersReturned.size()) {
			numberOfElements = monstersReturned.size();
		}
		for(int i =0;i<numberOfElements;i++) {
			monstersReturned.add(monstersSorted.get(i));
		}
		return monstersReturned;
	}

}
