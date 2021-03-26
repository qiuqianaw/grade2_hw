package game;

import java.util.ArrayList;

/**
 * @author QiuQian
 */
public abstract class Treasure {

	protected int quantity;

	public Treasure(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected ArrayList<Eudemon> eudemons = new ArrayList<>();

	public ArrayList<Eudemon> getEudemons() {
		return eudemons;
	}

	public abstract void guard(Eudemon eudemon);

	public abstract void unguard(Eudemon eudemon);

	public abstract void notifyEudemon(Character character);

}
