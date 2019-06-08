package cours;

import java.util.List;
import java.util.Optional;

public abstract class Personnage {
    private String name;
    private int x;
    private int y;
    private int hp;
	private List<Skill> skills;
    private int fightLife;

    protected Personnage(String name, int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.name = name;
        this.fightLife = hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void takeDmg(int dmg) {
        if (this.isAlive()) {
            this.fightLife -= dmg;
        }
    }

    public boolean isAlive() {
        return this.fightLife > 0;
    }

    public void displayInformation() {
        System.out.println(this.name + " :\nhp : " + this.fightLife + "/" + this.hp);
    }

    public void reinitialise(){
        this.fightLife = hp;
    }
    
    public String getName() {
		return name;
	}
    
    public int getFightLife() {
		return fightLife;
	}
    public void heal(int heal) {
    	if(this.isAlive()) {
    		this.fightLife+=heal;
    		if(this.fightLife>this.hp) {
    			this.fightLife = this.hp;
    		}
    	}
    }
    
	public void attackWithSkill(String name, List<Hero> heroes,List<Monster> monsters){
		Optional<Skill> skillOptional = this.skills.stream().filter(iterator -> iterator.getName().equals(name)).findFirst();
		if(skillOptional.isPresent()) {
			skillOptional.get().action(heroes,monsters);
		}
	}
}
