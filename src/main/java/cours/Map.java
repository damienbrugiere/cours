package cours;

public class Map extends  AbstractMap{
    private int x,y;
    public Map(int longueur, int largeur, Player player) {
        super(longueur, largeur,player);
        this.x = 4;
        this.y = 3;

    }

    public boolean action(String userCommand){
        this.map[this.x][this.y]='m';
        if(userCommand == null){
            this.map[player.getX()][player.getY()]='o';
            return false;
        }
        switch (userCommand){
            case "z":
                this.player.top();
                break;
            case "s":
                this.player.bottom(longueur-1);
                break;
            case "q":
                this.player.left();
                break;
            case "d":
                this.player.right(largeur-1);
                break;
        }
        if(this.map[player.getX()][player.getY()]!='m'){
            this.map[player.getX()][player.getY()]='o';
        }else{
        
            this.map[player.getX()][player.getY()]='o';
            return true;
        }
        return false;
    }
}
