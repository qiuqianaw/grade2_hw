package game;

/**
 * @author QiuQian
 */
public abstract class Character {

	protected String name;

	public Character(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void take(int quantity, Treasure treasure);

}
