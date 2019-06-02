package cours;

public class Personnage {
    private String name;
    private int x;
    private int y;
    private int hp;
    private int dmg;
    private int fightLife;

    public Personnage(String name, int x, int y, int hp, int dmg) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.dmg = dmg;
        this.name = name;
        this.fightLife = hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void attack(Personnage personnage) {
    	if(this.isAlive()) {
    		personnage.takeDmg(this.dmg);    		
    	}
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
        System.out.println(this.name + " :\nhp : " + this.fightLife + "/" + this.hp + "\ndmg : " + this.dmg);
    }

    public void reinitialise(){
        this.fightLife = hp;
    }
    
    public String getName() {
		return name;
	}
}
