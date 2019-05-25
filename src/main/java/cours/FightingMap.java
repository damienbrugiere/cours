package cours;

import java.util.List;

public class FightingMap extends AbstractMap {
    private Personnage player;
    private List<Personnage> monsters;

    public FightingMap(int longueur, int largeur, Personnage player, List<Personnage> monsters) {
        super(longueur, largeur);
        this.player = player;
        this.monsters = monsters;
    }

    @Override
    public boolean action(String userCommand) {
        this.monsters.forEach(m->map[m.getX()][m.getY()]='m');
        this.map[player.getX()][player.getY()]='o';
        if(userCommand == null){
            return false;
        }
        if (userCommand.contains("attack")) {
            String number = userCommand.substring(7, 8);
            if (number == null) {
                return false;
            }
            Personnage m = monsters.get(0);
            player.attack(m);
        }
        monsters.forEach(m-> m.attack(player));
        if (!player.isAlive()) {
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
    public void displayMap() {
        super.displayMap();
        player.displayInformation();
        monsters.forEach(m -> m.displayInformation());
    }
}
