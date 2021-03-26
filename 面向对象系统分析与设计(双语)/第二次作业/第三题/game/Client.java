package game;

/**
 * @author QiuQian
 */
public class Client {

	public static void main(String[] args) {
		Scene scene = new Scene();
		Gold gold = scene.golds.get(13);
		Diamond diamond = scene.diamonds.get(3);
		scene.cage.take(50, gold);
		scene.cage.take(100, diamond);
	}

}
