package cours;

public abstract class AbstractMap {

    protected int longueur;
    protected int largeur;
    protected char[][] map;

    public AbstractMap(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.map = new char[longueur][largeur];
    }

    public void initialiseMap(){
        for (int x = 0; x<longueur; x++){
            for (int y = 0; y<largeur; y++){
               this.map[x][y] = '.';
            }
        }
    }

    public void displayMap(){
        for (int x = 0; x<longueur; x++){
            for (int y = 0; y<largeur; y++){
                System.out.print(map[x][y]);
            }
            System.out.println();
        }
    }
    public abstract boolean action(String userCommand);
}
