package cours;

public abstract class AbstractMap extends Screen {


	protected char[][] map;
	public AbstractMap(int longueur, int largeur, Player player) {
		super(player,longueur,largeur);
		this.map = new char[longueur][largeur];
	}

	public void initialiseMap() {
		for (int x = 0; x < longueur; x++) {
			for (int y = 0; y < largeur; y++) {
				this.map[x][y] = '.';
			}
		}
	}
		
	@Override
	public void display() {
		for (int x = 0; x < longueur; x++) {
			for (int y = 0; y < largeur; y++) {
				System.out.print(map[x][y]);
			}
			System.out.println();
		}
	}

}
