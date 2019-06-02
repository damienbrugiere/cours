package cours;

import java.util.List;
import java.util.stream.Collectors;

public class FightingMap extends AbstractMap {
    private List<Personnage> monsters;
    private List<Personnage> players;
    public FightingMap(int longueur, int largeur, Player player, List<Personnage> monsters) {
        super(longueur, largeur,player);
        this.monsters = monsters;
        this.players = player.getTeam();
    }

    @Override
    public boolean action(String userCommand) {
        this.monsters.forEach(m->map[m.getX()][m.getY()]='m');
        this.players.forEach(p->map[p.getX()][p.getY()]='0');
        if(userCommand == null){
            return false;
        }
        if (userCommand.contains("attack")) {
            String number = userCommand.substring(7, 8);
            String[] test = userCommand.split(" attack ");
            Personnage player = this.players.stream().filter(p -> test[0].equals(p.getName())).findFirst().get();
            Personnage monster = this.monsters.stream().filter(p -> test[1].equals(p.getName())).findFirst().get();
            player.attack(monster);
        }
        monsters.forEach(m->{ 
        	List<Personnage> playersAlive = this.players.stream().filter(p -> p.isAlive() ).collect(Collectors.toList());
        	if(playersAlive == null || playersAlive.isEmpty()) {
        		return;
        	}
        	 int nombreAleatoire = (int)(Math.random() * ((playersAlive.size()-1 )));
        	 m.attack(playersAlive.get(nombreAleatoire));
        	});
        if (players.stream().allMatch(p -> !p.isAlive())) {
            System.out.println("Loose!");
            return true;
        }
        if (monsters.stream().allMatch(m -> !m.isAlive())) {
            System.out.println("Victory!");
            return true;
        }
        return false;

    }

    @Override
    public void display() {
        super.display();
        players.forEach(p -> p.displayInformation());
        monsters.forEach(m -> m.displayInformation());
    }
}
